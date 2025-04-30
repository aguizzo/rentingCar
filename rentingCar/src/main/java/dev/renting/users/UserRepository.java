// UserRepository.java
package dev.renting.users;

public interface UserRepository {
    <T extends UserTableItem> void save(T item);
}
