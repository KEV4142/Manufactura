create schema Manufactura;
use Manufactura;

-- Tablas Hoja Compras
create table Proveedor(
ProveedorID int not null,
Nombre varchar(50) not null,
Contacto varchar(50) not null,
Telefono varchar(20) not null,
Limite float not null,
Saldo float not null
);

create table Bodega(
BodegaID int not null,
Nombre varchar(50) not null
);

create table Articulo(
ArticuloID int not null,
Nombre varchar(50) not null,
Tipo varchar(1) not null,
ISV varchar(1) not null,
CategoriaID int not null
);

create table RequisicionCab(
RequisicionID int not null,
Fecha datetime not null,
OrdenID int not null,
Estado varchar(1) not null
);

create table RequisicionDet(
RequisicionID int not null,
ArticuloID int not null,
Cantidad int not null
);

create table OrdenCab(
OrdenID int not null,
Fecha datetime not null,
Estado varchar(1) not null,
MateriaBodegaID int not null,
ProductoBodegaID int not null,
Observacion varchar(50) not null
);

create table CompraCab(
CompraID int not null,
Fecha datetime not null,
ProveedorID int not null,
Estado varchar(1) not null
);

create table CompraDet(
CompraID int not null,
RequisicionID int not null,
ArticuloID int not null,
Cantidad int not null
);

create table IngresoCab(
IngresoID int not null,
Fecha datetime not null,
BodegaID int not null,
Estado varchar(1) not null
);

create table IngresoDet(
IngresoID int not null,
CompraID int not null,
RequisicionID int not null,
ArticuloID int not null,
Cantidad int not null,
Costo float not null
);

-- Tablas Hoja Produccion

create table Categoria(
CategoriaID int not null,
Nombre varchar(50) not null
);

create table PedidoCab(
PedidoID int not null,
Fecha datetime not null,
ClienteID int not null,
Estado varchar(1) not null
);

create table PedidoDet(
PedidoID int not null,
ArticuloID int not null,
Cantidad int not null
);

create table OrdenDet(
OrdenID int not null,
PedidoID int not null,
ArticuloID int not null,
Cantidad int not null
);

create table ModeloCab(
ModeloID int not null,
Nombre varchar(50) not null,
ArticuloID int not null,
Cantidad int not null,
Estado varchar(1) not null
);

create table ModeloDet(
ModeloID int not null,
ArticuloID int not null,
Cantidad int not null
);

create table Existencia(
BodegaID int not null,
ArticuloID int not null,
Cantidad int not null
);

-- Tablas Hoja Ventas

create table Lista(
ListaID int not null,
Nombre varchar(50) not null
);

create table Cliente(
ClienteID int not null,
Nombre varchar(50) not null,
Direccion varchar(50) not null,
Telefono varchar(20) not null,
Limite float not null,
Saldo float not null,
listaID int not null
);

create table Precio(
ArticuloID int not null,
ListaID int not null,
Precio float not null
);

create table FacturaCab(
FacturaID int not null,
ClienteID int not null,
Fecha datetime not null,
Tipo varchar(1) not null,
Estado varchar(1) not null,
BodegaID int not null
);

create table FacturaDet(
FacturaID int not null,
ArticuloID int not null,
Cantidad int not null,
Precio float not null,
ISV float not null
);

