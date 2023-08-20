package com.example.ingestorremi.service
import com.example.ingestorremi.model.Metric
import com.example.ingestorremi.repository.MetricRepositoryImpl
import org.springframework.stereotype.Service

@Service
class MetricService() {
    fun getMetricById(id: Int): Metric? {
//        return metricRepository.getMetricById(id)
        return Metric(1, "success")
    }

}