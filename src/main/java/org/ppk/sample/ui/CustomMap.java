package org.ppk.sample.ui;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;
import elemental.json.JsonValue;
import elemental.json.impl.JreJsonArray;
import elemental.json.impl.JreJsonFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Tag("custom-map")
@JsModule("./src/custom-map.ts")
@RequiredArgsConstructor
@Log4j2
@Route("/map")
public class CustomMap extends LitTemplate {

    private static final JreJsonFactory JRE_JSON_FACTORY = new JreJsonFactory();

    @Id("map")
    private Div mapContainer;

    @ClientCallable
    public JsonValue queryTerminals() {
        JreJsonArray value = new JreJsonArray(JRE_JSON_FACTORY);
        return value;
    }

}
