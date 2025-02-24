# Database Schema

The following entities and relationships form the database structure:

## Plant

- ```id``` (Primary Key)

- ```common_name``` (String)

- ```scientific_name``` (String)

- ```description``` (String)

- ```habitat_cultivation``` (String)

## PlantPart

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```name``` (String)

- ```description``` (String)

## Constituent

- ```id``` (Primary Key)

- ```name``` (String)

- ```type``` (String)

- ```effects``` (String)

## PlantConstituent (Many-to-Many Relationship)

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```constituent_id``` (Foreign Key to Constituent)

## MedicinalUse

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```use_case``` (String)

- ```details``` (String)

## Preparation

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```method``` (String)

- ```instructions``` (String)