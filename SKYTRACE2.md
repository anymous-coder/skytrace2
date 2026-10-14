# SkyTrace2

Fork/backup of [fidzzcodex-me/skytrace](https://github.com/fidzzcodex-me/skytrace) with extras:

1. **System bubble** — floating overlay when capture is on (support check: supported / needs_permission / unsupported)
2. **DNS ad block** — when VPN is on, blocked ad/tracker domains get NXDOMAIN (AdGuard-style). Toggle: `adBlockEnabled` (default true)

## Base

Clone upstream, then copy these paths from this repo:

```
android/app/src/main/kotlin/com/skytrace/adblock/
android/app/src/main/kotlin/com/skytrace/bubble/
android/app/src/main/kotlin/com/skytrace/vpn/DnsCache.kt
android/app/src/main/kotlin/com/skytrace/vpn/UdpRelay.kt
android/app/src/main/kotlin/com/skytrace/vpn/VpnServiceManager.kt
android/app/src/main/kotlin/com/skytrace/repo/SettingsStore.kt
android/app/src/main/kotlin/com/skytrace/repo/Graph.kt
android/app/src/main/kotlin/com/skytrace/VpnPlugin.kt
android/app/src/main/AndroidManifest.xml
android/app/src/test/kotlin/com/skytrace/
```

Or use the committed sources in this repository as the full patch set on top of SkyTrace 1.2.x.

## Ad block behavior

- Only active while VPN capture is running and `adBlockEnabled` is true
- DNS queries (UDP/53) for listed ad/tracker hosts receive NXDOMAIN
- AAAA still short-circuited as empty (existing SkyTrace behavior)
- Does not require a remote DNS service

## Bubble behavior

- Default off (`bubbleEnabled`)
- Requires `SYSTEM_ALERT_WINDOW`
- Appears only when capture is RUNNING and device supports overlay
- Drag, edge snap, long-press dismiss, mini panel (open app / stop)

No `//` line comments in new Kotlin modules.
