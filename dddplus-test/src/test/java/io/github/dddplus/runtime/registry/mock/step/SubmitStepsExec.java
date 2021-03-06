package io.github.dddplus.runtime.registry.mock.step;

import io.github.dddplus.runtime.StepsExecTemplate;
import io.github.dddplus.runtime.registry.mock.model.FooModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SubmitStepsExec extends StepsExecTemplate<SubmitStep, FooModel> {

    @Override
    protected void afterStep(SubmitStep step, FooModel model) {
        log.info("after:{} {}", step.stepCode(), model);
    }
}
