# Source note — PLEASE READ

The code in `source-recovered-v1.8v7/` is **NOT the original 2018 DEONISM source code**.
It was **recovered by decompiling the v1.8v7 release APK** (`DEONISM-1.8v7.apk`)
with jadx 1.5.2, because the original source could not be found anywhere
(searched: both GitHub accounts, Google Drive, and the local workspace).

## What is in `source-recovered-v1.8v7/`

- `sources/` — decompiled Java code (4,449 files):
  - the app's own code, under `com/example/samplestickerapp`
    (DEONISM was built on WhatsApp's sample sticker-app template;
    19 files: activities, sticker content provider, pack list/details)
  - plus decompiled third-party libraries bundled in the APK
    (Facebook ads/Fresco, Google/Firebase, AndroidX, etc.)
- `resources/` — decompiled resources: `AndroidManifest.xml`
  (package `com.r3dliz4rd.deonism`), `res/`, and `assets/` with the
  sticker packs: 46 packs, 1,194 `.webp` stickers, `contents.json`.

## Caveats

- Decompiled code is **not identical** to the original source: some class
  names were obfuscated to single letters, and 9 classes produced
  decompile errors in jadx.
- There is **no `build.gradle` / build setup** in this tree — it is a
  recovery dump for reference, not a directly buildable project as-is.
- If the original 2018 source is ever found, it should replace this tree.

Untouched by this commit: `README.md`, `icon.png`, and the v1.8v7 release APK.
