# Arquetipo WorldReactiveProxy

## Estructura de Capas

- **config/**: Configuración general (beans, feign, etc).
- **domain/model/**: Entidades y estructuras de negocio.
- **domain/service/**: Lógica de negocio pura.
- **domain/business/**: Coordinadores de casos de uso.
- **adapter/output/client/**: Clientes HTTP (Feign, WebClient, etc).
- **expose/**: Controladores REST.
- **exception/**: Excepciones y validaciones personalizadas.

Generado con la convención de paquetes: `com.worldreactive.proxy`

Incluye:
- Banner personalizado
- Controlador `/welcome`
- Carpeta `contract/` para contrato OpenAPI
