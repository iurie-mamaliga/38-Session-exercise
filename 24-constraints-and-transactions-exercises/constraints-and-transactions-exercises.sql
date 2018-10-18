-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (first_name, last_name)
VALUES ('HAMPTON', 'AVENUE'),
        ('LISA', 'BYWAY')
        ;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198 )
;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
 
INSERT INTO film_actor (actor_id, film_id)
VALUES (201, 1001),
        (202, 1001)
;
-- 4. Add Mathmagical to the category table.

INSERT INTO category (name)
VALUES ('Mathmagical')
;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--First I inserted the category_id for new movie

INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17);

--Then I did query to find the film_id, title and category_id of given films

SELECT film.film_id AS film_id, film.title, film_category.category_id
FROM film
Join film_category
ON film_category.film_id = film.film_id
WHERE film.title IN ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

--Finally I updated the category_id to "Mathmagical"

UPDATE film_category
SET category_id = 17
WHERE film_id IN (274, 494, 714, 996, 1001)
        ;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)


UPDATE film
SET rating = 'G'
FROM film_category
WHERE film_category.film_id = film.film_id AND category_id = 17
;

-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1),
        (1001, 2)
;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

DELETE FROM film
WHERE film_id = 1001
;

--Deleting film "Euclidean PI" was unsuccessful because deleting "film" violates foreign key 
--constraints film_id, film_actor foreign_key.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

DELETE FROM category
WHERE name = 'Mathmagical'
;
--Deleting "Mathmagical" from category table was unsuccessful because deleting "Mathmagical"
--violates foreign key constraints "film_category_category_id foreign_key" on table "film_category".

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = 17
;

--Yes, it was successful because film_category was the final point where category_id was assigned and it
--was not assign to any other tables further from that point.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

DELETE FROM category
WHERE name = 'Mathmagical'
;

DELETE FROM film
WHERE film_id = 1001
;

-- Deleting "Mathmagical" from category table was successful because "Mathmagical" is not assigned
--to any other foreign table anymore.
--deleting the movie "Euclidean PI" was unsuccessful because it is still violating the constraints with
-- film_actor table.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
WHERE column_name = 'film_id'

--Inorder to delete film "Euclidean PI" from the database it should not be assigned to any other tables.
-- Here the film_id of "Euclidean PI" is assigned to actor, film_category, and inventory as foreign key.
-- Inorder to delete "Euclidean PI" we ust delete those data first.
