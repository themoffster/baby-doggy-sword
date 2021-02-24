# Simple Minecraft mod to add a custom sword

This uses a gradle script to copy assets into the build folder to ensure they are picked up. Apparently this is a known
issue with IntelliJ.

## Important info

This requires Java 8.

### Running

- run `./gradlew clean build prepareRunCient`
- run an 'Application' configuration in IntelliJ with the main class of `net.minecraftforge.legacydev.MainClient` and
  environment varaibles
  of `MCP_TO_SRG=/home/moffata/git_repos/harhay/baby-doggy/build/createSrgToMcp/output.srg;MOD_CLASSES=/home/moffata/git_repos/harhay/baby-doggy/build/resources/main:/home/moffata/git_repos/harhay/baby-doggy/build/classes/java/main;mainClass=net.minecraft.launchwrapper.Launch;MCP_MAPPINGS=snapshot_20171003-1.12;FORGE_VERSION=14.23.5.2854;assetIndex=1.12;assetDirectory=/home/moffata/.gradle/caches/forge_gradle/assets;nativesDirectory=/home/moffata/git_repos/harhay/baby-doggy/build/natives;FORGE_GROUP=net.minecraftforge;tweakClass=net.minecraftforge.fml.common.launcher.FMLTweaker;MC_VERSION=${MC_VERSION}`
