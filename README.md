NetBeaveR (Data Pipeline Base System)
Overview
NetBeaveR is a full-stack data pipeline designed as a reusable base system for processing various datasets. This project integrates:

R (via RStudio) for data analytics and processing
Java (via NetBeans IDE) for building a user interface and core application logic
SQLite (managed with DBeaver) for database storage and management
The goal of this project is to create a modular, extensible foundation that can ingest, process, and analyze different datasets by swapping data sources and building on the analytics or interface over time. This is my first solo project, created to establish a scalable workflow for future data-driven applications.

Project Structure

data-pipeline/
├NetBeaveR/
├── build/               # Compiled files and build-related outputs
├── data/                # Datasets, SQLite DB files, or processed outputs
│   └── database/        # SQLite database files
├── docs/                # Documentation (e.g., this README, folder_structure.png)
│   ├── connections/     # Database connection settings and documentation
│   └── folder structure/ # Documentation on folder organization
├── maintenance/         # Ongoing tasks (e.g., backups, updates)
├── scripts/             # Utility and setup scripts
│   ├── R/               # R scripts for analytics (RStudio)
│   ├── setup/           # Initial setup scripts
│   └── SQL/             # SQL queries and schema (DBeaver/SQLite)
├── src/                 # Main source code
│   └── JAVA/            # Java code for interface and logic (NetBeans)
├── tests/               # Test scripts for R and Java
└── config/              # Configuration files (e.g., SQLite connection settings)

Prerequisites
To run this project, ensure you have the following installed:

R: Version 4.x or higher (via RStudio; packages such as RSQLite, dplyr)
Java: JDK 17 or higher (via NetBeans IDE)
Maven: For managing Java dependencies in NetBeans
DBeaver: Version 23.x or higher, configured for SQLite
SQLite: A lightweight database (no separate server required)

Setup Instructions
1. Clone the Repository

git clone <repo_url>
cd data-pipeline

2. Database Setup
Install SQLite if not already present (usually bundled with DBeaver).
Open DBeaver, create a new SQLite connection, and point it to data/database.sqlite (create this file if it doesn’t exist).
Run the SQL script scripts/setup/setup_db.sql to initialize the schema.
3. Load Initial Data
Place a sample dataset (e.g., sample.csv) in the data/ directory.

Open RStudio, set the working directory to the project root, and run:
Rscript scripts/setup/load_data.R
This script will connect to SQLite (via RSQLite) and load the data into the database.

4. Build and Run the Java Interface
Open the src/Java/ folder as a project in NetBeans IDE.
Ensure the SQLite JDBC driver (e.g., sqlite-jdbc-3.x.jar) is in the config/ folder or added to the NetBeans project libraries.
Build and run the project using Maven in NetBeans to launch the interface.
5. Test the Pipeline
Check the tests/ folder for sample tests (e.g., tests/test_analytics.R for R, tests/TestApp.java for Java).
Run R tests in RStudio or Java tests in NetBeans.
Key Features
Data ingestion from CSV files into SQLite (via R).
Basic Java interface for viewing results (built in NetBeans).
SQLite database schema for storing processed data.
Performance optimizations, including:
Connection pooling via HikariCP.
PRAGMA settings (e.g., synchronous=OFF, journal_mode=WAL) for improved SQLite performance.
Indexes on frequently queried columns to speed up query execution.

Usage
Add a New Dataset
Drop the new dataset into the data/ folder.
Adjust the load_data.R script if needed and rerun it to load the new data.
Extend Analytics
Add R scripts to src/R/ in RStudio to extend the analytics.
Modify the Java interface in src/Java/ via NetBeans to reflect new features.
Query Data
Use DBeaver to explore data/database.sqlite or tweak queries in src/SQL/.

Future Goals
Support additional dataset formats (e.g., JSON, Excel).
Enhance the Java UI with interactive features.
Automate the pipeline with a single command.

License
TBD (to be determined).
