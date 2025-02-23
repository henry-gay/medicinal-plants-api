# Database Schema

The following entities and relationships form the database structure:

## Plant

- ```id``` (Primary Key)

- ```common_name```

- ```scientific_name```

- ```description```

- ```habitat_cultivation```

## PlantPart

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```name```

- ```description```

## Constituent

- ```id``` (Primary Key)

- ```name```

- ```type```

- ```effects```

## PlantConstituent (Many-to-Many Relationship)

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```constituent_id``` (Foreign Key to Constituent)

## MedicinalUse

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```use_case```

- ```details```

## Preparation

- ```id``` (Primary Key)

- ```plant_id``` (Foreign Key to Plant)

- ```method```

- ```instructions```