package adapters;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
class OracleEntityAdapter implements EntityAdapter {
    private  String connection;
    private  Class cls;
    private  Object key;

    public OracleEntityAdapter(Class cls) {
        this.cls = cls;
    }

    @Override
    public EntityAdapter withKey(Object key){
        this.key = key;
        return this;
    }

    @Override
    public EntityAdapter withConnection(String connection){
        this.connection = connection;
        return this;
    }

    /***
     *
     * @return Map of String, Object or an instance of a Class if
     *  type is provided.
     *  If key is provided it has a higher order over query and it will try to fetch the whole entity.
     */
    @Override
    public <T> Optional<T> getDbObject(){
        //
        return (Optional<T>) Optional.ofNullable(cls.getName());
    }

    /***'
     *
     * @return List of objects of type or List of Map of String, Object if query is provided with no type
     */
    @Override
    public Optional<ArrayList> getDbCollection(){
        return Optional.of(new ArrayList<>());
    }

    @Override
    public boolean insertDbObject(){
        return true;
    }

    @Override
    public boolean updateDbObject(){
        return true;
    }

    /***
     * key and type are mandatory for this method
     * @return
     * @throws SQLException
     */
    @Override
    public boolean deleteDbObject() throws SQLException {
        return true;
    }

}