-- Llaves Primarias
alter table Proveedor add constraint pkProveedorID primary key(ProveedorID);
alter table Bodega add constraint pkBodegaID primary key(BodegaID);
alter table Articulo add constraint pkArticuloID primary key(ArticuloID);
alter table RequisicionCab add constraint pkRequisicionCab primary key(RequisicionID);
alter table OrdenCab add constraint pkOrdenCab primary key(OrdenID);
alter table CompraCab add constraint pkCompraCab primary key(CompraID);
alter table IngresoCab add constraint pkIngresoCab primary key(IngresoID);
alter table Categoria add constraint pkCategoriaID primary key(CategoriaID);
alter table PedidoCab add constraint pkPedidoCab primary key(PedidoID);
alter table ModeloCab add constraint pkModeloCab primary key(ModeloID);
alter table Lista add constraint pkListaID primary key(ListaID);
alter table Cliente add constraint pkClienteID primary key(ClienteID);
alter table FacturaCab add constraint pkFacturaCab primary key(FacturaID);
-- Llaves Foraneas
alter table Articulo add constraint fkArticuloCategoriaID foreign key (CategoriaID) references Categoria(CategoriaID);
alter table RequisicionCab add constraint fkRequisicionCabOrdenID foreign key (OrdenID) references OrdenCab(OrdenID);
alter table RequisicionDet add constraint fkRequisicionDetRequisicionID foreign key (RequisicionID) references RequisicionCab(RequisicionID);
alter table RequisicionDet add constraint fkRequisicionDetArticuloID foreign key (ArticuloID) references Articulo(ArticuloID);
alter table OrdenCab add constraint fkOrdenCabMateriaBodegaID foreign key (MateriaBodegaID) references Bodega(BodegaID);
alter table OrdenCab add constraint fkOrdenCabProductoBodegaID foreign key (ProductoBodegaID) references Bodega(BodegaID);
alter table CompraCab add constraint fkCompraCabProveedorID foreign key (ProveedorID) references Proveedor(ProveedorID);
alter table CompraDet add constraint fkCompraDetCompraID foreign key (CompraID) references CompraCab(CompraID);
alter table CompraDet add constraint fkCompraDetRequisicionID foreign key(RequisicionID) references RequisicionCab(RequisicionID);
alter table CompraDet add constraint fkCompraDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table IngresoCab add constraint fkIngresoCabBodegaID foreign key(BodegaID) references Bodega(BodegaID);
alter table IngresoDet add constraint fkIngresoDetIngresoID foreign key(IngresoID) references IngresoCab(IngresoID);
alter table IngresoDet add constraint fkIngresoDetCompraID foreign key(CompraID) references CompraCab(CompraID);
alter table IngresoDet add constraint fkIngresoDetRequisicionID foreign key(RequisicionID) references RequisicionCab(RequisicionID);
alter table IngresoDet add constraint fkIngresoDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table PedidoCab add constraint fkPedidoCabClienteID foreign key(ClienteID) references Cliente(ClienteID);
alter table PedidoDet add constraint fkPedidoDetPedidoID foreign key(PedidoID) references PedidoCab(PedidoID);
alter table PedidoDet add constraint fkPedidoDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table OrdenDet add constraint fkOrdenDetOrdenID foreign key(OrdenID) references OrdenCab(OrdenID);
alter table OrdenDet add constraint fkOrdenDetPedidoID foreign key(PedidoID) references PedidoCab(PedidoID);
alter table OrdenDet add constraint fkOrdenDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table ModeloCab add constraint fkModeloCabArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table ModeloDet add constraint fkModeloDetModeloID foreign key(ModeloID) references ModeloCab(ModeloID);
alter table ModeloDet add constraint fkModeloDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table Existencia add constraint fkExistenciaBodegaID foreign key(BodegaID) references Bodega(BodegaID);
alter table Existencia add constraint fkExistenciaArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table Cliente add constraint fkClienteListaID foreign key(ListaID) references Lista(ListaID);
alter table Precio add constraint fkPrecioArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);
alter table Precio add constraint fkPrecioListaID foreign key(ListaID) references Lista(ListaID);
alter table FacturaCab add constraint fkFacturaCabClienteID foreign key(ClienteID) references Cliente(ClienteID);
alter table FacturaCab add constraint fkFacturaCabBodegaID foreign key(BodegaID) references Bodega(BodegaID);
alter table FacturaDet add constraint fkFacturaDetFacturaID foreign key(FacturaID) references FacturaCab(FacturaID);
alter table FacturaDet add constraint fkFacturaDetArticuloID foreign key(ArticuloID) references Articulo(ArticuloID);