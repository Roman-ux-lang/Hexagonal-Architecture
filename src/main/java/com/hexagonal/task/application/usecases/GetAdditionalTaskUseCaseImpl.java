package com.hexagonal.task.application.usecases;

import com.hexagonal.task.domain.models.AdditionalTaskInfo;
import com.hexagonal.task.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.task.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskUseCaseImpl(ExternalServicePort externalServicePort){
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
