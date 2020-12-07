package org.radar.radarlint.settings;

import org.openide.util.NbPreferences;
import org.radar.radarlint.SonarLintSaveTask;

/**
 *
 * @author alex268
 */
public class ServerIDPreference extends AbstractPreferenceAccessor<String> {
    private static final String DEFAULT_SERVER_ID = "123456789";

    public ServerIDPreference() {
        super(NbPreferences.forModule(SonarLintSaveTask.class), "sonarqube.server.id");
    }
    
    @Override
    public void setValue(String value) {
        getPreferences().put(getPreferenceKey(), value);
    }

    @Override
    public String getValue() {
        return getPreferences().get(getPreferenceKey(), DEFAULT_SERVER_ID);
    }
	
}
