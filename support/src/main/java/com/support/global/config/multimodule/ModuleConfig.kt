package com.support.global.config.multimodule

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.common", "com.core")
class ModuleConfig {
}