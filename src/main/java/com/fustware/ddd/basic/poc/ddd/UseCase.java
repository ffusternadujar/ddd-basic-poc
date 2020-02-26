package com.fustware.ddd.basic.poc.ddd;

@FunctionalInterface
public interface UseCase<I extends Request, O extends Response> {

    void execute(I request, O response);
}
