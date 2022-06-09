package adapters;

import java.util.Map;

public interface DatabaseAdapter {
    GenericAdapter withQuery(String query);

    EntityAdapter ofType(Class cls);

    StoreAdapter withStoredProcedure(String procedureName, Map<String, Object> procedureParameters);
}
