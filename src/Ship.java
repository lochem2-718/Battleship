class Ship
{
    byte health;
    byte x;
    byte y;
    char direction;
    byte length;
    Ship(byte x, byte y, char direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    void damage()
    {
        this.health--;
    }
}

class Carrier extends Ship
{
    Carrier(byte x, byte y, char direction)
    {
        super(x, y, direction);
        this.health = this.length = 5;
    }
}

class Battleship extends Ship
{
    Battleship(byte x, byte y, char direction)
    {
        super(x, y, direction);
        this.health = this.length = 4;
    }
}

class Cruiser extends Ship
{
    Cruiser(byte x, byte y, char direction)
    {
        super(x, y, direction);
        this.health = this.length = 3;
    }
}

class Submarine extends Ship
{
    Submarine(byte x, byte y, char direction)
    {
        super(x, y, direction);
        this.health = this.length = 3;
    }
}

class Destroyer extends Ship
{
    Destroyer(byte x, byte y, char direction)
    {
        super(x, y, direction);
        this.health = this.length = 5;
    }
}
