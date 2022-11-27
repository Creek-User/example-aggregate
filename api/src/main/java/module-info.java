module example.aggregate.api {
    requires transitive creek.kafka.metadata;

    exports io.github.creek.user.example.aggregate.api;
    exports io.github.creek.user.example.aggregate.internal to
            example.aggregate.services,
            example.aggregate.service;
}
