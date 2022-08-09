import {css, html, LitElement} from 'lit';
import {property} from 'lit/decorators.js';
import '@vaadin/horizontal-layout/vaadin-horizontal-layout.js';

class CustomMap extends LitElement {

    @property()
    width = "";

    @property()
    height = "";

    constructor() {
        super();
        console.log(this);
        console.log((this as any).$server);
        // Bug fires here
        (this as any).$server.queryStuffs();
    }

    render() {
        const that = this;
        setTimeout(function () {
            console.log(that);
            console.log((that as any).$server);
            // And here
            (that as any).$server.queryStuffs();
        }, 1000);
        return html`
            <div id="map" class="brown" style="width: ${this.width}; height: ${this.height};"></div>
        `;
    }

}

customElements.define('custom-map', CustomMap);
