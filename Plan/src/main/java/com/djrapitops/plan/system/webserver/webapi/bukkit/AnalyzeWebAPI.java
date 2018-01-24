/*
 * Licence is provided in the jar as license.yml also here:
 * https://github.com/Rsl1122/Plan-PlayerAnalytics/blob/master/Plan/src/main/resources/license.yml
 */
package com.djrapitops.plan.system.webserver.webapi.bukkit;

import com.djrapitops.plan.PlanPlugin;
import com.djrapitops.plan.api.exceptions.connection.WebException;
import com.djrapitops.plan.system.webserver.response.Response;
import com.djrapitops.plan.system.webserver.webapi.WebAPI;

import java.util.Map;
import java.util.UUID;

/**
 * @author Rsl1122
 */
@Deprecated
public class AnalyzeWebAPI extends WebAPI {
    @Override
    public Response onRequest(PlanPlugin plugin, Map<String, String> variables) {
        return fail("Deprecated");
    }

    @Override
    public void sendRequest(String address) throws WebException {
        throw new IllegalStateException("Wrong method call for this WebAPI, call sendRequest(String, UUID, UUID) instead.");
    }

    public void sendRequest(String address, UUID serverUUID) throws WebException {
        addVariable("serverUUID", serverUUID.toString());
        super.sendRequest(address);
    }
}
