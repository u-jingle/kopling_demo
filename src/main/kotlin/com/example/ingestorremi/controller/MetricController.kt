package com.example.ingestorremi.controller
import com.example.ingestorremi.model.Metric
import com.example.ingestorremi.service.MetricService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/metric")
class MetricController(val metricService: MetricService) {
    @GetMapping("/metric/{id}")
    fun getMetric(@PathVariable id: Int): Metric? {
        val metric = metricService.getMetricById(id)
        return metric
    }
}