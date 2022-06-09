package adapters;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public interface EntityAdapter {
    EntityAdapter withKey(Object key);

    EntityAdapter withConnection(String connection);

    <T> Optional<T> getDbObject();

    Optional<ArrayList> getDbCollection();

    boolean insertDbObject();

    boolean updateDbObject();

    boolean deleteDbObject() throws SQLException;
}
