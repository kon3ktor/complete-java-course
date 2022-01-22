package com.expert.methodreference;

import java.util.Collection;
import java.util.function.Supplier;

public class CollectionTransformer {

    public static <T, DEST extends Collection<T>, SOURCE extends Collection<T>>
    DEST transform(SOURCE sourceCollection, Supplier<DEST> creator) {
        DEST destinationCollection = creator.get();
        destinationCollection.addAll(sourceCollection);
        return destinationCollection;
    }
}
