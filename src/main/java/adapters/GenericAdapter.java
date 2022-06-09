package adapters;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
public interface GenericAdapter {
    GenericAdapter ofType(Class cls);

    GenericAdapter withConnection(String connection);

    Optional<String> getStringValue() throws SQLException;

    <T> Optional<T> getDbObject();

    Optional<ArrayList> getDbCollection();
}
