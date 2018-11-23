import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { CinePagoClienteModule } from './cliente/cliente.module';
import { CinePagoTarjetaModule } from './tarjeta/tarjeta.module';
import { CinePagoPagoModule } from './pago/pago.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        CinePagoClienteModule,
        CinePagoTarjetaModule,
        CinePagoPagoModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class CinePagoEntityModule {}
