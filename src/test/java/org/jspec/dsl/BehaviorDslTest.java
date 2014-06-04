package org.jspec.dsl;

import org.jspec.Test;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.jspec.dsl.BehaviorDsl.before;
import static org.jspec.dsl.BehaviorDsl.context;
import static org.jspec.dsl.BehaviorDsl.describe;
import static org.jspec.dsl.BehaviorDsl.it;
import static org.jspec.Assert.assertThat;

/**
 * @author dpersa
 */
public class BehaviorDslTest {

    private Stack<Integer> stack;

    @Test
    public void testSomething() {

        describe("Stack",
                before(() -> {
                    stack = new Stack<>();
                    stack.push(10);
                    stack.push(11);
                    stack.push(12);
                }),
                it("should have a push operation", () -> {
                    stack.push(13);
                    assertThat(stack.size(), is(4));
                }),
                it("should have a pop operation", () -> {
                    stack.pop();
                    assertThat(stack.size(), is(2));
                })).execute();

        System.out.println();
    }

    @Test
    public void testStack() {
        describe("Stack",
                before(() -> {
                    stack = new Stack<>();
                }),
                context("methods",
                        before(() -> {
                            stack.push(10);
                            stack.push(11);
                            stack.push(12);
                        }),
                        it("should have a push operation", () -> {
                            stack.push(13);
                        }),
                        it("shoudl have a pop operation", () -> {
                            stack.pop();
                        })),
                context("questions",
                        before(() -> {
                            stack = new Stack<>();
                            stack.push(10);
                            stack.push(11);
                            stack.push(12);
                        }),
                        it("should have a push operation", () -> {
                            stack.push(13);
                        }),
                        it("should have a pop operation", () -> {
                            stack.pop();
                        }),
                        describe("some sub section",
                                it("should do something", () -> {
                                    stack.peek();
                                })))).execute();
        System.out.println();
    }
}
