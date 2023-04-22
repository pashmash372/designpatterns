package com.scaler.lld.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Datastore {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    // step 1- hide outer constructor
    private Datastore() {
    }

    // add a static method to create builder instance ---> staic intializer
    // Static Intializer

    public static DatastoreBuilder builder() {
        return new DatastoreBuilder();
    }

    // step 2- create builder class
    public static class DatastoreBuilder {
        private Datastore datastore;

        DatastoreBuilder() {
            this.datastore = new Datastore();
        }

        // step 4 - add fluent interfaces for setters
        public DatastoreBuilder withHost(String host) {
            datastore.host = host;            
            return this;
        }

        public DatastoreBuilder ofType(DatabaseType type) {
            datastore.type = type;            
            return this;
        }

        public DatastoreBuilder mysql() {
            datastore.type = DatabaseType.MY_SQL;            
            return this;
        }

        // step 5 - adds a build hook
        public Datastore build() {

            boolean isValid = validate();
            if (!isValid) {
                throw new RuntimeException("Object is not valid");
            }

            Datastore instance = new Datastore();
            instance.host = datastore.host;
            instance.port = datastore.port;
            instance.type = datastore.type;

            return instance;
        }

        private boolean validate() {
            if (datastore.type == null) {
                return false;
            }
            if (datastore.host == null) {
                return false;
            }
            return true;
        }
    }

}

// fix the duplicate fields in builder class