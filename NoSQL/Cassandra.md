# Cassandra - is a scalable column NoSQL database

 Used for truly big data at CERN, Comcast, eBay, GitHub, GoDaddy, Hulu, Instagram, Intuit, Netflix, Reddit, The Weather Channel

![Cassandra](http://cassandra.apache.org/img/cassandra_logo.png)

* http://cassandra.apache.org/

## Features

Cassandra provides the Cassandra Query Language (CQL), an SQL-like language, to create and update database schema and access data. CQL allows users to organize data within a cluster of Cassandra nodes using:

* **Keyspace**: defines how a dataset is replicated, for example in which datacenters and how many copies. Keyspaces contain tables.
* **Table**: defines the typed schema for a collection of partitions. Cassandra tables have flexible addition of new columns to tables with zero downtime. Tables contain partitions, which contain partitions, which contain columns.
* **Partition**: defines the mandatory part of the primary key all rows in Cassandra must have. All performant queries supply the partition key in the query.
* **Row**: contains a collection of columns identified by a unique primary key made up of the partition key and optionally additional clustering keys.
* **Column**: A single datum with a type which belong to a row.

### CQL supports numerous advanced features over a partitioned dataset such as:

* Single partition lightweight transactions with atomic compare and set semantics.
* User-defined types, functions and aggregates
* Collection types including sets, maps, and lists.
* Local secondary indices
* (Experimental) materialized views

Cassandra explicitly chooses not to implement operations that require cross partition coordination as they are typically slow and hard to provide highly available global semantics. For example 

### Cassandra does not support:

* Cross partition transactions
* Distributed joins
* Foreign keys or referential integrity.

### Cross partition transactions
Distributed joins
Foreign keys or referential integrity.

## Getting Started
* http://cassandra.apache.org/doc/latest/getting_started/

## CAP theorem
* http://cassandra.apache.org/doc/latest/architecture/guarantees.html#what-is-cap
![CAP](http://cassandra.apache.org/doc/latest/_images/Figure_1_guarantees.jpg)

* https://robertgreiner.com/cap-theorem-revisited/

## Hosted Cassandra (hosting yourself not recommended because of technical difficulties)
* ![Aiven.IO](https://aiven.io/assets/img/aiven-logo.png)
* [Aiven.IO](https://aiven.io/) - hosted using many different providers below, free 1 month credit
* https://help.aiven.io/en/articles/1803299-getting-started-with-aiven-for-cassandra

## Amazon Managed Cassandra Service (Cassandra falls under paid!)

* https://docs.aws.amazon.com/mcs/latest/devguide/what-is-mcs.html

## IBM Cloud (Cassandra is paid!)
* https://www.ibm.com/cloud

## Microsoft Azure (Cassandra is paid again with some free credit)
* https://azure.microsoft.com/en-us/free/

## Google Cloud (again paid with free credit)
* https://console.cloud.google.com/marketplace/details/google/cassandra?pli=1


## More on SQL to NoSQL 
* https://dzone.com/articles/the-data-continuum-examined

## SQL vs CQL
* https://www.ktexperts.com/cassandra-similarities-and-differences-between-the-sql-and-cql-languages/

## CQL reference
* https://docs.datastax.com/en/dse/6.0/cql/cql/cql_reference/cqlReferenceTOC.html


## Cassandra alternative (same syntax for CQL but different engine)
![Scylla](https://upload.wikimedia.org/wikipedia/en/2/20/Scylla_the_sea_monster.png)
* https://en.wikipedia.org/wiki/Scylla_(database)
* https://www.scylladb.com/
