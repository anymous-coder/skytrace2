# SkyTrace2

Fork of [fidzzcodex-me/skytrace](https://github.com/fidzzcodex-me/skytrace) with:

- **System bubble** (floating overlay when capture is on)
- **DNS ad block** (NXDOMAIN for ad/tracker hosts while VPN is on)

## Layout

Project files sit at **repo root** (no `skytrace-main/` wrapper folder).

```
ARCHITECTURE.md
CHANGELOG.md
LICENSE
README.md
android/
assets/
docs/
lib/
pubspec.yaml
scripts/
test/
```

## Extra modules (this fork)

```
android/app/src/main/kotlin/com/skytrace/adblock/AdBlock.kt
android/app/src/main/kotlin/com/skytrace/bubble/BubbleController.kt
android/app/src/main/kotlin/com/skytrace/bubble/BubbleGeometry.kt
```

Wired in: `UdpRelay` (DNS block), `SettingsStore` (`adBlockEnabled`, `bubbleEnabled`), `Graph`, `VpnServiceManager`, `VpnPlugin`, `AndroidManifest` (`SYSTEM_ALERT_WINDOW`).

## Build

Same as upstream:

```bash
bash scripts/bootstrap.sh
flutter pub get
flutter run
```

Version: **1.3.0+4**

## Note

If some large files are missing on a thin clone of this remote, use the full zip/tarball of the complete tree (exported without nested root folder) and merge over a fresh upstream clone.
