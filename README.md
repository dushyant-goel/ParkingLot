# Parking Lot

Parking Lot : Implementing design patterns.

### Factory Pattern :
- CostComputation
- ParkingManager
- ParkingSpot*

### Strategy Pattern :
- PricingStrategy
- ParkingStrategy*


-----


## __How it works__:


__ENTRY__

`Vehicle` comes to the parking lot and request a `Ticket`.

Based on the `VehicleType` (`TWOWHEELER`, `FOURWHEELER`), the `EntraceGate` creates a `ParkingManager` (from factory). (`TwoWheelerParkingManager`, `FourWheelerParkingManager`).

ParkingManager finds a `ParkingSpot`. This spot can found based on a strategy, for eg nearest to entrance, or near exit, etc.

List of available `ParkingSpot` is returned* from `ParkingSpotFactory`. (`TWOWHEELER`, `FOURWHEELER`)

ParkingManager updates the ParkingSpot, returns a `Ticket` object to the Vehicle.

__EXIT__

Vehicle provide the `Ticket` to the `ExitGate`.

Exit Gate creates a `CostCompution` from the factory, based on the `VehicleType` on the `Ticket`. (`TwoWheelerCostCompution`, `FourWheelerCostCompution`)

`CostComputation` utilizes one of two strategies, (`HourlyStrategy`, `DailyPassStrategy`) to calculate cost. (Strategy Pattern).

---







