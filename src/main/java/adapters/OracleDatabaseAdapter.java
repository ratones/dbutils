package adapters;

import java.util.Map;

public class OracleDatabaseAdapter implements DatabaseAdapter {

    @Override
    public GenericAdapter withQuery(String query){
        return new OracleGenericAdapter(query);
    }

    @Override
    public EntityAdapter ofType(Class cls){
        return new OracleEntityAdapter(cls);
    }

    @Override
    public StoreAdapter withStoredProcedure(String procedureName, Map<String, Object> procedureParameters){
        return new OracleStoreAdapter(procedureName, procedureParameters);
    }

}
