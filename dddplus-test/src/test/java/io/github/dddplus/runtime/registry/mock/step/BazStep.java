package io.github.dddplus.runtime.registry.mock.step;

import io.github.dddplus.annotation.Step;
import io.github.dddplus.runtime.registry.mock.exception.FooException;
import io.github.dddplus.runtime.registry.mock.model.FooModel;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotNull;

@Step
@Slf4j
public class BazStep extends SubmitStep {

    @Override
    public void execute(@NotNull FooModel model) throws FooException {
        log.info("submit: {}", model);
    }

    @Override
    public String stepCode() {
        return Steps.Submit.BazStep;
    }
}
