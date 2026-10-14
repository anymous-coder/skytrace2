package com.skytrace.repo

import com.skytrace.adblock.AdBlock
import com.skytrace.bubble.BubbleController
import android.content.Context
import com.skytrace.cert.CertManager
import com.skytrace.proxy.LocalProxyEngine
import com.skytrace.rule.BreakpointManager
import com.skytrace.rule.RewriteEngine

object Graph {
    lateinit var app: Context
        private set
    lateinit var settings: SettingsStore
        private set
    lateinit var repository: TrafficRepository
        private set
    lateinit var certs: CertManager
        private set
    lateinit var rules: RewriteEngine
        private set
    lateinit var breakpoints: BreakpointManager
        private set

    @Volatile
    private var initialized = false

    fun init(context: Context) {
        if (initialized) return
        synchronized(this) {
            if (initialized) return
            app = context.applicationContext
            settings = SettingsStore(app)
            repository = TrafficRepository(app)
            certs = CertManager(app)
            rules = RewriteEngine()
            breakpoints = BreakpointManager()
            rules.load(repository.listRules())
            breakpoints.load(repository.listBreakpoints())
            breakpoints.timeoutSeconds = settings.breakpointTimeoutSec
            AdBlock.enabled = settings.adBlockEnabled
            BubbleController.init(app)
            initialized = true
        }
    }
}
