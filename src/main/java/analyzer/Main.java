package analyzer;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.__;

public class Main {

    public static void main(String[] args) {

        GraphTraversal<?, ?> traversal = __.V()
                .out("knows")
                .has("age", 30)
                .out("created");

        System.out.println("Traversal: " + traversal);

        traversal.asAdmin().getSteps().forEach(step ->
                System.out.println(step.getClass().getSimpleName())
        );
    }
}
