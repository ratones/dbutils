package adapters;

import java.util.Map;
import java.util.Optional;
class OracleStoreAdapter implements StoreAdapter {
    private String procedureName;
    private Map<String,Object> procedureParameters;

    public OracleStoreAdapter(String procedureName, Map<String, Object> procedureParameters) {
        this.procedureName = procedureName;
        this.procedureParameters = procedureParameters;
    }

    @Override
    public boolean execute(){
        return true;
    }

    @Override
    public <T> Optional<T> executeWitReturnValue(){
        return Optional.of(null);
    }
}
