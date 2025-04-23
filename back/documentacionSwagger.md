## API REST - Documentación

Esta documentación describe los endpoints principales del sistema de reservas, incluyendo controladores para **Reserva**, **Mesa**, **FechaHora** y **Cliente**.

---

### Reserva Controller

#### GET `/api/v1/reserva/{id}`
**Descripción:** Obtiene una reserva por su ID.

**Parámetros:**
- `id` (integer, path) – Requerido

**Respuesta:**
```json
{
  "status": true,
  "data": {
    "id": 1,
    "clienteId": 1,
    "mesaId": 1,
    "fechaHoraId": 1,
    "notas": "string"
  },
  "message": "Reserva obtenida con éxito"
}
```

#### PUT `/api/v1/reserva/{id}`
**Descripción:** Actualiza una reserva existente.

**Parámetros:**
- `id` (integer, path) – Requerido

**Body:**
```json
{
  "clienteId": 1,
  "mesaId": 1,
  "fechaHoraId": 1,
  "notas": "string"
}
```

**Respuesta:** Igual a GET

#### DELETE `/api/v1/reserva/{id}`
**Descripción:** Elimina una reserva por ID.

**Parámetros:**
- `id` (integer, path) – Requerido

**Respuesta:** Igual a GET

#### GET `/api/v1/reserva`
**Descripción:** Lista todas las reservas.

**Respuesta:**
```json
{
  "status": true,
  "data": [
    {
      "id": 1,
      "clienteId": 1,
      "mesaId": 1,
      "fechaHoraId": 1,
      "notas": "string"
    }
  ],
  "message": "Reservas listadas"
}
```

#### POST `/api/v1/reserva`
**Descripción:** Crea una nueva reserva.

**Body:** Igual al PUT

**Respuesta:** Igual a GET

---

### Mesa Controller

#### GET `/api/v1/mesa/{id}`
**Descripción:** Obtiene una mesa por ID.

**Parámetros:**
- `id` (integer, path) – Requerido

**Respuesta:**
```json
{
  "status": true,
  "data": {
    "id": 1,
    "capacidad": 4,
    "ubicacion": "Terraza"
  },
  "message": "Mesa obtenida"
}
```

#### PUT `/api/v1/mesa/{id}`
**Descripción:** Actualiza una mesa.

**Parámetros:** Igual al GET

**Body:**
```json
{
  "capacidad": 4,
  "ubicacion": "Terraza"
}
```

**Respuesta:** Igual al GET

#### DELETE `/api/v1/mesa/{id}`
**Descripción:** Elimina una mesa por ID.

**Parámetros:** Igual al GET

**Respuesta:** Igual al GET

#### GET `/api/v1/mesa`
**Descripción:** Lista todas las mesas.

**Respuesta:**
```json
{
  "status": true,
  "data": [
    {
      "id": 1,
      "capacidad": 4,
      "ubicacion": "Terraza"
    }
  ],
  "message": "Mesas listadas"
}
```

#### POST `/api/v1/mesa`
**Descripción:** Crea una nueva mesa.

**Body:** Igual al PUT

**Respuesta:** Igual al GET

---

### FechaHora Controller

#### GET `/api/v1/fecha-hora/{id}`
**Descripción:** Obtiene una fecha y hora específica por ID.

**Parámetros:**
- `id` (integer, path) – Requerido

**Respuesta:**
```json
{
  "status": true,
  "data": {
    "id": 1,
    "fecha": "2025-05-01",
    "hora": "20:00"
  },
  "message": "FechaHora obtenida"
}
```

#### PUT `/api/v1/fecha-hora/{id}`
**Descripción:** Actualiza un registro de FechaHora.

**Body:**
```json
{
  "fecha": "2025-05-01",
  "hora": "20:00"
}
```

**Respuesta:** Igual al GET

#### DELETE `/api/v1/fecha-hora/{id}`
**Descripción:** Elimina un registro por ID.

**Parámetros:** Igual al GET

**Respuesta:** Igual al GET

#### GET `/api/v1/fecha-hora`
**Descripción:** Lista todas las fechas y horas.

**Respuesta:**
```json
{
  "status": true,
  "data": [
    {
      "id": 1,
      "fecha": "2025-05-01",
      "hora": "20:00"
    }
  ],
  "message": "Listado completo"
}
```

#### POST `/api/v1/fecha-hora`
**Descripción:** Crea un nuevo registro de FechaHora.

**Body:** Igual al PUT

**Respuesta:** Igual al GET

---

### 👤 Cliente Controller

#### GET `/api/v1/cliente/{id}`
**Descripción:** Obtiene un cliente por ID.

**Parámetros:**
- `id` (integer, path) – Requerido

**Respuesta:**
```json
{
  "status": true,
  "data": {
    "id": 9007199254740991,
    "status": true,
    "createdAt": "2025-04-22T22:12:43.514Z",
    "updatedAt": "2025-04-22T22:12:43.514Z",
    "deletedAt": "2025-04-22T22:12:43.514Z",
    "createdBy": 9007199254740991,
    "updatedBy": 9007199254740991,
    "deletedBy": 9007199254740991,
    "name": "string",
    "contact": "string"
  },
  "message": "string"
}
```

#### PUT `/api/v1/cliente/{id}`
**Descripción:** Actualiza un cliente.

**Body:** Igual al GET

**Respuesta:** Igual al GET

#### DELETE `/api/v1/cliente/{id}`
**Descripción:** Elimina un cliente por ID.

**Respuesta:** Igual al GET

#### GET `/api/v1/cliente`
**Descripción:** Lista todos los clientes.

**Respuesta:**
```json
{
  "status": true,
  "data": [
    {
      "id": 9007199254740991,
      "status": true,
      "createdAt": "2025-04-22T22:12:43.527Z",
      "updatedAt": "2025-04-22T22:12:43.527Z",
      "deletedAt": "2025-04-22T22:12:43.527Z",
      "createdBy": 9007199254740991,
      "updatedBy": 9007199254740991,
      "deletedBy": 9007199254740991,
      "name": "string",
      "contact": "string"
    }
  ],
  "message": "string"
}
```

#### POST `/api/v1/cliente`
**Descripción:** Crea un nuevo cliente.

**Body:** Igual al GET

**Respuesta:** Igual al GET

