package committee.nova.neteasecheck;

@SuppressWarnings("unused")
public class NeteaseCheck {
    public static void check() {
        discoverClass(
                // 1.16+
                "com.netease.mc.mod.NeteaseOfficialMod",
                // 1.7.10-1.12.2
                "com.netease.mc.mod.mcbase.McBaseMod",
                // 1.12.2
                "com.netease.mc.mod.network.common.Library"
        );
    }

    private static void discoverClass(String... names) {
        for (final String className : names) {
            try {
                Class.forName(className);
                throw new PlatformNotAuthorizedError();
            } catch (ClassNotFoundException ignored) {
            }
        }
    }

    public static class PlatformNotAuthorizedError extends Error {
        public PlatformNotAuthorizedError() {
            super("此版本不支持在网易MC客户端运行——请尝试在组件中心下载兼容的版本。");
        }
    }
}
