package fodase;

import com.db4o.bench.crud.*;

public class Main {

    public static void main(String[] args) {
        // Path to the database file
        String dbPath = "person.db4o";
        
        // Opening the database
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dbPath);
        
        try {
            // Create a Person object
            Person johnDoe = new Person("John Doe", 30);
            
            // Store the object in the database
            db.store(johnDoe);
            System.out.println("Stored " + johnDoe);
            
            // Retrieve all Person objects from the database
            ObjectSet<Person> result = db.query(Person.class);
            
            System.out.println("Retrieved " + result.size() + " persons:");
            for (Person person : result) {
                System.out.println(person);
            }
        } finally {
            // Close the database
            db.close();
        }
    }
}

