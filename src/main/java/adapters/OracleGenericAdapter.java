package adapters;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

class OracleGenericAdapter implements GenericAdapter {
    private  String query;
    private  String connection;
    private  Class cls;

    public OracleGenericAdapter(String query) {
        this.query = query;
        this.connection = null;
        this.cls = HashMap.class;
    }



    @Override
    public GenericAdapter ofType(Class cls){
        this.cls = cls;
        return this;
    }

    @Override
    public GenericAdapter withConnection(String connection){
        this.connection = connection;
        return this;
    }

    /***
     *
     * @return String based on first column in query.
     * If no query is provided will throw SqlException
     */
    @Override
    public Optional<String> getStringValue() throws SQLException {
        return Optional.of("");
    }

    /***
     *
     * @return Map of String, Object or Instance of T if T is provided, based on provided query
     *
     */
    @Override
    public <T> Optional<T> getDbObject(){
        //
        return (Optional<T>) Optional.ofNullable(cls.getName());
    }

    /***'
     *
     * @return List of Map of String, Object or List of T if T based on provided query
     */
    @Override
    public Optional<ArrayList> getDbCollection(){
        return Optional.of(new ArrayList<>());
    }

}
