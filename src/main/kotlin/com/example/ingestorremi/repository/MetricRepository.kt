package com.example.ingestorremi.repository

import com.example.ingestorremi.model.Metric
import org.springframework.stereotype.Repository

@Repository
interface MetricRepository {
    fun getMetricById(id: Int): Metric?
}


class MetricRepositoryImpl(id: Int): MetricRepository {

    override fun getMetricById(id: Int): Metric? {
        return Metric(1, "success")
    }
}