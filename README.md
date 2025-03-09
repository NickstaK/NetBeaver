NetBeaveR (Data Pipeline Base System)

Overview

This project is a full-stack data pipeline designed as a reusable base system for processing various datasets. It integrates:

R (via RStudio) for data analytics and processing.
Java (via NetBeans IDE) for building a user interface and core application logic.
SQLite (managed with DBeaver) for database storage and management.
The goal is to create a modular, extensible foundation that can ingest, process, and analyze different datasets by swapping data sources and building on the analytics or interface over time. This is my first solo project, built to establish a scalable workflow for future data-driven applications.

Project Structure

NetBeaveR/

build/ - Compiled files and build-related outputs
data/ - Datasets, SQLite DB files, or processed outputs
database/ - SQLite database files
docs/ - Documentation (e.g., this README, folder_structure.png)
connections/ - Database connection settings and documentation
folder structure/ - Documentation on folder organization
maintenance/ - Ongoing tasks (e.g., backups, updates)
scripts/ - Utility and setup scripts
R/ - R scripts for analytics (RStudio)
setup/ - Initial setup scripts
SQL/ - SQL queries and schema (DBeaver/SQLite)
src/ - Main source code
JAVA/ - Java code for interface and logic (NetBeans)
tests/ - Test scripts for R and Java
config/ - Configuration files (e.g., SQLite connection settings)

Prerequisites
To run this project, ensure you have the following installed:

R: Version 4.x or higher (via RStudio; packages TBD, e.g., RSQLite, dplyr).
Java: JDK 17 or higher (via NetBeans IDE).
DBeaver: Version 23.x or higher, configured for SQLite.
SQLite: A lightweight database (no separate server required).
Setup Instructions

1. Clone the Repository:
bash
git clone <repository_url>
cd NetBeaveR

2. Database Setup:
Install SQLite if not already present (usually bundled with DBeaver).
Open DBeaver, create a new SQLite connection, and point it to data/database/database.sqlite (create this file if it doesn’t exist).
Run scripts/setup/setup_db.sql in DBeaver to initialize the schema.
3. Load Initial Data:
Place a sample dataset (e.g., sample.csv) in the data/ folder.
Open RStudio, set the working directory to the project root, and run:
RStudio
Rscript scripts/setup/load_data.R
4. Build and Run the Java Interface:
Open the src/JAVA/ folder as a project in NetBeans IDE.
Ensure the SQLite JDBC driver (sqlite-jdbc-3.x.jar) is in config/ or added to the NetBeans project libraries.
Build and run the project in NetBeans to launch the interface.
5. Test the Pipeline:
Check tests/ for sample tests (e.g., tests/test_analytics.R for R, tests/TestApp.java for Java).
Run R tests in RStudio or Java tests in NetBeans.

Usage
Add a New Dataset: Drop it in the data/ folder, adjust load_data.R if needed, and rerun the script.
Extend Analytics: Add R scripts to src/R/ in RStudio.
Modify Interface: Edit Java code in src/JAVA/ via NetBeans.
Query Data: Use DBeaver to explore data/database.sqlite or tweak src/SQL/.

Current Features
Data ingestion from CSV files into SQLite (via R).
Basic Java interface for viewing results (built in NetBeans).
SQLite database schema for storing processed data.
Connection pooling via HikariCP for optimized database management.
Indexing applied to frequently queried columns in SQLite for improved performance.

Future Goals
Support additional dataset formats (e.g., JSON, Excel).
Enhance the Java UI with interactive features.
Automate the pipeline with a single command.
Improve performance further by refining database queries and indexing strategies.
Notes

This is a work in progress—expect refinements as I continue building it.
SQLite is stored in data/database/database.sqlite for simplicity. Adjust the path in scripts if moved.
Feedback is welcome as I continue to build this base system.

License
TBD (to be determined).


