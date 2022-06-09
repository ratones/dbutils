package adapters;

import java.util.Optional;

public interface StoreAdapter {
    boolean execute();

    <T> Optional<T> executeWitReturnValue();
}
