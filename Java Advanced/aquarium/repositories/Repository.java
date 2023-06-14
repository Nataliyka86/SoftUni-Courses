package aquariumDebug.repositories;

import aquariumDebug.entities.decorations.Decoration;

public interface Repository  {
    void add(Decoration decoration);

    boolean remove(Decoration decoration);

    Decoration findByType(String type);
}
