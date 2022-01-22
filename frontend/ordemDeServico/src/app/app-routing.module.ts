import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ClienteCreateComponent } from "./views/components/cliente-create/cliente-create.component";
import { ClienteReadComponent } from "./views/components/cliente-read/cliente-read.component";
import { ClienteUpdateComponent } from "./views/components/cliente-update/cliente-update.component";
import { HomeComponent } from "./views/components/home/home.component";
import { TecnicoCreateComponent } from "./views/components/tecnico/tecnico-create/tecnico-create.component";
import { TecnicoDeleteComponent } from "./views/components/tecnico/tecnico-delete/tecnico-delete.component";
import { TecnicoReadComponent } from "./views/components/tecnico/tecnico-read/tecnico-read.component";
import { TecnicoUpdateComponent } from "./views/components/tecnico/tecnico-update/tecnico-update.component";

const routes: Routes = [
  {
    path: "",
    component: HomeComponent,
  },
  {
    path: "tecnicos",
    component: TecnicoReadComponent,
  },
  {
    path: "tecnicos/create",
    component: TecnicoCreateComponent,
  },
  {
    path: "tecnicos/update/:id",
    component: TecnicoUpdateComponent,
  },
  {
    path: "tecnicos/delete/:id",
    component: TecnicoDeleteComponent,
  },
  {
    path: "clientes",
    component: ClienteReadComponent,
  },
  {
    path: "clientes/create",
    component: ClienteCreateComponent,
  },
  {
    path: "clientes/update/:id",
    component: ClienteUpdateComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
