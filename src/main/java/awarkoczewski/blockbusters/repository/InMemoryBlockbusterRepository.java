package awarkoczewski.blockbusters.repository;

import awarkoczewski.blockbusters.model.Blockbuster;

import java.util.List;

public class InMemoryBlockbusterRepository implements BlockbusterRepository {

    List<Blockbuster> blockbusterList;
    Long nextId;

    public InMemoryBlockbusterRepository() {
        blockbusterList.add(new Blockbuster(1L,1L,1L));
        nextId = Long.valueOf(blockbusterList.size());

    }

    @Override
    public boolean isBlockbuster(Blockbuster blockbuster) {

        return blockbuster.getRentalCount()>300 ? true : false;
    }
}
