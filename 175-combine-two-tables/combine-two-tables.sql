# Write your MySQL query statement below

# left join
SELECT firstName, lastName, city, state
FROM Person
LEFT JOIN Address
ON Person.personId = Address.PersonId;
