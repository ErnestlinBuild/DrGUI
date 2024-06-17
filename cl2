if game.CoreGui:FindFirstChild("Blood1") then game.CoreGui:FindFirstChild("Blood1"):Destroy() end
local players = _G.PlayerAName

Blood1 = Instance.new("ScreenGui")
Bloodui = Instance.new("Frame")

BloodHelp = Instance.new("TextLabel")
line1 = Instance.new("Frame")
scrollingframe = Instance.new("ScrollingFrame")

Mouse = game.Players.LocalPlayer:GetMouse()
local player = game.Players.LocalPlayer
--Properties:
Blood1.Name = "Blood1"
Blood1.Parent = game.CoreGui
Blood1.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
 
Bloodui.Name = "Bloodui"
Bloodui.Parent = Blood1
Bloodui.BackgroundColor3 = Color3.fromRGB(116, 18, 18)
Bloodui.BorderColor3 = Color3.new(0, 0, 0)
Bloodui.BorderSizePixel = 0
Bloodui.Position = UDim2.new(0.503373802, 0, 0.303439796, 0)
Bloodui.Size = UDim2.new(0, 681, 0, 374)
Bloodui.Active = true
Bloodui.Draggable = true

CloseBLOOD = Instance.new("TextButton")
CloseBLOOD.Name = "CloseBLOOD"
CloseBLOOD.Parent = Bloodui
CloseBLOOD.BackgroundColor3 = Color3.new(0, 0, 0)
CloseBLOOD.BorderColor3 = Color3.fromRGB(196, 40, 28)
CloseBLOOD.Position = UDim2.new(0, 650, 0, 10)
CloseBLOOD.Size = UDim2.new(0, 20, 0, 20)
CloseBLOOD.Font = Enum.Font.Fantasy
CloseBLOOD.FontSize = Enum.FontSize.Size18
CloseBLOOD.Text = "X"
CloseBLOOD.TextColor3 = Color3.new(1, 1, 1)
CloseBLOOD.TextScaled = true
CloseBLOOD.TextWrapped = true
CloseBLOOD.TextSize = 17
CloseBLOOD.MouseButton1Click:Connect(function()
if game.CoreGui:FindFirstChild("Blood1") then game.CoreGui:FindFirstChild("Blood1"):Destroy() end
end)

BloodHelp.Name = "BloodHelp"
BloodHelp.Parent = Bloodui
BloodHelp.BackgroundColor3 = Color3.new(1, 1, 1)
BloodHelp.BackgroundTransparency = 1
BloodHelp.BorderColor3 = Color3.new(0, 0, 0)
BloodHelp.BorderSizePixel = 0
BloodHelp.Position = UDim2.new(0, 0, 0, 0)
BloodHelp.Size = UDim2.new(0, 650, 0, 51)
BloodHelp.Font = Enum.Font.GothamBold
BloodHelp.Text = "Blood Development           Collectors list v1.00"
BloodHelp.TextColor3 = Color3.new(1, 1, 1)
BloodHelp.TextSize = 14
BloodHelp.TextWrapped = true
 
line1.Name = "line1"
line1.Parent = Bloodui
line1.BackgroundColor3 = Color3.new(0.196078, 0.196078, 0.196078)
line1.BorderColor3 = Color3.new(0, 0, 0)
line1.BorderSizePixel = 0
line1.Position = UDim2.new(0.000757578, 0, 0.1, 0)
line1.Size = UDim2.new(0, 675, 0, 2)
 
scrollingframe.Name = "scrollingframe"
scrollingframe.Parent = Bloodui
scrollingframe.BackgroundColor3 = Color3.new(0, 0, 0)
scrollingframe.BorderColor3 = Color3.new(0, 0, 0)
scrollingframe.BorderSizePixel = 0
scrollingframe.Position = UDim2.new(0.01, 0, 0.104927115, 0)
scrollingframe.Size = UDim2.new(0, 130, 0, 332)

Axes = Instance.new("TextButton") 
Axes.Name = "Axes"
Axes.Parent = scrollingframe
Axes.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Axes.BackgroundTransparency = 0.15000000596046
Axes.BorderColor3 = Color3.new(0, 0, 0)
Axes.BorderSizePixel = 0
Axes.Position = UDim2.new(0, 15, 0, 10)
Axes.Size = UDim2.new(0, 100, 0, 13)
Axes.Font = Enum.Font.Gotham
Axes.Text = "Axes"
Axes.TextColor3 = Color3.new(1, 1, 1)
Axes.TextSize = 12
Axes.TextWrapped = true

Truck = Instance.new("TextButton") 
Truck.Name = "Truck"
Truck.Parent = scrollingframe
Truck.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Truck.BackgroundTransparency = 0.15000000596046
Truck.BorderColor3 = Color3.new(0, 0, 0)
Truck.BorderSizePixel = 0
Truck.Position = UDim2.new(0, 15, 0, 27)
Truck.Size = UDim2.new(0, 100, 0, 13)
Truck.Font = Enum.Font.Gotham
Truck.Text = "Trucks"
Truck.TextColor3 = Color3.new(1, 1, 1)
Truck.TextSize = 12
Truck.TextWrapped = true

BoxedGifts = Instance.new("TextButton") 
BoxedGifts.Name = "BoxedGifts"
BoxedGifts.Parent = scrollingframe
BoxedGifts.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
BoxedGifts.BackgroundTransparency = 0.15000000596046
BoxedGifts.BorderColor3 = Color3.new(0, 0, 0)
BoxedGifts.BorderSizePixel = 0
BoxedGifts.Position = UDim2.new(0, 15, 0, 44)
BoxedGifts.Size = UDim2.new(0, 100, 0, 13)
BoxedGifts.Font = Enum.Font.Gotham
BoxedGifts.Text = "Boxed Gifts"
BoxedGifts.TextColor3 = Color3.new(1, 1, 1)
BoxedGifts.TextSize = 12
BoxedGifts.TextWrapped = true

Paintings = Instance.new("TextButton") 
Paintings.Name = "Paintings"
Paintings.Parent = scrollingframe
Paintings.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Paintings.BackgroundTransparency = 0.15000000596046
Paintings.BorderColor3 = Color3.new(0, 0, 0)
Paintings.BorderSizePixel = 0
Paintings.Position = UDim2.new(0, 15, 0, 61)
Paintings.Size = UDim2.new(0, 100, 0, 13)
Paintings.Font = Enum.Font.Gotham
Paintings.Text = "Paintings"
Paintings.TextColor3 = Color3.new(1, 1, 1)
Paintings.TextSize = 12
Paintings.TextWrapped = true

Furnishings = Instance.new("TextButton") 
Furnishings.Name = "Furnishings"
Furnishings.Parent = scrollingframe
Furnishings.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Furnishings.BackgroundTransparency = 0.15000000596046
Furnishings.BorderColor3 = Color3.new(0, 0, 0)
Furnishings.BorderSizePixel = 0
Furnishings.Position = UDim2.new(0, 15, 0, 78)
Furnishings.Size = UDim2.new(0, 100, 0, 13)
Furnishings.Font = Enum.Font.Gotham
Furnishings.Text = "Furnishings"
Furnishings.TextColor3 = Color3.new(1, 1, 1)
Furnishings.TextSize = 12
Furnishings.TextWrapped = true

Glass = Instance.new("TextButton") 
Glass.Name = "Glass"
Glass.Parent = scrollingframe
Glass.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Glass.BackgroundTransparency = 0.15000000596046
Glass.BorderColor3 = Color3.new(0, 0, 0)
Glass.BorderSizePixel = 0
Glass.Position = UDim2.new(0, 15, 0, 95)
Glass.Size = UDim2.new(0, 100, 0, 13)
Glass.Font = Enum.Font.Gotham
Glass.Text = "Glass"
Glass.TextColor3 = Color3.new(1, 1, 1)
Glass.TextSize = 12
Glass.TextWrapped = true

conandsaw = Instance.new("TextButton") 
conandsaw.Name = "conandsaw"
conandsaw.Parent = scrollingframe
conandsaw.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
conandsaw.BackgroundTransparency = 0.15000000596046
conandsaw.BorderColor3 = Color3.new(0, 0, 0)
conandsaw.BorderSizePixel = 0
conandsaw.Position = UDim2.new(0, 15, 0, 112)
conandsaw.Size = UDim2.new(0, 100, 0, 13)
conandsaw.Font = Enum.Font.Gotham
conandsaw.Text = "conv and saw"
conandsaw.TextColor3 = Color3.new(1, 1, 1)
conandsaw.TextSize = 12
conandsaw.TextWrapped = true

wireobj = Instance.new("TextButton") 
wireobj.Name = "wireobj"
wireobj.Parent = scrollingframe
wireobj.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
wireobj.BackgroundTransparency = 0.15000000596046
wireobj.BorderColor3 = Color3.new(0, 0, 0)
wireobj.BorderSizePixel = 0
wireobj.Position = UDim2.new(0, 10, 0, 129)
wireobj.Size = UDim2.new(0, 100, 0, 13)
wireobj.Font = Enum.Font.Gotham
wireobj.Text = "Wire Objects"
wireobj.TextColor3 = Color3.new(1, 1, 1)
wireobj.TextSize = 12
wireobj.TextWrapped = true

other = Instance.new("TextButton") 
other.Name = "other"
other.Parent = scrollingframe
other.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
other.BackgroundTransparency = 0.15000000596046
other.BorderColor3 = Color3.new(0, 0, 0)
other.BorderSizePixel = 0
other.Position = UDim2.new(0, 10, 0, 146)
other.Size = UDim2.new(0, 100, 0, 13)
other.Font = Enum.Font.Gotham
other.Text = "Open Items"
other.TextColor3 = Color3.new(1, 1, 1)
other.TextSize = 12
other.TextWrapped = true


Mainframe = Instance.new("Frame")
Mainframe.Name = "Mainframe"
Mainframe.Parent = Bloodui
Mainframe.BackgroundTransparency = 0
Mainframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Mainframe.BorderColor3 = Color3.new(0, 1, 0)
Mainframe.BorderSizePixel = 0
Mainframe.Position = UDim2.new(0, 140, 0,40)
Mainframe.Size = UDim2.new(0, 531, 0, 330)
Mainframe.Active = true

otherframe = Instance.new("ScrollingFrame")
otherframe.Name = "otherframe"
otherframe.Parent = Mainframe
otherframe.BackgroundTransparency = 0
otherframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
otherframe.BorderColor3 = Color3.new(0, 1, 0)
otherframe.BorderSizePixel = 0
otherframe.Position = UDim2.new(0, 0, 0, 0)
otherframe.CanvasSize = UDim2.new(0, 531, 2, 910)
otherframe.Size = UDim2.new(0, 531, 0, 330)
otherframe.Active = false

wireobjframe = Instance.new("ScrollingFrame")
wireobjframe.Name = "wireobjframe"
wireobjframe.Parent = Mainframe
wireobjframe.BackgroundTransparency = 0
wireobjframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
wireobjframe.BorderColor3 = Color3.new(0, 1, 0)
wireobjframe.BorderSizePixel = 0
wireobjframe.Position = UDim2.new(0, 0, 0,0)
wireobjframe.CanvasSize = UDim2.new(0, 531, 2, 430)
wireobjframe.Size = UDim2.new(0, 531, 0, 330)
wireobjframe.Active = false

conandsawframe = Instance.new("ScrollingFrame")
conandsawframe.Name = "conandsawframe"
conandsawframe.Parent = Mainframe
conandsawframe.BackgroundTransparency = 0
conandsawframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
conandsawframe.BorderColor3 = Color3.new(0, 1, 0)
conandsawframe.BorderSizePixel = 0
conandsawframe.Position = UDim2.new(0, 0, 0,0)
conandsawframe.Size = UDim2.new(0, 531, 0, 330)
conandsawframe.Active = false

Glassframe = Instance.new("ScrollingFrame")
Glassframe.Name = "Glassframe"
Glassframe.Parent = Mainframe
Glassframe.BackgroundTransparency = 0
Glassframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Glassframe.BorderColor3 = Color3.new(0, 1, 0)
Glassframe.BorderSizePixel = 0
Glassframe.Position = UDim2.new(0, 0, 0,0)
Glassframe.Size = UDim2.new(0, 531, 0, 330)
Glassframe.Active = false

Furnishingsframe = Instance.new("ScrollingFrame")
Furnishingsframe.Name = "Furnishingsframe"
Furnishingsframe.Parent = Mainframe
Furnishingsframe.BackgroundTransparency = 0
Furnishingsframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Furnishingsframe.BorderColor3 = Color3.new(0, 1, 0)
Furnishingsframe.BorderSizePixel = 0
Furnishingsframe.Position = UDim2.new(0, 0, 0,0)
Furnishingsframe.Size = UDim2.new(0, 531, 0, 330)
Furnishingsframe.Active = false

Paintingsframe = Instance.new("ScrollingFrame")
Paintingsframe.Name = "Paintingsframe"
Paintingsframe.Parent = Mainframe
Paintingsframe.BackgroundTransparency = 0
Paintingsframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Paintingsframe.BorderColor3 = Color3.new(0, 1, 0)
Paintingsframe.BorderSizePixel = 0
Paintingsframe.Position = UDim2.new(0, 0, 0,0)
Paintingsframe.Size = UDim2.new(0, 531, 0, 330)
Paintingsframe.Active = false

Giftsframe = Instance.new("ScrollingFrame")
Giftsframe.Name = "Giftsframe"
Giftsframe.Parent = Mainframe
Giftsframe.BackgroundTransparency = 0
Giftsframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Giftsframe.BorderColor3 = Color3.new(0, 1, 0)
Giftsframe.BorderSizePixel = 0
Giftsframe.Position = UDim2.new(0, 0, 0,0)
Giftsframe.CanvasSize = UDim2.new(0, 531, 2, 630)
Giftsframe.Size = UDim2.new(0, 531, 0, 330)
Giftsframe.Active = false

Truckframe = Instance.new("ScrollingFrame")
Truckframe.Name = "Truckframe"
Truckframe.Parent = Mainframe
Truckframe.BackgroundTransparency = 0
Truckframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Truckframe.BorderColor3 = Color3.new(0, 1, 0)
Truckframe.BorderSizePixel = 0
Truckframe.Position = UDim2.new(0, 0, 0,0)
Truckframe.Size = UDim2.new(0, 531, 0, 330)
Truckframe.Active = false

Axesframe = Instance.new("ScrollingFrame")
Axesframe.Name = "Axesframe"
Axesframe.Parent = Mainframe
Axesframe.BackgroundTransparency = 0
Axesframe.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
Axesframe.BorderColor3 = Color3.new(0, 1, 0)
Axesframe.BorderSizePixel = 0
Axesframe.Position = UDim2.new(0, 0, 0, 0)
Axesframe.Size = UDim2.new(0, 531, 0, 330)
Axesframe.Active = false

Axetop = Instance.new("TextLabel")
Axetop.Name = "Axetop"
Axetop.Parent = Axesframe
Axetop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Axetop.BackgroundTransparency = 1
Axetop.Position = UDim2.new(0.226410091, 0, 0, -20)
Axetop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Axetop.TextColor3 = Color3.new(1, 1, 1)
Axetop.Font = Enum.Font.Gotham
Axetop.Text = "Axes"
Axetop.TextSize = 16

Trucktop = Instance.new("TextLabel")
Trucktop.Name = "Trucktop"
Trucktop.Parent = Truckframe
Trucktop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Trucktop.BackgroundTransparency = 1
Trucktop.Position = UDim2.new(0.226410091, 0, 0, -20)
Trucktop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Trucktop.TextColor3 = Color3.new(1, 1, 1)
Trucktop.Font = Enum.Font.Gotham
Trucktop.Text = "Trucks"
Trucktop.TextSize = 16

Giftstop = Instance.new("TextLabel")
Giftstop.Name = "Giftstop"
Giftstop.Parent = Giftsframe
Giftstop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Giftstop.BackgroundTransparency = 1
Giftstop.Position = UDim2.new(0.226410091, 0, 0, -50)
Giftstop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Giftstop.TextColor3 = Color3.new(1, 1, 1)
Giftstop.Font = Enum.Font.Gotham
Giftstop.Text = "Boxed Gifts"
Giftstop.TextSize = 16

Paintingstop = Instance.new("TextLabel")
Paintingstop.Name = "Paintingstop"
Paintingstop.Parent = Paintingsframe
Paintingstop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Paintingstop.BackgroundTransparency = 1
Paintingstop.Position = UDim2.new(0.226410091, 0, 0, -20)
Paintingstop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Paintingstop.TextColor3 = Color3.new(1, 1, 1)
Paintingstop.Font = Enum.Font.Gotham
Paintingstop.Text = "Paintings"
Paintingstop.TextSize = 16

Furnishingstop = Instance.new("TextLabel")
Furnishingstop.Name = "Furnishingstop"
Furnishingstop.Parent = Furnishingsframe
Furnishingstop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Furnishingstop.BackgroundTransparency = 1
Furnishingstop.Position = UDim2.new(0.226410091, 0, 0, -20)
Furnishingstop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Furnishingstop.TextColor3 = Color3.new(1, 1, 1)
Furnishingstop.Font = Enum.Font.Gotham
Furnishingstop.Text = "Furnishings"
Furnishingstop.TextSize = 16

Glasstop = Instance.new("TextLabel")
Glasstop.Name = "Glasstop"
Glasstop.Parent = Glassframe
Glasstop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
Glasstop.BackgroundTransparency = 1
Glasstop.Position = UDim2.new(0.226410091, 0, 0, -20)
Glasstop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
Glasstop.TextColor3 = Color3.new(1, 1, 1)
Glasstop.Font = Enum.Font.Gotham
Glasstop.Text = "Glass"
Glasstop.TextSize = 16

conandsawtop = Instance.new("TextLabel")
conandsawtop.Name = "conandsawtop"
conandsawtop.Parent = conandsawframe
conandsawtop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
conandsawtop.BackgroundTransparency = 1
conandsawtop.Position = UDim2.new(0.226410091, 0, 0, -20)
conandsawtop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
conandsawtop.TextColor3 = Color3.new(1, 1, 1)
conandsawtop.Font = Enum.Font.Gotham
conandsawtop.Text = "Sawmills And Conveyors"
conandsawtop.TextSize = 16

wireobjtop = Instance.new("TextLabel")
wireobjtop.Name = "wireobjtop"
wireobjtop.Parent = wireobjframe
wireobjtop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
wireobjtop.BackgroundTransparency = 1
wireobjtop.Position = UDim2.new(0.226410091, 0, 0, -50)
wireobjtop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
wireobjtop.TextColor3 = Color3.new(1, 1, 1)
wireobjtop.Font = Enum.Font.Gotham
wireobjtop.Text = "Wire Objects"
wireobjtop.TextSize = 16

othertop = Instance.new("TextLabel")
othertop.Name = "othertop"
othertop.Parent = otherframe
othertop.BackgroundColor3 = Color3.new(0.235294, 0.235294, 0.235294)
othertop.BackgroundTransparency = 1
othertop.Position = UDim2.new(0.226410091, 0, 0, -70)
othertop.Size = UDim2.new(0.522657692, 0, 0.1364429, 0)
othertop.TextColor3 = Color3.new(1, 1, 1)
othertop.Font = Enum.Font.Gotham
othertop.Text = "Open Objects"
othertop.TextSize = 16



BasicHatchetInfo = Instance.new("ImageLabel")
BasicHatchetInfo.BackgroundTransparency = 1
BasicHatchetInfo.Name = "BasicHatchetInfo"
BasicHatchetInfo.Parent = Axesframe
BasicHatchetInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BasicHatchetInfo.Position = UDim2.new(0, 75, 0, 40)
BasicHatchetInfo.Size = UDim2.new(0, 40, 0, 60)
BasicHatchetInfo.Image = "rbxassetid://3210371764"
BasicHatchetInfo.Visible = true

BasicHatchet = Instance.new("TextLabel")
BasicHatchet.Name = "BasicHatchet"
BasicHatchet.Parent = Axesframe
BasicHatchet.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BasicHatchet.BackgroundTransparency = 0.1
BasicHatchet.BorderColor3 = Color3.new(0, 0, 0)
BasicHatchet.BorderSizePixel = 0
BasicHatchet.Position = UDim2.new(0, 45, 0, 110)
BasicHatchet.Size = UDim2.new(0, 80, 0, 15)
BasicHatchet.TextColor3 = Color3.new(1, 1, 1)
BasicHatchet.Font = Enum.Font.SourceSans
BasicHatchet.FontSize = Enum.FontSize.Size14
BasicHatchet.Text = "BasicHatchet"
BasicHatchet.TextScaled = true
BasicHatchet.TextSize = 14
BasicHatchet.TextWrapped = true

BasicHatchetItems = Instance.new("TextLabel")
BasicHatchetItems.Name = "BasicHatchetItems1"
BasicHatchetItems.Parent = Axesframe
BasicHatchetItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BasicHatchetItems.BackgroundTransparency = 0.1
BasicHatchetItems.BorderColor3 = Color3.new(0, 0, 0)
BasicHatchetItems.BorderSizePixel = 0
BasicHatchetItems.Position = UDim2.new(0, 127, 0, 110)
BasicHatchetItems.Size = UDim2.new(0, 20, 0, 15)
BasicHatchetItems.TextColor3 = Color3.new(1, 1, 1)
BasicHatchetItems.Font = Enum.Font.SourceSans
BasicHatchetItems.FontSize = Enum.FontSize.Size14
BasicHatchetItems.Text = "0"
BasicHatchetItems.TextScaled = true
BasicHatchetItems.TextSize = 14
BasicHatchetItems.TextWrapped = true

Axe1Info = Instance.new("ImageLabel")
Axe1Info.BackgroundTransparency = 1
Axe1Info.Name = "Axe1Info"
Axe1Info.Parent = Axesframe
Axe1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Axe1Info.Position = UDim2.new(0, 190, 0, 40)
Axe1Info.Size = UDim2.new(0, 40, 0, 60)
Axe1Info.Image = "rbxassetid://3210409775"
Axe1Info.Visible = true

Axe1 = Instance.new("TextLabel")
Axe1.Name = "Axe1"
Axe1.Parent = Axesframe
Axe1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe1.BackgroundTransparency = 0.1
Axe1.BorderColor3 = Color3.new(0, 0, 0)
Axe1.BorderSizePixel = 0
Axe1.Position = UDim2.new(0, 160, 0, 110)
Axe1.Size = UDim2.new(0, 80, 0, 15)
Axe1.TextColor3 = Color3.new(1, 1, 1)
Axe1.Font = Enum.Font.SourceSans
Axe1.FontSize = Enum.FontSize.Size14
Axe1.Text = "Plain Axe"
Axe1.TextScaled = true
Axe1.TextSize = 14
Axe1.TextWrapped = true

Axe1Items = Instance.new("TextLabel")
Axe1Items.Name = "Axe1Items1"
Axe1Items.Parent = Axesframe
Axe1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe1Items.BackgroundTransparency = 0.1
Axe1Items.BorderColor3 = Color3.new(0, 0, 0)
Axe1Items.BorderSizePixel = 0
Axe1Items.Position = UDim2.new(0, 242, 0, 110)
Axe1Items.Size = UDim2.new(0, 20, 0, 15)
Axe1Items.TextColor3 = Color3.new(1, 1, 1)
Axe1Items.Font = Enum.Font.SourceSans
Axe1Items.FontSize = Enum.FontSize.Size14
Axe1Items.Text = "0"
Axe1Items.TextScaled = true
Axe1Items.TextSize = 14
Axe1Items.TextWrapped = true

Axe2Info = Instance.new("ImageLabel")
Axe2Info.BackgroundTransparency = 1
Axe2Info.Name = "Axe2Info"
Axe2Info.Parent = Axesframe
Axe2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Axe2Info.Position = UDim2.new(0, 300, 0, 40)
Axe2Info.Size = UDim2.new(0, 40, 0, 60)
Axe2Info.Image = "rbxassetid://3210411391"
Axe2Info.Visible = true

Axe2 = Instance.new("TextLabel")
Axe2.Name = "Axe2"
Axe2.Parent = Axesframe
Axe2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe2.BackgroundTransparency = 0.1
Axe2.BorderColor3 = Color3.new(0, 0, 0)
Axe2.BorderSizePixel = 0
Axe2.Position = UDim2.new(0, 275, 0, 110)
Axe2.Size = UDim2.new(0, 80, 0, 15)
Axe2.TextColor3 = Color3.new(1, 1, 1)
Axe2.Font = Enum.Font.SourceSans
Axe2.FontSize = Enum.FontSize.Size14
Axe2.Text = "Steel Axe"
Axe2.TextScaled = true
Axe2.TextSize = 14
Axe2.TextWrapped = true

Axe2Items = Instance.new("TextLabel")
Axe2Items.Name = "Axe2Items1"
Axe2Items.Parent = Axesframe
Axe2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe2Items.BackgroundTransparency = 0.1
Axe2Items.BorderColor3 = Color3.new(0, 0, 0)
Axe2Items.BorderSizePixel = 0
Axe2Items.Position = UDim2.new(0, 357, 0, 110)
Axe2Items.Size = UDim2.new(0, 20, 0, 15)
Axe2Items.TextColor3 = Color3.new(1, 1, 1)
Axe2Items.Font = Enum.Font.SourceSans
Axe2Items.FontSize = Enum.FontSize.Size14
Axe2Items.Text = "0"
Axe2Items.TextScaled = true
Axe2Items.TextSize = 14
Axe2Items.TextWrapped = true

Axe3Info = Instance.new("ImageLabel")
Axe3Info.BackgroundTransparency = 1
Axe3Info.Name = "Axe3Info"
Axe3Info.Parent = Axesframe
Axe3Info.BackgroundColor3 = Color3.new(1, 1, 1)
Axe3Info.Position = UDim2.new(0, 410, 0, 40)
Axe3Info.Size = UDim2.new(0, 40, 0, 60)
Axe3Info.Image = "rbxassetid://3210411391"
Axe3Info.Visible = true

Axe3 = Instance.new("TextLabel")
Axe3.Name = "Axe3"
Axe3.Parent = Axesframe
Axe3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe3.BackgroundTransparency = 0.1
Axe3.BorderColor3 = Color3.new(0, 0, 0)
Axe3.BorderSizePixel = 0
Axe3.Position = UDim2.new(0, 390, 0, 110)
Axe3.Size = UDim2.new(0, 80, 0, 15)
Axe3.TextColor3 = Color3.new(1, 1, 1)
Axe3.Font = Enum.Font.SourceSans
Axe3.FontSize = Enum.FontSize.Size14
Axe3.Text = "Hardened Axe"
Axe3.TextScaled = true
Axe3.TextSize = 14
Axe3.TextWrapped = true

Axe3Items = Instance.new("TextLabel")
Axe3Items.Name = "Axe3Items1"
Axe3Items.Parent = Axesframe
Axe3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Axe3Items.BackgroundTransparency = 0.1
Axe3Items.BorderColor3 = Color3.new(0, 0, 0)
Axe3Items.BorderSizePixel = 0
Axe3Items.Position = UDim2.new(0, 472, 0, 110)
Axe3Items.Size = UDim2.new(0, 20, 0, 15)
Axe3Items.TextColor3 = Color3.new(1, 1, 1)
Axe3Items.Font = Enum.Font.SourceSans
Axe3Items.FontSize = Enum.FontSize.Size14
Axe3Items.Text = "0"
Axe3Items.TextScaled = true
Axe3Items.TextSize = 14
Axe3Items.TextWrapped = true


AxeAlphaInfo = Instance.new("ImageLabel")
AxeAlphaInfo.BackgroundTransparency = 1
AxeAlphaInfo.Name = "AxeAlphaInfo"
AxeAlphaInfo.Parent = Axesframe
AxeAlphaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeAlphaInfo.Position = UDim2.new(0, 75, 0, 140)
AxeAlphaInfo.Size = UDim2.new(0, 40, 0, 60)
AxeAlphaInfo.Image = "rbxassetid://3210418097"
AxeAlphaInfo.Visible = true

AxeAlpha = Instance.new("TextLabel")
AxeAlpha.Name = "AxeAlpha"
AxeAlpha.Parent = Axesframe
AxeAlpha.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeAlpha.BackgroundTransparency = 0.1
AxeAlpha.BorderColor3 = Color3.new(0, 0, 0)
AxeAlpha.BorderSizePixel = 0
AxeAlpha.Position = UDim2.new(0, 45, 0, 210)
AxeAlpha.Size = UDim2.new(0, 80, 0, 15)
AxeAlpha.TextColor3 = Color3.new(1, 1, 1)
AxeAlpha.Font = Enum.Font.SourceSans
AxeAlpha.FontSize = Enum.FontSize.Size14
AxeAlpha.Text = "Alpha Testers Axe"
AxeAlpha.TextScaled = true
AxeAlpha.TextSize = 14
AxeAlpha.TextWrapped = true

AxeAlphaItems = Instance.new("TextLabel")
AxeAlphaItems.Name = "AxeAlphaItems1"
AxeAlphaItems.Parent = Axesframe
AxeAlphaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeAlphaItems.BackgroundTransparency = 0.1
AxeAlphaItems.BorderColor3 = Color3.new(0, 0, 0)
AxeAlphaItems.BorderSizePixel = 0
AxeAlphaItems.Position = UDim2.new(0, 127, 0, 210)
AxeAlphaItems.Size = UDim2.new(0, 20, 0, 15)
AxeAlphaItems.TextColor3 = Color3.new(1, 1, 1)
AxeAlphaItems.Font = Enum.Font.SourceSans
AxeAlphaItems.FontSize = Enum.FontSize.Size14
AxeAlphaItems.Text = "0"
AxeAlphaItems.TextScaled = true
AxeAlphaItems.TextSize = 14
AxeAlphaItems.TextWrapped = true

RukiryInfo = Instance.new("ImageLabel")
RukiryInfo.BackgroundTransparency = 1
RukiryInfo.Name = "RukiryInfo"
RukiryInfo.Parent = Axesframe
RukiryInfo.BackgroundColor3 = Color3.new(1, 1, 1)
RukiryInfo.Position = UDim2.new(0, 190, 0, 140)
RukiryInfo.Size = UDim2.new(0, 40, 0, 60)
RukiryInfo.Image = "rbxassetid://3210434960"
RukiryInfo.Visible = true

Rukiry = Instance.new("TextLabel")
Rukiry.Name = "Rukiry"
Rukiry.Parent = Axesframe
Rukiry.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Rukiry.BackgroundTransparency = 0.1
Rukiry.BorderColor3 = Color3.new(0, 0, 0)
Rukiry.BorderSizePixel = 0
Rukiry.Position = UDim2.new(0, 160, 0, 210)
Rukiry.Size = UDim2.new(0, 80, 0, 15)
Rukiry.TextColor3 = Color3.new(1, 1, 1)
Rukiry.Font = Enum.Font.SourceSans
Rukiry.FontSize = Enum.FontSize.Size14
Rukiry.Text = "Rukiry Axe"
Rukiry.TextScaled = true
Rukiry.TextSize = 14
Rukiry.TextWrapped = true

RukiryItems = Instance.new("TextLabel")
RukiryItems.Name = "RukiryItems1"
RukiryItems.Parent = Axesframe
RukiryItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RukiryItems.BackgroundTransparency = 0.1
RukiryItems.BorderColor3 = Color3.new(0, 0, 0)
RukiryItems.BorderSizePixel = 0
RukiryItems.Position = UDim2.new(0, 242, 0, 210)
RukiryItems.Size = UDim2.new(0, 20, 0, 15)
RukiryItems.TextColor3 = Color3.new(1, 1, 1)
RukiryItems.Font = Enum.Font.SourceSans
RukiryItems.FontSize = Enum.FontSize.Size14
RukiryItems.Text = "0"
RukiryItems.TextScaled = true
RukiryItems.TextSize = 14
RukiryItems.TextWrapped = true

AxeBetaInfo = Instance.new("ImageLabel")
AxeBetaInfo.BackgroundTransparency = 1
AxeBetaInfo.Name = "AxeBetaInfo"
AxeBetaInfo.Parent = Axesframe
AxeBetaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeBetaInfo.Position = UDim2.new(0, 300, 0, 140)
AxeBetaInfo.Size = UDim2.new(0, 40, 0, 60)
AxeBetaInfo.Image = "rbxassetid://3210434960"
AxeBetaInfo.Visible = true

AxeBeta = Instance.new("TextLabel")
AxeBeta.Name = "AxeBeta"
AxeBeta.Parent = Axesframe
AxeBeta.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeBeta.BackgroundTransparency = 0.1
AxeBeta.BorderColor3 = Color3.new(0, 0, 0)
AxeBeta.BorderSizePixel = 0
AxeBeta.Position = UDim2.new(0, 275, 0, 210)
AxeBeta.Size = UDim2.new(0, 80, 0, 15)
AxeBeta.TextColor3 = Color3.new(1, 1, 1)
AxeBeta.Font = Enum.Font.SourceSans
AxeBeta.FontSize = Enum.FontSize.Size14
AxeBeta.Text = "Beta Testers Axe"
AxeBeta.TextScaled = true
AxeBeta.TextSize = 14
AxeBeta.TextWrapped = true

AxeBetaItems = Instance.new("TextLabel")
AxeBetaItems.Name = "AxeBetaItems1"
AxeBetaItems.Parent = Axesframe
AxeBetaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeBetaItems.BackgroundTransparency = 0.1
AxeBetaItems.BorderColor3 = Color3.new(0, 0, 0)
AxeBetaItems.BorderSizePixel = 0
AxeBetaItems.Position = UDim2.new(0, 357, 0, 210)
AxeBetaItems.Size = UDim2.new(0, 20, 0, 15)
AxeBetaItems.TextColor3 = Color3.new(1, 1, 1)
AxeBetaItems.Font = Enum.Font.SourceSans
AxeBetaItems.FontSize = Enum.FontSize.Size14
AxeBetaItems.Text = "0"
AxeBetaItems.TextScaled = true
AxeBetaItems.TextSize = 14
AxeBetaItems.TextWrapped = true

SilverAxeInfo = Instance.new("ImageLabel")
SilverAxeInfo.BackgroundTransparency = 1
SilverAxeInfo.Name = "SilverAxeInfo"
SilverAxeInfo.Parent = Axesframe
SilverAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SilverAxeInfo.Position = UDim2.new(0, 410, 0, 140)
SilverAxeInfo.Size = UDim2.new(0, 40, 0, 60)
SilverAxeInfo.Image = "rbxassetid://3210436244"
SilverAxeInfo.Visible = true

SilverAxe = Instance.new("TextLabel")
SilverAxe.Name = "SilverAxe"
SilverAxe.Parent = Axesframe
SilverAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SilverAxe.BackgroundTransparency = 0.1
SilverAxe.BorderColor3 = Color3.new(0, 0, 0)
SilverAxe.BorderSizePixel = 0
SilverAxe.Position = UDim2.new(0, 390, 0, 210)
SilverAxe.Size = UDim2.new(0, 80, 0, 15)
SilverAxe.TextColor3 = Color3.new(1, 1, 1)
SilverAxe.Font = Enum.Font.SourceSans
SilverAxe.FontSize = Enum.FontSize.Size14
SilverAxe.Text = "SilverAxe"
SilverAxe.TextScaled = true
SilverAxe.TextSize = 14
SilverAxe.TextWrapped = true

SilverAxeItems = Instance.new("TextLabel")
SilverAxeItems.Name = "SilverAxeItems1"
SilverAxeItems.Parent = Axesframe
SilverAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SilverAxeItems.BackgroundTransparency = 0.1
SilverAxeItems.BorderColor3 = Color3.new(0, 0, 0)
SilverAxeItems.BorderSizePixel = 0
SilverAxeItems.Position = UDim2.new(0, 472, 0, 210)
SilverAxeItems.Size = UDim2.new(0, 20, 0, 15)
SilverAxeItems.TextColor3 = Color3.new(1, 1, 1)
SilverAxeItems.Font = Enum.Font.SourceSans
SilverAxeItems.FontSize = Enum.FontSize.Size14
SilverAxeItems.Text = "0"
SilverAxeItems.TextScaled = true
SilverAxeItems.TextSize = 14
SilverAxeItems.TextWrapped = true

EndTimesAxeInfo = Instance.new("ImageLabel")
EndTimesAxeInfo.BackgroundTransparency = 1
EndTimesAxeInfo.Name = "EndTimesAxeInfo"
EndTimesAxeInfo.Parent = Axesframe
EndTimesAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
EndTimesAxeInfo.Position = UDim2.new(0, 75, 0, 240)
EndTimesAxeInfo.Size = UDim2.new(0, 40, 0, 60)
EndTimesAxeInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=508630034"
EndTimesAxeInfo.Visible = true

EndTimesAxe = Instance.new("TextLabel")
EndTimesAxe.Name = "EndTimesAxe"
EndTimesAxe.Parent = Axesframe
EndTimesAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
EndTimesAxe.BackgroundTransparency = 0.1
EndTimesAxe.BorderColor3 = Color3.new(0, 0, 0)
EndTimesAxe.BorderSizePixel = 0
EndTimesAxe.Position = UDim2.new(0, 45, 0, 310)
EndTimesAxe.Size = UDim2.new(0, 80, 0, 15)
EndTimesAxe.TextColor3 = Color3.new(1, 1, 1)
EndTimesAxe.Font = Enum.Font.SourceSans
EndTimesAxe.FontSize = Enum.FontSize.Size14
EndTimesAxe.Text = "EndTimesAxe"
EndTimesAxe.TextScaled = true
EndTimesAxe.TextSize = 14
EndTimesAxe.TextWrapped = true

EndTimesAxeItems = Instance.new("TextLabel")
EndTimesAxeItems.Name = "EndTimesAxeItems1"
EndTimesAxeItems.Parent = Axesframe
EndTimesAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
EndTimesAxeItems.BackgroundTransparency = 0.1
EndTimesAxeItems.BorderColor3 = Color3.new(0, 0, 0)
EndTimesAxeItems.BorderSizePixel = 0
EndTimesAxeItems.Position = UDim2.new(0, 127, 0, 310)
EndTimesAxeItems.Size = UDim2.new(0, 20, 0, 15)
EndTimesAxeItems.TextColor3 = Color3.new(1, 1, 1)
EndTimesAxeItems.Font = Enum.Font.SourceSans
EndTimesAxeItems.FontSize = Enum.FontSize.Size14
EndTimesAxeItems.Text = "0"
EndTimesAxeItems.TextScaled = true
EndTimesAxeItems.TextSize = 14
EndTimesAxeItems.TextWrapped = true

AxeChickenInfo = Instance.new("ImageLabel")
AxeChickenInfo.BackgroundTransparency = 1
AxeChickenInfo.Name = "AxeChickenInfo"
AxeChickenInfo.Parent = Axesframe
AxeChickenInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeChickenInfo.Position = UDim2.new(0, 190, 0, 240)
AxeChickenInfo.Size = UDim2.new(0, 40, 0, 60)
AxeChickenInfo.Image = "rbxassetid://3210423009"
AxeChickenInfo.Visible = true

AxeChicken = Instance.new("TextLabel")
AxeChicken.Name = "AxeChicken"
AxeChicken.Parent = Axesframe
AxeChicken.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeChicken.BackgroundTransparency = 0.1
AxeChicken.BorderColor3 = Color3.new(0, 0, 0)
AxeChicken.BorderSizePixel = 0
AxeChicken.Position = UDim2.new(0, 160, 0, 310)
AxeChicken.Size = UDim2.new(0, 80, 0, 15)
AxeChicken.TextColor3 = Color3.new(1, 1, 1)
AxeChicken.Font = Enum.Font.SourceSans
AxeChicken.FontSize = Enum.FontSize.Size14
AxeChicken.Text = "Chicken Axe"
AxeChicken.TextScaled = true
AxeChicken.TextSize = 14
AxeChicken.TextWrapped = true

AxeChickenItems = Instance.new("TextLabel")
AxeChickenItems.Name = "AxeChickenItems1"
AxeChickenItems.Parent = Axesframe
AxeChickenItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeChickenItems.BackgroundTransparency = 0.1
AxeChickenItems.BorderColor3 = Color3.new(0, 0, 0)
AxeChickenItems.BorderSizePixel = 0
AxeChickenItems.Position = UDim2.new(0, 242, 0, 310)
AxeChickenItems.Size = UDim2.new(0, 20, 0, 15)
AxeChickenItems.TextColor3 = Color3.new(1, 1, 1)
AxeChickenItems.Font = Enum.Font.SourceSans
AxeChickenItems.FontSize = Enum.FontSize.Size14
AxeChickenItems.Text = "0"
AxeChickenItems.TextScaled = true
AxeChickenItems.TextSize = 14
AxeChickenItems.TextWrapped = true

CandyCaneAxeInfo = Instance.new("ImageLabel")
CandyCaneAxeInfo.BackgroundTransparency = 1
CandyCaneAxeInfo.Name = "CandyCaneAxeInfo"
CandyCaneAxeInfo.Parent = Axesframe
CandyCaneAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CandyCaneAxeInfo.Position = UDim2.new(0, 300, 0, 240)
CandyCaneAxeInfo.Size = UDim2.new(0, 40, 0, 60)
CandyCaneAxeInfo.Image = "rbxassetid://3210428043"
CandyCaneAxeInfo.Visible = true

CandyCaneAxe = Instance.new("TextLabel")
CandyCaneAxe.Name = "CandyCaneAxe"
CandyCaneAxe.Parent = Axesframe
CandyCaneAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCaneAxe.BackgroundTransparency = 0.1
CandyCaneAxe.BorderColor3 = Color3.new(0, 0, 0)
CandyCaneAxe.BorderSizePixel = 0
CandyCaneAxe.Position = UDim2.new(0, 275, 0, 310)
CandyCaneAxe.Size = UDim2.new(0, 80, 0, 15)
CandyCaneAxe.TextColor3 = Color3.new(1, 1, 1)
CandyCaneAxe.Font = Enum.Font.SourceSans
CandyCaneAxe.FontSize = Enum.FontSize.Size14
CandyCaneAxe.Text = "Chicken Axe"
CandyCaneAxe.TextScaled = true
CandyCaneAxe.TextSize = 14
CandyCaneAxe.TextWrapped = true

CandyCaneAxeItems = Instance.new("TextLabel")
CandyCaneAxeItems.Name = "CandyCaneAxeItems1"
CandyCaneAxeItems.Parent = Axesframe
CandyCaneAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCaneAxeItems.BackgroundTransparency = 0.1
CandyCaneAxeItems.BorderColor3 = Color3.new(0, 0, 0)
CandyCaneAxeItems.BorderSizePixel = 0
CandyCaneAxeItems.Position = UDim2.new(0, 357, 0, 310)
CandyCaneAxeItems.Size = UDim2.new(0, 20, 0, 15)
CandyCaneAxeItems.TextColor3 = Color3.new(1, 1, 1)
CandyCaneAxeItems.Font = Enum.Font.SourceSans
CandyCaneAxeItems.FontSize = Enum.FontSize.Size14
CandyCaneAxeItems.Text = "0"
CandyCaneAxeItems.TextScaled = true
CandyCaneAxeItems.TextSize = 14
CandyCaneAxeItems.TextWrapped = true

BeesaxeInfo = Instance.new("ImageLabel")
BeesaxeInfo.BackgroundTransparency = 1
BeesaxeInfo.Name = "BeesaxeInfo"
BeesaxeInfo.Parent = Axesframe
BeesaxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BeesaxeInfo.Position = UDim2.new(0, 410, 0, 240)
BeesaxeInfo.Size = UDim2.new(0, 40, 0, 60)
BeesaxeInfo.Image = "rbxassetid://3210427203"
BeesaxeInfo.Visible = true

Beesaxe = Instance.new("TextLabel")
Beesaxe.Name = "Beesaxe"
Beesaxe.Parent = Axesframe
Beesaxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Beesaxe.BackgroundTransparency = 0.1
Beesaxe.BorderColor3 = Color3.new(0, 0, 0)
Beesaxe.BorderSizePixel = 0
Beesaxe.Position = UDim2.new(0, 390, 0, 310)
Beesaxe.Size = UDim2.new(0, 80, 0, 15)
Beesaxe.TextColor3 = Color3.new(1, 1, 1)
Beesaxe.Font = Enum.Font.SourceSans
Beesaxe.FontSize = Enum.FontSize.Size14
Beesaxe.Text = "Bees Axe"
Beesaxe.TextScaled = true
Beesaxe.TextSize = 14
Beesaxe.TextWrapped = true

BeesaxeItems = Instance.new("TextLabel")
BeesaxeItems.Name = "BeesaxeItems1"
BeesaxeItems.Parent = Axesframe
BeesaxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BeesaxeItems.BackgroundTransparency = 0.1
BeesaxeItems.BorderColor3 = Color3.new(0, 0, 0)
BeesaxeItems.BorderSizePixel = 0
BeesaxeItems.Position = UDim2.new(0, 472, 0, 310)
BeesaxeItems.Size = UDim2.new(0, 20, 0, 15)
BeesaxeItems.TextColor3 = Color3.new(1, 1, 1)
BeesaxeItems.Font = Enum.Font.SourceSans
BeesaxeItems.FontSize = Enum.FontSize.Size14
BeesaxeItems.Text = "0"
BeesaxeItems.TextScaled = true
BeesaxeItems.TextSize = 14
BeesaxeItems.TextWrapped = true

AxeAmberInfo = Instance.new("ImageLabel")
AxeAmberInfo.BackgroundTransparency = 1
AxeAmberInfo.Name = "AxeAmberInfo"
AxeAmberInfo.Parent = Axesframe
AxeAmberInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeAmberInfo.Position = UDim2.new(0, 75, 0, 340)
AxeAmberInfo.Size = UDim2.new(0, 40, 0, 60)
AxeAmberInfo.Image = "rbxassetid://3210420154"
AxeAmberInfo.Visible = true

AxeAmber = Instance.new("TextLabel")
AxeAmber.Name = "AxeAmber"
AxeAmber.Parent = Axesframe
AxeAmber.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeAmber.BackgroundTransparency = 0.1
AxeAmber.BorderColor3 = Color3.new(0, 0, 0)
AxeAmber.BorderSizePixel = 0
AxeAmber.Position = UDim2.new(0, 45, 0, 410)
AxeAmber.Size = UDim2.new(0, 80, 0, 15)
AxeAmber.TextColor3 = Color3.new(1, 1, 1)
AxeAmber.Font = Enum.Font.SourceSans
AxeAmber.FontSize = Enum.FontSize.Size14
AxeAmber.Text = "Amber Axe"
AxeAmber.TextScaled = true
AxeAmber.TextSize = 14
AxeAmber.TextWrapped = true

AxeAmberItems = Instance.new("TextLabel")
AxeAmberItems.Name = "AxeAmberItems1"
AxeAmberItems.Parent = Axesframe
AxeAmberItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeAmberItems.BackgroundTransparency = 0.1
AxeAmberItems.BorderColor3 = Color3.new(0, 0, 0)
AxeAmberItems.BorderSizePixel = 0
AxeAmberItems.Position = UDim2.new(0, 127, 0, 410)
AxeAmberItems.Size = UDim2.new(0, 20, 0, 15)
AxeAmberItems.TextColor3 = Color3.new(1, 1, 1)
AxeAmberItems.Font = Enum.Font.SourceSans
AxeAmberItems.FontSize = Enum.FontSize.Size14
AxeAmberItems.Text = "0"
AxeAmberItems.TextScaled = true
AxeAmberItems.TextSize = 14
AxeAmberItems.TextWrapped = true

GingerbreadAxeInfo = Instance.new("ImageLabel")
GingerbreadAxeInfo.BackgroundTransparency = 1
GingerbreadAxeInfo.Name = "GingerbreadAxeInfo"
GingerbreadAxeInfo.Parent = Axesframe
GingerbreadAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
GingerbreadAxeInfo.Position = UDim2.new(0, 190, 0, 340)
GingerbreadAxeInfo.Size = UDim2.new(0, 40, 0, 60)
GingerbreadAxeInfo.Image = "rbxassetid://3210432611"
GingerbreadAxeInfo.Visible = true

GingerbreadAxe = Instance.new("TextLabel")
GingerbreadAxe.Name = "GingerbreadAxe"
GingerbreadAxe.Parent = Axesframe
GingerbreadAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GingerbreadAxe.BackgroundTransparency = 0.1
GingerbreadAxe.BorderColor3 = Color3.new(0, 0, 0)
GingerbreadAxe.BorderSizePixel = 0
GingerbreadAxe.Position = UDim2.new(0, 160, 0, 410)
GingerbreadAxe.Size = UDim2.new(0, 80, 0, 15)
GingerbreadAxe.TextColor3 = Color3.new(1, 1, 1)
GingerbreadAxe.Font = Enum.Font.SourceSans
GingerbreadAxe.FontSize = Enum.FontSize.Size14
GingerbreadAxe.Text = "Ginger Bread Axe"
GingerbreadAxe.TextScaled = true
GingerbreadAxe.TextSize = 14
GingerbreadAxe.TextWrapped = true

GingerbreadAxeItems = Instance.new("TextLabel")
GingerbreadAxeItems.Name = "GingerbreadAxeItems1"
GingerbreadAxeItems.Parent = Axesframe
GingerbreadAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GingerbreadAxeItems.BackgroundTransparency = 0.1
GingerbreadAxeItems.BorderColor3 = Color3.new(0, 0, 0)
GingerbreadAxeItems.BorderSizePixel = 0
GingerbreadAxeItems.Position = UDim2.new(0, 242, 0, 410)
GingerbreadAxeItems.Size = UDim2.new(0, 20, 0, 15)
GingerbreadAxeItems.TextColor3 = Color3.new(1, 1, 1)
GingerbreadAxeItems.Font = Enum.Font.SourceSans
GingerbreadAxeItems.FontSize = Enum.FontSize.Size14
GingerbreadAxeItems.Text = "0"
GingerbreadAxeItems.TextScaled = true
GingerbreadAxeItems.TextSize = 14
GingerbreadAxeItems.TextWrapped = true

ManyAxeInfo = Instance.new("ImageLabel")
ManyAxeInfo.BackgroundTransparency = 1
ManyAxeInfo.Name = "ManyAxeInfo"
ManyAxeInfo.Parent = Axesframe
ManyAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ManyAxeInfo.Position = UDim2.new(0, 300, 0, 340)
ManyAxeInfo.Size = UDim2.new(0, 40, 0, 60)
ManyAxeInfo.Image = "rbxassetid://3210433766"
ManyAxeInfo.Visible = true

ManyAxe = Instance.new("TextLabel")
ManyAxe.Name = "ManyAxe"
ManyAxe.Parent = Axesframe
ManyAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ManyAxe.BackgroundTransparency = 0.1
ManyAxe.BorderColor3 = Color3.new(0, 0, 0)
ManyAxe.BorderSizePixel = 0
ManyAxe.Position = UDim2.new(0, 275, 0, 410)
ManyAxe.Size = UDim2.new(0, 80, 0, 15)
ManyAxe.TextColor3 = Color3.new(1, 1, 1)
ManyAxe.Font = Enum.Font.SourceSans
ManyAxe.FontSize = Enum.FontSize.Size14
ManyAxe.Text = "Many Axe"
ManyAxe.TextScaled = true
ManyAxe.TextSize = 14
ManyAxe.TextWrapped = true

ManyAxeItems = Instance.new("TextLabel")
ManyAxeItems.Name = "ManyAxeItems1"
ManyAxeItems.Parent = Axesframe
ManyAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ManyAxeItems.BackgroundTransparency = 0.1
ManyAxeItems.BorderColor3 = Color3.new(0, 0, 0)
ManyAxeItems.BorderSizePixel = 0
ManyAxeItems.Position = UDim2.new(0, 357, 0, 410)
ManyAxeItems.Size = UDim2.new(0, 20, 0, 15)
ManyAxeItems.TextColor3 = Color3.new(1, 1, 1)
ManyAxeItems.Font = Enum.Font.SourceSans
ManyAxeItems.FontSize = Enum.FontSize.Size14
ManyAxeItems.Text = "0"
ManyAxeItems.TextScaled = true
ManyAxeItems.TextSize = 14
ManyAxeItems.TextWrapped = true

AxeTwitterInfo = Instance.new("ImageLabel")
AxeTwitterInfo.BackgroundTransparency = 1
AxeTwitterInfo.Name = "AxeTwitterInfo"
AxeTwitterInfo.Parent = Axesframe
AxeTwitterInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeTwitterInfo.Position = UDim2.new(0, 410, 0, 340)
AxeTwitterInfo.Size = UDim2.new(0, 40, 0, 60)
AxeTwitterInfo.Image = "rbxassetid://3210424323"
AxeTwitterInfo.Visible = true

AxeTwitter = Instance.new("TextLabel")
AxeTwitter.Name = "AxeTwitter"
AxeTwitter.Parent = Axesframe
AxeTwitter.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeTwitter.BackgroundTransparency = 0.1
AxeTwitter.BorderColor3 = Color3.new(0, 0, 0)
AxeTwitter.BorderSizePixel = 0
AxeTwitter.Position = UDim2.new(0, 390, 0, 410)
AxeTwitter.Size = UDim2.new(0, 80, 0, 15)
AxeTwitter.TextColor3 = Color3.new(1, 1, 1)
AxeTwitter.Font = Enum.Font.SourceSans
AxeTwitter.FontSize = Enum.FontSize.Size14
AxeTwitter.Text = "Twitter Axe"
AxeTwitter.TextScaled = true
AxeTwitter.TextSize = 14
AxeTwitter.TextWrapped = true

AxeTwitterItems = Instance.new("TextLabel")
AxeTwitterItems.Name = "AxeTwitterItems1"
AxeTwitterItems.Parent = Axesframe
AxeTwitterItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeTwitterItems.BackgroundTransparency = 0.1
AxeTwitterItems.BorderColor3 = Color3.new(0, 0, 0)
AxeTwitterItems.BorderSizePixel = 0
AxeTwitterItems.Position = UDim2.new(0, 472, 0, 410)
AxeTwitterItems.Size = UDim2.new(0, 20, 0, 15)
AxeTwitterItems.TextColor3 = Color3.new(1, 1, 1)
AxeTwitterItems.Font = Enum.Font.SourceSans
AxeTwitterItems.FontSize = Enum.FontSize.Size14
AxeTwitterItems.Text = "0"
AxeTwitterItems.TextScaled = true
AxeTwitterItems.TextSize = 14
AxeTwitterItems.TextWrapped = true

RustyAxeInfo = Instance.new("ImageLabel")
RustyAxeInfo.BackgroundTransparency = 1
RustyAxeInfo.Name = "RustyAxeInfo"
RustyAxeInfo.Parent = Axesframe
RustyAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
RustyAxeInfo.Position = UDim2.new(0, 75, 0, 440)
RustyAxeInfo.Size = UDim2.new(0, 40, 0, 60)
RustyAxeInfo.Image = "rbxassetid://4481885638"
RustyAxeInfo.Visible = true

RustyAxe = Instance.new("TextLabel")
RustyAxe.Name = "RustyAxe"
RustyAxe.Parent = Axesframe
RustyAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RustyAxe.BackgroundTransparency = 0.1
RustyAxe.BorderColor3 = Color3.new(0, 0, 0)
RustyAxe.BorderSizePixel = 0
RustyAxe.Position = UDim2.new(0, 45, 0, 510)
RustyAxe.Size = UDim2.new(0, 80, 0, 15)
RustyAxe.TextColor3 = Color3.new(1, 1, 1)
RustyAxe.Font = Enum.Font.SourceSans
RustyAxe.FontSize = Enum.FontSize.Size14
RustyAxe.Text = "Rusty Axe"
RustyAxe.TextScaled = true
RustyAxe.TextSize = 14
RustyAxe.TextWrapped = true

RustyAxeItems = Instance.new("TextLabel")
RustyAxeItems.Name = "RustyAxeItems1"
RustyAxeItems.Parent = Axesframe
RustyAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RustyAxeItems.BackgroundTransparency = 0.1
RustyAxeItems.BorderColor3 = Color3.new(0, 0, 0)
RustyAxeItems.BorderSizePixel = 0
RustyAxeItems.Position = UDim2.new(0, 127, 0, 510)
RustyAxeItems.Size = UDim2.new(0, 20, 0, 15)
RustyAxeItems.TextColor3 = Color3.new(1, 1, 1)
RustyAxeItems.Font = Enum.Font.SourceSans
RustyAxeItems.FontSize = Enum.FontSize.Size14
RustyAxeItems.Text = "0"
RustyAxeItems.TextScaled = true
RustyAxeItems.TextSize = 14
RustyAxeItems.TextWrapped = true

CaveAxeInfo = Instance.new("ImageLabel")
CaveAxeInfo.BackgroundTransparency = 1
CaveAxeInfo.Name = "CaveAxeInfo"
CaveAxeInfo.Parent = Axesframe
CaveAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CaveAxeInfo.Position = UDim2.new(0, 190, 0, 440)
CaveAxeInfo.Size = UDim2.new(0, 40, 0, 60)
CaveAxeInfo.Image = "rbxassetid://4481884766"
CaveAxeInfo.Visible = true

CaveAxe = Instance.new("TextLabel")
CaveAxe.Name = "CaveAxe"
CaveAxe.Parent = Axesframe
CaveAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CaveAxe.BackgroundTransparency = 0.1
CaveAxe.BorderColor3 = Color3.new(0, 0, 0)
CaveAxe.BorderSizePixel = 0
CaveAxe.Position = UDim2.new(0, 160, 0, 510)
CaveAxe.Size = UDim2.new(0, 80, 0, 15)
CaveAxe.TextColor3 = Color3.new(1, 1, 1)
CaveAxe.Font = Enum.Font.SourceSans
CaveAxe.FontSize = Enum.FontSize.Size14
CaveAxe.Text = "Cave Axe"
CaveAxe.TextScaled = true
CaveAxe.TextSize = 14
CaveAxe.TextWrapped = true

CaveAxeItems = Instance.new("TextLabel")
CaveAxeItems.Name = "CaveAxeItems1"
CaveAxeItems.Parent = Axesframe
CaveAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CaveAxeItems.BackgroundTransparency = 0.1
CaveAxeItems.BorderColor3 = Color3.new(0, 0, 0)
CaveAxeItems.BorderSizePixel = 0
CaveAxeItems.Position = UDim2.new(0, 242, 0, 510)
CaveAxeItems.Size = UDim2.new(0, 20, 0, 15)
CaveAxeItems.TextColor3 = Color3.new(1, 1, 1)
CaveAxeItems.Font = Enum.Font.SourceSans
CaveAxeItems.FontSize = Enum.FontSize.Size14
CaveAxeItems.Text = "0"
CaveAxeItems.TextScaled = true
CaveAxeItems.TextSize = 14
CaveAxeItems.TextWrapped = true

CandyCornAxeInfo = Instance.new("ImageLabel")
CandyCornAxeInfo.BackgroundTransparency = 1
CandyCornAxeInfo.Name = "CandyCornAxeInfo"
CandyCornAxeInfo.Parent = Axesframe
CandyCornAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CandyCornAxeInfo.Position = UDim2.new(0, 300, 0, 440)
CandyCornAxeInfo.Size = UDim2.new(0, 40, 0, 60)
CandyCornAxeInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=5680243148"
CandyCornAxeInfo.Visible = true

CandyCornAxe = Instance.new("TextLabel")
CandyCornAxe.Name = "CandyCornAxe"
CandyCornAxe.Parent = Axesframe
CandyCornAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCornAxe.BackgroundTransparency = 0.1
CandyCornAxe.BorderColor3 = Color3.new(0, 0, 0)
CandyCornAxe.BorderSizePixel = 0
CandyCornAxe.Position = UDim2.new(0, 275, 0, 510)
CandyCornAxe.Size = UDim2.new(0, 80, 0, 15)
CandyCornAxe.TextColor3 = Color3.new(1, 1, 1)
CandyCornAxe.Font = Enum.Font.SourceSans
CandyCornAxe.FontSize = Enum.FontSize.Size14
CandyCornAxe.Text = "Candy Corn Axe"
CandyCornAxe.TextScaled = true
CandyCornAxe.TextSize = 14
CandyCornAxe.TextWrapped = true

CandyCornAxeItems = Instance.new("TextLabel")
CandyCornAxeItems.Name = "CandyCornAxeItems1"
CandyCornAxeItems.Parent = Axesframe
CandyCornAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCornAxeItems.BackgroundTransparency = 0.1
CandyCornAxeItems.BorderColor3 = Color3.new(0, 0, 0)
CandyCornAxeItems.BorderSizePixel = 0
CandyCornAxeItems.Position = UDim2.new(0, 357, 0, 510)
CandyCornAxeItems.Size = UDim2.new(0, 20, 0, 15)
CandyCornAxeItems.TextColor3 = Color3.new(1, 1, 1)
CandyCornAxeItems.Font = Enum.Font.SourceSans
CandyCornAxeItems.FontSize = Enum.FontSize.Size14
CandyCornAxeItems.Text = "0"
CandyCornAxeItems.TextScaled = true
CandyCornAxeItems.TextSize = 14
CandyCornAxeItems.TextWrapped = true

FireAxeInfo = Instance.new("ImageLabel")
FireAxeInfo.BackgroundTransparency = 1
FireAxeInfo.Name = "FireAxeInfo"
FireAxeInfo.Parent = Axesframe
FireAxeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
FireAxeInfo.Position = UDim2.new(0, 410, 0, 440)
FireAxeInfo.Size = UDim2.new(0, 40, 0, 60)
FireAxeInfo.Image = "rbxassetid://3210431558"
FireAxeInfo.Visible = true

FireAxe = Instance.new("TextLabel")
FireAxe.Name = "FireAxe"
FireAxe.Parent = Axesframe
FireAxe.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FireAxe.BackgroundTransparency = 0.1
FireAxe.BorderColor3 = Color3.new(0, 0, 0)
FireAxe.BorderSizePixel = 0
FireAxe.Position = UDim2.new(0, 390, 0, 510)
FireAxe.Size = UDim2.new(0, 80, 0, 15)
FireAxe.TextColor3 = Color3.new(1, 1, 1)
FireAxe.Font = Enum.Font.SourceSans
FireAxe.FontSize = Enum.FontSize.Size14
FireAxe.Text = "FireAxe"
FireAxe.TextScaled = true
FireAxe.TextSize = 14
FireAxe.TextWrapped = true

FireAxeItems = Instance.new("TextLabel")
FireAxeItems.Name = "FireAxeItems1"
FireAxeItems.Parent = Axesframe
FireAxeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FireAxeItems.BackgroundTransparency = 0.1
FireAxeItems.BorderColor3 = Color3.new(0, 0, 0)
FireAxeItems.BorderSizePixel = 0
FireAxeItems.Position = UDim2.new(0, 472, 0, 510)
FireAxeItems.Size = UDim2.new(0, 20, 0, 15)
FireAxeItems.TextColor3 = Color3.new(1, 1, 1)
FireAxeItems.Font = Enum.Font.SourceSans
FireAxeItems.FontSize = Enum.FontSize.Size14
FireAxeItems.Text = "0"
FireAxeItems.TextScaled = true
FireAxeItems.TextSize = 14
FireAxeItems.TextWrapped = true


AxeSwampInfo = Instance.new("ImageLabel")
AxeSwampInfo.BackgroundTransparency = 1
AxeSwampInfo.Name = "AxeSwampInfo"
AxeSwampInfo.Parent = Axesframe
AxeSwampInfo.BackgroundColor3 = Color3.new(1, 1, 1)
AxeSwampInfo.Position = UDim2.new(0, 75, 0, 540)
AxeSwampInfo.Size = UDim2.new(0, 40, 0, 60)
AxeSwampInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8178247385"
AxeSwampInfo.Visible = true

AxeSwamp = Instance.new("TextLabel")
AxeSwamp.Name = "AxeSwamp"
AxeSwamp.Parent = Axesframe
AxeSwamp.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeSwamp.BackgroundTransparency = 0.1
AxeSwamp.BorderColor3 = Color3.new(0, 0, 0)
AxeSwamp.BorderSizePixel = 0
AxeSwamp.Position = UDim2.new(0, 45, 0, 610)
AxeSwamp.Size = UDim2.new(0, 80, 0, 15)
AxeSwamp.TextColor3 = Color3.new(1, 1, 1)
AxeSwamp.Font = Enum.Font.SourceSans
AxeSwamp.FontSize = Enum.FontSize.Size14
AxeSwamp.Text = "Axe Swamp"
AxeSwamp.TextScaled = true
AxeSwamp.TextSize = 14
AxeSwamp.TextWrapped = true

AxeSwampItems = Instance.new("TextLabel")
AxeSwampItems.Name = "AxeSwampItems1"
AxeSwampItems.Parent = Axesframe
AxeSwampItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
AxeSwampItems.BackgroundTransparency = 0.1
AxeSwampItems.BorderColor3 = Color3.new(0, 0, 0)
AxeSwampItems.BorderSizePixel = 0
AxeSwampItems.Position = UDim2.new(0, 127, 0, 610)
AxeSwampItems.Size = UDim2.new(0, 20, 0, 15)
AxeSwampItems.TextColor3 = Color3.new(1, 1, 1)
AxeSwampItems.Font = Enum.Font.SourceSans
AxeSwampItems.FontSize = Enum.FontSize.Size14
AxeSwampItems.Text = "0"
AxeSwampItems.TextScaled = true
AxeSwampItems.TextSize = 14
AxeSwampItems.TextWrapped = true

UtilityTruckInfo = Instance.new("ImageLabel")
UtilityTruckInfo.BackgroundTransparency = 1
UtilityTruckInfo.Name = "UtilityTruckInfo"
UtilityTruckInfo.Parent = Truckframe
UtilityTruckInfo.BackgroundColor3 = Color3.new(1, 1, 1)
UtilityTruckInfo.Position = UDim2.new(0, 75, 0, 40)
UtilityTruckInfo.Size = UDim2.new(0, 40, 0, 60)
UtilityTruckInfo.Image = "rbxassetid://3704340394"
UtilityTruckInfo.Visible = true

UtilityTruck = Instance.new("TextLabel")
UtilityTruck.Name = "UtilityTruck"
UtilityTruck.Parent = Truckframe
UtilityTruck.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
UtilityTruck.BackgroundTransparency = 0.1
UtilityTruck.BorderColor3 = Color3.new(0, 0, 0)
UtilityTruck.BorderSizePixel = 0
UtilityTruck.Position = UDim2.new(0, 45, 0, 110)
UtilityTruck.Size = UDim2.new(0, 80, 0, 15)
UtilityTruck.TextColor3 = Color3.new(1, 1, 1)
UtilityTruck.Font = Enum.Font.SourceSans
UtilityTruck.FontSize = Enum.FontSize.Size14
UtilityTruck.Text = "Utility Truck"
UtilityTruck.TextScaled = true
UtilityTruck.TextSize = 14
UtilityTruck.TextWrapped = true

UtilityTruckItems = Instance.new("TextLabel")
UtilityTruckItems.Name = "UtilityTruckItems1"
UtilityTruckItems.Parent = Truckframe
UtilityTruckItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
UtilityTruckItems.BackgroundTransparency = 0.1
UtilityTruckItems.BorderColor3 = Color3.new(0, 0, 0)
UtilityTruckItems.BorderSizePixel = 0
UtilityTruckItems.Position = UDim2.new(0, 127, 0, 110)
UtilityTruckItems.Size = UDim2.new(0, 20, 0, 15)
UtilityTruckItems.TextColor3 = Color3.new(1, 1, 1)
UtilityTruckItems.Font = Enum.Font.SourceSans
UtilityTruckItems.FontSize = Enum.FontSize.Size14
UtilityTruckItems.Text = "0"
UtilityTruckItems.TextScaled = true
UtilityTruckItems.TextSize = 14
UtilityTruckItems.TextWrapped = true

UtilityTruck2kInfo = Instance.new("ImageLabel")
UtilityTruck2kInfo.BackgroundTransparency = 1
UtilityTruck2kInfo.Name = "UtilityTruck2kInfo"
UtilityTruck2kInfo.Parent = Truckframe
UtilityTruck2kInfo.BackgroundColor3 = Color3.new(1, 1, 1)
UtilityTruck2kInfo.Position = UDim2.new(0, 190, 0, 40)
UtilityTruck2kInfo.Size = UDim2.new(0, 40, 0, 60)
UtilityTruck2kInfo.Image = "rbxassetid://3704340789"
UtilityTruck2kInfo.Visible = true

UtilityTruck2k = Instance.new("TextLabel")
UtilityTruck2k.Name = "UtilityTruck2k"
UtilityTruck2k.Parent = Truckframe
UtilityTruck2k.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
UtilityTruck2k.BackgroundTransparency = 0.1
UtilityTruck2k.BorderColor3 = Color3.new(0, 0, 0)
UtilityTruck2k.BorderSizePixel = 0
UtilityTruck2k.Position = UDim2.new(0, 160, 0, 110)
UtilityTruck2k.Size = UDim2.new(0, 80, 0, 15)
UtilityTruck2k.TextColor3 = Color3.new(1, 1, 1)
UtilityTruck2k.Font = Enum.Font.SourceSans
UtilityTruck2k.FontSize = Enum.FontSize.Size14
UtilityTruck2k.Text = "Utility Vehicle XL"
UtilityTruck2k.TextScaled = true
UtilityTruck2k.TextSize = 14
UtilityTruck2k.TextWrapped = true

UtilityTruck2kItems = Instance.new("TextLabel")
UtilityTruck2kItems.Name = "UtilityTruck2kItems1"
UtilityTruck2kItems.Parent = Truckframe
UtilityTruck2kItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
UtilityTruck2kItems.BackgroundTransparency = 0.1
UtilityTruck2kItems.BorderColor3 = Color3.new(0, 0, 0)
UtilityTruck2kItems.BorderSizePixel = 0
UtilityTruck2kItems.Position = UDim2.new(0, 242, 0, 110)
UtilityTruck2kItems.Size = UDim2.new(0, 20, 0, 15)
UtilityTruck2kItems.TextColor3 = Color3.new(1, 1, 1)
UtilityTruck2kItems.Font = Enum.Font.SourceSans
UtilityTruck2kItems.FontSize = Enum.FontSize.Size14
UtilityTruck2kItems.Text = "0"
UtilityTruck2kItems.TextScaled = true
UtilityTruck2kItems.TextSize = 14
UtilityTruck2kItems.TextWrapped = true

Pickup1Info = Instance.new("ImageLabel")
Pickup1Info.BackgroundTransparency = 1
Pickup1Info.Name = "Pickup1Info"
Pickup1Info.Parent = Truckframe
Pickup1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Pickup1Info.Position = UDim2.new(0, 300, 0, 40)
Pickup1Info.Size = UDim2.new(0, 40, 0, 60)
Pickup1Info.Image = "rbxassetid://3704338309"
Pickup1Info.Visible = true

Pickup1 = Instance.new("TextLabel")
Pickup1.Name = "Pickup1"
Pickup1.Parent = Truckframe
Pickup1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Pickup1.BackgroundTransparency = 0.1
Pickup1.BorderColor3 = Color3.new(0, 0, 0)
Pickup1.BorderSizePixel = 0
Pickup1.Position = UDim2.new(0, 275, 0, 110)
Pickup1.Size = UDim2.new(0, 80, 0, 15)
Pickup1.TextColor3 = Color3.new(1, 1, 1)
Pickup1.Font = Enum.Font.SourceSans
Pickup1.FontSize = Enum.FontSize.Size14
Pickup1.Text = "Pickup Vehicle"
Pickup1.TextScaled = true
Pickup1.TextSize = 14
Pickup1.TextWrapped = true

Pickup1Items = Instance.new("TextLabel")
Pickup1Items.Name = "Pickup1Items1"
Pickup1Items.Parent = Truckframe
Pickup1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Pickup1Items.BackgroundTransparency = 0.1
Pickup1Items.BorderColor3 = Color3.new(0, 0, 0)
Pickup1Items.BorderSizePixel = 0
Pickup1Items.Position = UDim2.new(0, 357, 0, 110)
Pickup1Items.Size = UDim2.new(0, 20, 0, 15)
Pickup1Items.TextColor3 = Color3.new(1, 1, 1)
Pickup1Items.Font = Enum.Font.SourceSans
Pickup1Items.FontSize = Enum.FontSize.Size14
Pickup1Items.Text = "0"
Pickup1Items.TextScaled = true
Pickup1Items.TextSize = 14
Pickup1Items.TextWrapped = true

SmallTrailerInfo = Instance.new("ImageLabel")
SmallTrailerInfo.BackgroundTransparency = 1
SmallTrailerInfo.Name = "SmallTrailerInfo"
SmallTrailerInfo.Parent = Truckframe
SmallTrailerInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SmallTrailerInfo.Position = UDim2.new(0, 410, 0, 40)
SmallTrailerInfo.Size = UDim2.new(0, 40, 0, 60)
SmallTrailerInfo.Image = "rbxassetid://3709024603"
SmallTrailerInfo.Visible = true

SmallTrailer = Instance.new("TextLabel")
SmallTrailer.Name = "SmallTrailer"
SmallTrailer.Parent = Truckframe
SmallTrailer.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SmallTrailer.BackgroundTransparency = 0.1
SmallTrailer.BorderColor3 = Color3.new(0, 0, 0)
SmallTrailer.BorderSizePixel = 0
SmallTrailer.Position = UDim2.new(0, 390, 0, 110)
SmallTrailer.Size = UDim2.new(0, 80, 0, 15)
SmallTrailer.TextColor3 = Color3.new(1, 1, 1)
SmallTrailer.Font = Enum.Font.SourceSans
SmallTrailer.FontSize = Enum.FontSize.Size14
SmallTrailer.Text = "Small Trailer"
SmallTrailer.TextScaled = true
SmallTrailer.TextSize = 14
SmallTrailer.TextWrapped = true

SmallTrailerItems = Instance.new("TextLabel")
SmallTrailerItems.Name = "SmallTrailerItems1"
SmallTrailerItems.Parent = Truckframe
SmallTrailerItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SmallTrailerItems.BackgroundTransparency = 0.1
SmallTrailerItems.BorderColor3 = Color3.new(0, 0, 0)
SmallTrailerItems.BorderSizePixel = 0
SmallTrailerItems.Position = UDim2.new(0, 472, 0, 110)
SmallTrailerItems.Size = UDim2.new(0, 20, 0, 15)
SmallTrailerItems.TextColor3 = Color3.new(1, 1, 1)
SmallTrailerItems.Font = Enum.Font.SourceSans
SmallTrailerItems.FontSize = Enum.FontSize.Size14
SmallTrailerItems.Text = "0"
SmallTrailerItems.TextScaled = true
SmallTrailerItems.TextSize = 14
SmallTrailerItems.TextWrapped = true

Trailer2Info = Instance.new("ImageLabel")
Trailer2Info.BackgroundTransparency = 1
Trailer2Info.Name = "Trailer2Info"
Trailer2Info.Parent = Truckframe
Trailer2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Trailer2Info.Position = UDim2.new(0, 75, 0, 140)
Trailer2Info.Size = UDim2.new(0, 40, 0, 60)
Trailer2Info.Image = "rbxassetid://3704340009"
Trailer2Info.Visible = true

Trailer2 = Instance.new("TextLabel")
Trailer2.Name = "Trailer2"
Trailer2.Parent = Truckframe
Trailer2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Trailer2.BackgroundTransparency = 0.1
Trailer2.BorderColor3 = Color3.new(0, 0, 0)
Trailer2.BorderSizePixel = 0
Trailer2.Position = UDim2.new(0, 45, 0, 210)
Trailer2.Size = UDim2.new(0, 80, 0, 15)
Trailer2.TextColor3 = Color3.new(1, 1, 1)
Trailer2.Font = Enum.Font.SourceSans
Trailer2.FontSize = Enum.FontSize.Size14
Trailer2.Text = "531 Hauler"
Trailer2.TextScaled = true
Trailer2.TextSize = 14
Trailer2.TextWrapped = true

Trailer2Items = Instance.new("TextLabel")
Trailer2Items.Name = "Trailer2Items1"
Trailer2Items.Parent = Truckframe
Trailer2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Trailer2Items.BackgroundTransparency = 0.1
Trailer2Items.BorderColor3 = Color3.new(0, 0, 0)
Trailer2Items.BorderSizePixel = 0
Trailer2Items.Position = UDim2.new(0, 127, 0, 210)
Trailer2Items.Size = UDim2.new(0, 20, 0, 15)
Trailer2Items.TextColor3 = Color3.new(1, 1, 1)
Trailer2Items.Font = Enum.Font.SourceSans
Trailer2Items.FontSize = Enum.FontSize.Size14
Trailer2Items.Text = "0"
Trailer2Items.TextScaled = true
Trailer2Items.TextSize = 14
Trailer2Items.TextWrapped = true

SleighInfo = Instance.new("ImageLabel")
SleighInfo.BackgroundTransparency = 1
SleighInfo.Name = "SleighInfo"
SleighInfo.Parent = Truckframe
SleighInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SleighInfo.Position = UDim2.new(0, 190, 0, 140)
SleighInfo.Size = UDim2.new(0, 40, 0, 60)
SleighInfo.Image = "rbxassetid://3704339385"
SleighInfo.Visible = true

Sleigh = Instance.new("TextLabel")
Sleigh.Name = "Sleigh"
Sleigh.Parent = Truckframe
Sleigh.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sleigh.BackgroundTransparency = 0.1
Sleigh.BorderColor3 = Color3.new(0, 0, 0)
Sleigh.BorderSizePixel = 0
Sleigh.Position = UDim2.new(0, 160, 0, 210)
Sleigh.Size = UDim2.new(0, 80, 0, 15)
Sleigh.TextColor3 = Color3.new(1, 1, 1)
Sleigh.Font = Enum.Font.SourceSans
Sleigh.FontSize = Enum.FontSize.Size14
Sleigh.Text = "Sleigh"
Sleigh.TextScaled = true
Sleigh.TextSize = 14
Sleigh.TextWrapped = true

SleighItems = Instance.new("TextLabel")
SleighItems.Name = "SleighItems1"
SleighItems.Parent = Truckframe
SleighItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SleighItems.BackgroundTransparency = 0.1
SleighItems.BorderColor3 = Color3.new(0, 0, 0)
SleighItems.BorderSizePixel = 0
SleighItems.Position = UDim2.new(0, 242, 0, 210)
SleighItems.Size = UDim2.new(0, 20, 0, 15)
SleighItems.TextColor3 = Color3.new(1, 1, 1)
SleighItems.Font = Enum.Font.SourceSans
SleighItems.FontSize = Enum.FontSize.Size14
SleighItems.Text = "0"
SleighItems.TextScaled = true
SleighItems.TextSize = 14
SleighItems.TextWrapped = true

BoxedSpork2016Info = Instance.new("ImageLabel")
BoxedSpork2016Info.BackgroundTransparency = 1
BoxedSpork2016Info.Name = "BoxedSpork2016Info"
BoxedSpork2016Info.Parent = Giftsframe
BoxedSpork2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
BoxedSpork2016Info.Position = UDim2.new(0, 75, 0, 40)
BoxedSpork2016Info.Size = UDim2.new(0, 40, 0, 60)
BoxedSpork2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=570841325"
BoxedSpork2016Info.Visible = true

BoxedSpork2016 = Instance.new("TextLabel")
BoxedSpork2016.Name = "BoxedSpork2016"
BoxedSpork2016.Parent = Giftsframe
BoxedSpork2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BoxedSpork2016.BackgroundTransparency = 0.1
BoxedSpork2016.BorderColor3 = Color3.new(0, 0, 0)
BoxedSpork2016.BorderSizePixel = 0
BoxedSpork2016.Position = UDim2.new(0, 45, 0, 110)
BoxedSpork2016.Size = UDim2.new(0, 80, 0, 15)
BoxedSpork2016.TextColor3 = Color3.new(1, 1, 1)
BoxedSpork2016.Font = Enum.Font.SourceSans
BoxedSpork2016.FontSize = Enum.FontSize.Size14
BoxedSpork2016.Text = "Boxed Spork 2016"
BoxedSpork2016.TextScaled = true
BoxedSpork2016.TextSize = 14
BoxedSpork2016.TextWrapped = true

BoxedSpork2016Items = Instance.new("TextLabel")
BoxedSpork2016Items.Name = "BoxedSpork2016Items1"
BoxedSpork2016Items.Parent = Giftsframe
BoxedSpork2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BoxedSpork2016Items.BackgroundTransparency = 0.1
BoxedSpork2016Items.BorderColor3 = Color3.new(0, 0, 0)
BoxedSpork2016Items.BorderSizePixel = 0
BoxedSpork2016Items.Position = UDim2.new(0, 127, 0, 110)
BoxedSpork2016Items.Size = UDim2.new(0, 20, 0, 15)
BoxedSpork2016Items.TextColor3 = Color3.new(1, 1, 1)
BoxedSpork2016Items.Font = Enum.Font.SourceSans
BoxedSpork2016Items.FontSize = Enum.FontSize.Size14
BoxedSpork2016Items.Text = "0"
BoxedSpork2016Items.TextScaled = true
BoxedSpork2016Items.TextSize = 14
BoxedSpork2016Items.TextWrapped = true

PoorlyWrapped2015Info = Instance.new("ImageLabel")
PoorlyWrapped2015Info.BackgroundTransparency = 1
PoorlyWrapped2015Info.Name = "PoorlyWrapped2015Info"
PoorlyWrapped2015Info.Parent = Giftsframe
PoorlyWrapped2015Info.BackgroundColor3 = Color3.new(1, 1, 1)
PoorlyWrapped2015Info.Position = UDim2.new(0, 190, 0, 40)
PoorlyWrapped2015Info.Size = UDim2.new(0, 40, 0, 60)
PoorlyWrapped2015Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=331822630"
PoorlyWrapped2015Info.Visible = true

PoorlyWrapped2015 = Instance.new("TextLabel")
PoorlyWrapped2015.Name = "PoorlyWrapped2015"
PoorlyWrapped2015.Parent = Giftsframe
PoorlyWrapped2015.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PoorlyWrapped2015.BackgroundTransparency = 0.1
PoorlyWrapped2015.BorderColor3 = Color3.new(0, 0, 0)
PoorlyWrapped2015.BorderSizePixel = 0
PoorlyWrapped2015.Position = UDim2.new(0, 160, 0, 110)
PoorlyWrapped2015.Size = UDim2.new(0, 80, 0, 15)
PoorlyWrapped2015.TextColor3 = Color3.new(1, 1, 1)
PoorlyWrapped2015.Font = Enum.Font.SourceSans
PoorlyWrapped2015.FontSize = Enum.FontSize.Size14
PoorlyWrapped2015.Text = "Boxed Coal 2015"
PoorlyWrapped2015.TextScaled = true
PoorlyWrapped2015.TextSize = 14
PoorlyWrapped2015.TextWrapped = true

PoorlyWrapped2015Items = Instance.new("TextLabel")
PoorlyWrapped2015Items.Name = "PoorlyWrapped2015Items1"
PoorlyWrapped2015Items.Parent = Giftsframe
PoorlyWrapped2015Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PoorlyWrapped2015Items.BackgroundTransparency = 0.1
PoorlyWrapped2015Items.BorderColor3 = Color3.new(0, 0, 0)
PoorlyWrapped2015Items.BorderSizePixel = 0
PoorlyWrapped2015Items.Position = UDim2.new(0, 242, 0, 110)
PoorlyWrapped2015Items.Size = UDim2.new(0, 20, 0, 15)
PoorlyWrapped2015Items.TextColor3 = Color3.new(1, 1, 1)
PoorlyWrapped2015Items.Font = Enum.Font.SourceSans
PoorlyWrapped2015Items.FontSize = Enum.FontSize.Size14
PoorlyWrapped2015Items.Text = "0"
PoorlyWrapped2015Items.TextScaled = true
PoorlyWrapped2015Items.TextSize = 14
PoorlyWrapped2015Items.TextWrapped = true

HappyRed2015Info = Instance.new("ImageLabel")
HappyRed2015Info.BackgroundTransparency = 1
HappyRed2015Info.Name = "HappyRed2015Info"
HappyRed2015Info.Parent = Giftsframe
HappyRed2015Info.BackgroundColor3 = Color3.new(1, 1, 1)
HappyRed2015Info.Position = UDim2.new(0, 300, 0, 40)
HappyRed2015Info.Size = UDim2.new(0, 40, 0, 60)
HappyRed2015Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=331836017"
HappyRed2015Info.Visible = true

HappyRed2015 = Instance.new("TextLabel")
HappyRed2015.Name = "HappyRed2015"
HappyRed2015.Parent = Giftsframe
HappyRed2015.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HappyRed2015.BackgroundTransparency = 0.1
HappyRed2015.BorderColor3 = Color3.new(0, 0, 0)
HappyRed2015.BorderSizePixel = 0
HappyRed2015.Position = UDim2.new(0, 275, 0, 110)
HappyRed2015.Size = UDim2.new(0, 80, 0, 15)
HappyRed2015.TextColor3 = Color3.new(1, 1, 1)
HappyRed2015.Font = Enum.Font.SourceSans
HappyRed2015.FontSize = Enum.FontSize.Size14
HappyRed2015.Text = "Happy Red 2015"
HappyRed2015.TextScaled = true
HappyRed2015.TextSize = 14
HappyRed2015.TextWrapped = true

HappyRed2015Items = Instance.new("TextLabel")
HappyRed2015Items.Name = "HappyRed2015Items1"
HappyRed2015Items.Parent = Giftsframe
HappyRed2015Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HappyRed2015Items.BackgroundTransparency = 0.1
HappyRed2015Items.BorderColor3 = Color3.new(0, 0, 0)
HappyRed2015Items.BorderSizePixel = 0
HappyRed2015Items.Position = UDim2.new(0, 357, 0, 110)
HappyRed2015Items.Size = UDim2.new(0, 20, 0, 15)
HappyRed2015Items.TextColor3 = Color3.new(1, 1, 1)
HappyRed2015Items.Font = Enum.Font.SourceSans
HappyRed2015Items.FontSize = Enum.FontSize.Size14
HappyRed2015Items.Text = "0"
HappyRed2015Items.TextScaled = true
HappyRed2015Items.TextSize = 14
HappyRed2015Items.TextWrapped = true

CGift_Sweet2016Info = Instance.new("ImageLabel")
CGift_Sweet2016Info.BackgroundTransparency = 1
CGift_Sweet2016Info.Name = "CGift_Sweet2016Info"
CGift_Sweet2016Info.Parent = Giftsframe
CGift_Sweet2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Sweet2016Info.Position = UDim2.new(0, 410, 0, 40)
CGift_Sweet2016Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Sweet2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=570842097"
CGift_Sweet2016Info.Visible = true

CGift_Sweet2016 = Instance.new("TextLabel")
CGift_Sweet2016.Name = "CGift_Sweet2016"
CGift_Sweet2016.Parent = Giftsframe
CGift_Sweet2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Sweet2016.BackgroundTransparency = 0.1
CGift_Sweet2016.BorderColor3 = Color3.new(0, 0, 0)
CGift_Sweet2016.BorderSizePixel = 0
CGift_Sweet2016.Position = UDim2.new(0, 390, 0, 110)
CGift_Sweet2016.Size = UDim2.new(0, 80, 0, 15)
CGift_Sweet2016.TextColor3 = Color3.new(1, 1, 1)
CGift_Sweet2016.Font = Enum.Font.SourceSans
CGift_Sweet2016.FontSize = Enum.FontSize.Size14
CGift_Sweet2016.Text = "Sweet Gift 2016"
CGift_Sweet2016.TextScaled = true
CGift_Sweet2016.TextSize = 14
CGift_Sweet2016.TextWrapped = true

CGift_Sweet2016Items = Instance.new("TextLabel")
CGift_Sweet2016Items.Name = "CGift_Sweet2016Items1"
CGift_Sweet2016Items.Parent = Giftsframe
CGift_Sweet2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Sweet2016Items.BackgroundTransparency = 0.1
CGift_Sweet2016Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Sweet2016Items.BorderSizePixel = 0
CGift_Sweet2016Items.Position = UDim2.new(0, 472, 0, 110)
CGift_Sweet2016Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Sweet2016Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Sweet2016Items.Font = Enum.Font.SourceSans
CGift_Sweet2016Items.FontSize = Enum.FontSize.Size14
CGift_Sweet2016Items.Text = "0"
CGift_Sweet2016Items.TextScaled = true
CGift_Sweet2016Items.TextSize = 14
CGift_Sweet2016Items.TextWrapped = true


CGift_Volcano2015Info = Instance.new("ImageLabel")
CGift_Volcano2015Info.BackgroundTransparency = 1
CGift_Volcano2015Info.Name = "CGift_Volcano2015Info"
CGift_Volcano2015Info.Parent = Giftsframe
CGift_Volcano2015Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Volcano2015Info.Position = UDim2.new(0, 75, 0, 140)
CGift_Volcano2015Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Volcano2015Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=331816284"
CGift_Volcano2015Info.Visible = true

CGift_Volcano2015 = Instance.new("TextLabel")
CGift_Volcano2015.Name = "CGift_Volcano2015"
CGift_Volcano2015.Parent = Giftsframe
CGift_Volcano2015.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Volcano2015.BackgroundTransparency = 0.1
CGift_Volcano2015.BorderColor3 = Color3.new(0, 0, 0)
CGift_Volcano2015.BorderSizePixel = 0
CGift_Volcano2015.Position = UDim2.new(0, 45, 0, 210)
CGift_Volcano2015.Size = UDim2.new(0, 80, 0, 15)
CGift_Volcano2015.TextColor3 = Color3.new(1, 1, 1)
CGift_Volcano2015.Font = Enum.Font.SourceSans
CGift_Volcano2015.FontSize = Enum.FontSize.Size14
CGift_Volcano2015.Text = "Volcano Gift 2015"
CGift_Volcano2015.TextScaled = true
CGift_Volcano2015.TextSize = 14
CGift_Volcano2015.TextWrapped = true

CGift_Volcano2015Items = Instance.new("TextLabel")
CGift_Volcano2015Items.Name = "CGift_Volcano2015Items1"
CGift_Volcano2015Items.Parent = Giftsframe
CGift_Volcano2015Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Volcano2015Items.BackgroundTransparency = 0.1
CGift_Volcano2015Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Volcano2015Items.BorderSizePixel = 0
CGift_Volcano2015Items.Position = UDim2.new(0, 127, 0, 210)
CGift_Volcano2015Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Volcano2015Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Volcano2015Items.Font = Enum.Font.SourceSans
CGift_Volcano2015Items.FontSize = Enum.FontSize.Size14
CGift_Volcano2015Items.Text = "0"
CGift_Volcano2015Items.TextScaled = true
CGift_Volcano2015Items.TextSize = 14
CGift_Volcano2015Items.TextWrapped = true

CGift_Wobble2015Info = Instance.new("ImageLabel")
CGift_Wobble2015Info.BackgroundTransparency = 1
CGift_Wobble2015Info.Name = "CGift_Wobble2015Info"
CGift_Wobble2015Info.Parent = Giftsframe
CGift_Wobble2015Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2015Info.Position = UDim2.new(0, 190, 0, 140)
CGift_Wobble2015Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2015Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=331843644"
CGift_Wobble2015Info.Visible = true

CGift_Wobble2015 = Instance.new("TextLabel")
CGift_Wobble2015.Name = "CGift_Wobble2015"
CGift_Wobble2015.Parent = Giftsframe
CGift_Wobble2015.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2015.BackgroundTransparency = 0.1
CGift_Wobble2015.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2015.BorderSizePixel = 0
CGift_Wobble2015.Position = UDim2.new(0, 160, 0, 210)
CGift_Wobble2015.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2015.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2015.Font = Enum.Font.SourceSans
CGift_Wobble2015.FontSize = Enum.FontSize.Size14
CGift_Wobble2015.Text = "Wobble Gift 2015"
CGift_Wobble2015.TextScaled = true
CGift_Wobble2015.TextSize = 14
CGift_Wobble2015.TextWrapped = true

CGift_Wobble2015Items = Instance.new("TextLabel")
CGift_Wobble2015Items.Name = "CGift_Wobble2015Items1"
CGift_Wobble2015Items.Parent = Giftsframe
CGift_Wobble2015Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2015Items.BackgroundTransparency = 0.1
CGift_Wobble2015Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2015Items.BorderSizePixel = 0
CGift_Wobble2015Items.Position = UDim2.new(0, 242, 0, 210)
CGift_Wobble2015Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2015Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2015Items.Font = Enum.Font.SourceSans
CGift_Wobble2015Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2015Items.Text = "0"
CGift_Wobble2015Items.TextScaled = true
CGift_Wobble2015Items.TextSize = 14
CGift_Wobble2015Items.TextWrapped = true

CGift_Blue2016Info = Instance.new("ImageLabel")
CGift_Blue2016Info.BackgroundTransparency = 1
CGift_Blue2016Info.Name = "CGift_Blue2016Info"
CGift_Blue2016Info.Parent = Giftsframe
CGift_Blue2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Blue2016Info.Position = UDim2.new(0, 300, 0, 140)
CGift_Blue2016Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Blue2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566108783"
CGift_Blue2016Info.Visible = true

CGift_Blue2016 = Instance.new("TextLabel")
CGift_Blue2016.Name = "CGift_Blue2016"
CGift_Blue2016.Parent = Giftsframe
CGift_Blue2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Blue2016.BackgroundTransparency = 0.1
CGift_Blue2016.BorderColor3 = Color3.new(0, 0, 0)
CGift_Blue2016.BorderSizePixel = 0
CGift_Blue2016.Position = UDim2.new(0, 275, 0, 210)
CGift_Blue2016.Size = UDim2.new(0, 80, 0, 15)
CGift_Blue2016.TextColor3 = Color3.new(1, 1, 1)
CGift_Blue2016.Font = Enum.Font.SourceSans
CGift_Blue2016.FontSize = Enum.FontSize.Size14
CGift_Blue2016.Text = "Blue Gift 2016"
CGift_Blue2016.TextScaled = true
CGift_Blue2016.TextSize = 14
CGift_Blue2016.TextWrapped = true

CGift_Blue2016Items = Instance.new("TextLabel")
CGift_Blue2016Items.Name = "CGift_Blue2016Items1"
CGift_Blue2016Items.Parent = Giftsframe
CGift_Blue2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Blue2016Items.BackgroundTransparency = 0.1
CGift_Blue2016Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Blue2016Items.BorderSizePixel = 0
CGift_Blue2016Items.Position = UDim2.new(0, 357, 0, 210)
CGift_Blue2016Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Blue2016Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Blue2016Items.Font = Enum.Font.SourceSans
CGift_Blue2016Items.FontSize = Enum.FontSize.Size14
CGift_Blue2016Items.Text = "0"
CGift_Blue2016Items.TextScaled = true
CGift_Blue2016Items.TextSize = 14
CGift_Blue2016Items.TextWrapped = true

CGift_Big2016Info = Instance.new("ImageLabel")
CGift_Big2016Info.BackgroundTransparency = 1
CGift_Big2016Info.Name = "CGift_Big2016Info"
CGift_Big2016Info.Parent = Giftsframe
CGift_Big2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Big2016Info.Position = UDim2.new(0, 410, 0, 140)
CGift_Big2016Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Big2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=570910158"
CGift_Big2016Info.Visible = true

CGift_Big2016 = Instance.new("TextLabel")
CGift_Big2016.Name = "CGift_Big2016"
CGift_Big2016.Parent = Giftsframe
CGift_Big2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Big2016.BackgroundTransparency = 0.1
CGift_Big2016.BorderColor3 = Color3.new(0, 0, 0)
CGift_Big2016.BorderSizePixel = 0
CGift_Big2016.Position = UDim2.new(0, 390, 0, 210)
CGift_Big2016.Size = UDim2.new(0, 80, 0, 15)
CGift_Big2016.TextColor3 = Color3.new(1, 1, 1)
CGift_Big2016.Font = Enum.Font.SourceSans
CGift_Big2016.FontSize = Enum.FontSize.Size14
CGift_Big2016.Text = "Big Gift 2016"
CGift_Big2016.TextScaled = true
CGift_Big2016.TextSize = 14
CGift_Big2016.TextWrapped = true

CGift_Big2016Items = Instance.new("TextLabel")
CGift_Big2016Items.Name = "CGift_Big2016Items1"
CGift_Big2016Items.Parent = Giftsframe
CGift_Big2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Big2016Items.BackgroundTransparency = 0.1
CGift_Big2016Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Big2016Items.BorderSizePixel = 0
CGift_Big2016Items.Position = UDim2.new(0, 472, 0, 210)
CGift_Big2016Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Big2016Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Big2016Items.Font = Enum.Font.SourceSans
CGift_Big2016Items.FontSize = Enum.FontSize.Size14
CGift_Big2016Items.Text = "0"
CGift_Big2016Items.TextScaled = true
CGift_Big2016Items.TextSize = 14
CGift_Big2016Items.TextWrapped = true

CGift_Jingle2016Info = Instance.new("ImageLabel")
CGift_Jingle2016Info.BackgroundTransparency = 1
CGift_Jingle2016Info.Name = "CGift_Jingle2016Info"
CGift_Jingle2016Info.Parent = Giftsframe
CGift_Jingle2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Jingle2016Info.Position = UDim2.new(0, 75, 0, 240)
CGift_Jingle2016Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Jingle2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566122220"
CGift_Jingle2016Info.Visible = true

CGift_Jingle2016 = Instance.new("TextLabel")
CGift_Jingle2016.Name = "CGift_Jingle2016"
CGift_Jingle2016.Parent = Giftsframe
CGift_Jingle2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Jingle2016.BackgroundTransparency = 0.1
CGift_Jingle2016.BorderColor3 = Color3.new(0, 0, 0)
CGift_Jingle2016.BorderSizePixel = 0
CGift_Jingle2016.Position = UDim2.new(0, 45, 0, 310)
CGift_Jingle2016.Size = UDim2.new(0, 80, 0, 15)
CGift_Jingle2016.TextColor3 = Color3.new(1, 1, 1)
CGift_Jingle2016.Font = Enum.Font.SourceSans
CGift_Jingle2016.FontSize = Enum.FontSize.Size14
CGift_Jingle2016.Text = "Jingle Gift 2016"
CGift_Jingle2016.TextScaled = true
CGift_Jingle2016.TextSize = 14
CGift_Jingle2016.TextWrapped = true

CGift_Jingle2016Items = Instance.new("TextLabel")
CGift_Jingle2016Items.Name = "CGift_Jingle2016Items1"
CGift_Jingle2016Items.Parent = Giftsframe
CGift_Jingle2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Jingle2016Items.BackgroundTransparency = 0.1
CGift_Jingle2016Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Jingle2016Items.BorderSizePixel = 0
CGift_Jingle2016Items.Position = UDim2.new(0, 127, 0, 310)
CGift_Jingle2016Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Jingle2016Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Jingle2016Items.Font = Enum.Font.SourceSans
CGift_Jingle2016Items.FontSize = Enum.FontSize.Size14
CGift_Jingle2016Items.Text = "0"
CGift_Jingle2016Items.TextScaled = true
CGift_Jingle2016Items.TextSize = 14
CGift_Jingle2016Items.TextWrapped = true

CGift_Wobble2016Info = Instance.new("ImageLabel")
CGift_Wobble2016Info.BackgroundTransparency = 1
CGift_Wobble2016Info.Name = "CGift_Wobble2016Info"
CGift_Wobble2016Info.Parent = Giftsframe
CGift_Wobble2016Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2016Info.Position = UDim2.new(0, 190, 0, 240)
CGift_Wobble2016Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2016Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566111792"
CGift_Wobble2016Info.Visible = true

CGift_Wobble2016 = Instance.new("TextLabel")
CGift_Wobble2016.Name = "CGift_Wobble2016"
CGift_Wobble2016.Parent = Giftsframe
CGift_Wobble2016.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2016.BackgroundTransparency = 0.1
CGift_Wobble2016.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2016.BorderSizePixel = 0
CGift_Wobble2016.Position = UDim2.new(0, 160, 0, 310)
CGift_Wobble2016.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2016.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2016.Font = Enum.Font.SourceSans
CGift_Wobble2016.FontSize = Enum.FontSize.Size14
CGift_Wobble2016.Text = "Wobble Gift 2016"
CGift_Wobble2016.TextScaled = true
CGift_Wobble2016.TextSize = 14
CGift_Wobble2016.TextWrapped = true

CGift_Wobble2016Items = Instance.new("TextLabel")
CGift_Wobble2016Items.Name = "CGift_Wobble2016Items1"
CGift_Wobble2016Items.Parent = Giftsframe
CGift_Wobble2016Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2016Items.BackgroundTransparency = 0.1
CGift_Wobble2016Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2016Items.BorderSizePixel = 0
CGift_Wobble2016Items.Position = UDim2.new(0, 242, 0, 310)
CGift_Wobble2016Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2016Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2016Items.Font = Enum.Font.SourceSans
CGift_Wobble2016Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2016Items.Text = "0"
CGift_Wobble2016Items.TextScaled = true
CGift_Wobble2016Items.TextSize = 14
CGift_Wobble2016Items.TextWrapped = true

CGift_Wobble2018Info = Instance.new("ImageLabel")
CGift_Wobble2018Info.BackgroundTransparency = 1
CGift_Wobble2018Info.Name = "CGift_Wobble2018Info"
CGift_Wobble2018Info.Parent = Giftsframe
CGift_Wobble2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2018Info.Position = UDim2.new(0, 300, 0, 240)
CGift_Wobble2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211474043"
CGift_Wobble2018Info.Visible = true

CGift_Wobble2018 = Instance.new("TextLabel")
CGift_Wobble2018.Name = "CGift_Wobble2018"
CGift_Wobble2018.Parent = Giftsframe
CGift_Wobble2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2018.BackgroundTransparency = 0.1
CGift_Wobble2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2018.BorderSizePixel = 0
CGift_Wobble2018.Position = UDim2.new(0, 275, 0, 310)
CGift_Wobble2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2018.Font = Enum.Font.SourceSans
CGift_Wobble2018.FontSize = Enum.FontSize.Size14
CGift_Wobble2018.Text = "Wobble Gift 2018"
CGift_Wobble2018.TextScaled = true
CGift_Wobble2018.TextSize = 14
CGift_Wobble2018.TextWrapped = true

CGift_Wobble2018Items = Instance.new("TextLabel")
CGift_Wobble2018Items.Name = "CGift_Wobble2018Items1"
CGift_Wobble2018Items.Parent = Giftsframe
CGift_Wobble2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2018Items.BackgroundTransparency = 0.1
CGift_Wobble2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2018Items.BorderSizePixel = 0
CGift_Wobble2018Items.Position = UDim2.new(0, 357, 0, 310)
CGift_Wobble2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2018Items.Font = Enum.Font.SourceSans
CGift_Wobble2018Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2018Items.Text = "0"
CGift_Wobble2018Items.TextScaled = true
CGift_Wobble2018Items.TextSize = 14
CGift_Wobble2018Items.TextWrapped = true

CGift_Green2017Info = Instance.new("ImageLabel")
CGift_Green2017Info.BackgroundTransparency = 1
CGift_Green2017Info.Name = "CGift_Green2017Info"
CGift_Green2017Info.Parent = Giftsframe
CGift_Green2017Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Green2017Info.Position = UDim2.new(0, 410, 0, 240)
CGift_Green2017Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Green2017Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211479015"
CGift_Green2017Info.Visible = true

CGift_Green2017 = Instance.new("TextLabel")
CGift_Green2017.Name = "CGift_Green2017"
CGift_Green2017.Parent = Giftsframe
CGift_Green2017.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Green2017.BackgroundTransparency = 0.1
CGift_Green2017.BorderColor3 = Color3.new(0, 0, 0)
CGift_Green2017.BorderSizePixel = 0
CGift_Green2017.Position = UDim2.new(0, 390, 0, 310)
CGift_Green2017.Size = UDim2.new(0, 80, 0, 15)
CGift_Green2017.TextColor3 = Color3.new(1, 1, 1)
CGift_Green2017.Font = Enum.Font.SourceSans
CGift_Green2017.FontSize = Enum.FontSize.Size14
CGift_Green2017.Text = "Green Gift 2017"
CGift_Green2017.TextScaled = true
CGift_Green2017.TextSize = 14
CGift_Green2017.TextWrapped = true

CGift_Green2017Items = Instance.new("TextLabel")
CGift_Green2017Items.Name = "CGift_Green2017Items1"
CGift_Green2017Items.Parent = Giftsframe
CGift_Green2017Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Green2017Items.BackgroundTransparency = 0.1
CGift_Green2017Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Green2017Items.BorderSizePixel = 0
CGift_Green2017Items.Position = UDim2.new(0, 472, 0, 310)
CGift_Green2017Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Green2017Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Green2017Items.Font = Enum.Font.SourceSans
CGift_Green2017Items.FontSize = Enum.FontSize.Size14
CGift_Green2017Items.Text = "0"
CGift_Green2017Items.TextScaled = true
CGift_Green2017Items.TextSize = 14
CGift_Green2017Items.TextWrapped = true

CGift_GreatTimes2017Info = Instance.new("ImageLabel")
CGift_GreatTimes2017Info.BackgroundTransparency = 1
CGift_GreatTimes2017Info.Name = "CGift_GreatTimes2017Info"
CGift_GreatTimes2017Info.Parent = Giftsframe
CGift_GreatTimes2017Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_GreatTimes2017Info.Position = UDim2.new(0, 75, 0, 340)
CGift_GreatTimes2017Info.Size = UDim2.new(0, 40, 0, 60)
CGift_GreatTimes2017Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211475640"
CGift_GreatTimes2017Info.Visible = true

CGift_GreatTimes2017 = Instance.new("TextLabel")
CGift_GreatTimes2017.Name = "CGift_GreatTimes2017"
CGift_GreatTimes2017.Parent = Giftsframe
CGift_GreatTimes2017.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_GreatTimes2017.BackgroundTransparency = 0.1
CGift_GreatTimes2017.BorderColor3 = Color3.new(0, 0, 0)
CGift_GreatTimes2017.BorderSizePixel = 0
CGift_GreatTimes2017.Position = UDim2.new(0, 45, 0, 410)
CGift_GreatTimes2017.Size = UDim2.new(0, 80, 0, 15)
CGift_GreatTimes2017.TextColor3 = Color3.new(1, 1, 1)
CGift_GreatTimes2017.Font = Enum.Font.SourceSans
CGift_GreatTimes2017.FontSize = Enum.FontSize.Size14
CGift_GreatTimes2017.Text = "GreatTimes Gift 2017"
CGift_GreatTimes2017.TextScaled = true
CGift_GreatTimes2017.TextSize = 14
CGift_GreatTimes2017.TextWrapped = true

CGift_GreatTimes2017Items = Instance.new("TextLabel")
CGift_GreatTimes2017Items.Name = "CGift_GreatTimes2017Items1"
CGift_GreatTimes2017Items.Parent = Giftsframe
CGift_GreatTimes2017Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_GreatTimes2017Items.BackgroundTransparency = 0.1
CGift_GreatTimes2017Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_GreatTimes2017Items.BorderSizePixel = 0
CGift_GreatTimes2017Items.Position = UDim2.new(0, 127, 0, 410)
CGift_GreatTimes2017Items.Size = UDim2.new(0, 20, 0, 15)
CGift_GreatTimes2017Items.TextColor3 = Color3.new(1, 1, 1)
CGift_GreatTimes2017Items.Font = Enum.Font.SourceSans
CGift_GreatTimes2017Items.FontSize = Enum.FontSize.Size14
CGift_GreatTimes2017Items.Text = "0"
CGift_GreatTimes2017Items.TextScaled = true
CGift_GreatTimes2017Items.TextSize = 14
CGift_GreatTimes2017Items.TextWrapped = true

CGift_Modern2017Info = Instance.new("ImageLabel")
CGift_Modern2017Info.BackgroundTransparency = 1
CGift_Modern2017Info.Name = "CGift_Modern2017Info"
CGift_Modern2017Info.Parent = Giftsframe
CGift_Modern2017Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Modern2017Info.Position = UDim2.new(0, 190, 0, 340)
CGift_Modern2017Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Modern2017Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211450642"
CGift_Modern2017Info.Visible = true

CGift_Modern2017 = Instance.new("TextLabel")
CGift_Modern2017.Name = "CGift_Modern2017"
CGift_Modern2017.Parent = Giftsframe
CGift_Modern2017.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Modern2017.BackgroundTransparency = 0.1
CGift_Modern2017.BorderColor3 = Color3.new(0, 0, 0)
CGift_Modern2017.BorderSizePixel = 0
CGift_Modern2017.Position = UDim2.new(0, 160, 0, 410)
CGift_Modern2017.Size = UDim2.new(0, 80, 0, 15)
CGift_Modern2017.TextColor3 = Color3.new(1, 1, 1)
CGift_Modern2017.Font = Enum.Font.SourceSans
CGift_Modern2017.FontSize = Enum.FontSize.Size14
CGift_Modern2017.Text = "Modern Gift 2017"
CGift_Modern2017.TextScaled = true
CGift_Modern2017.TextSize = 14
CGift_Modern2017.TextWrapped = true

CGift_Modern2017Items = Instance.new("TextLabel")
CGift_Modern2017Items.Name = "CGift_Modern2017Items1"
CGift_Modern2017Items.Parent = Giftsframe
CGift_Modern2017Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Modern2017Items.BackgroundTransparency = 0.1
CGift_Modern2017Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Modern2017Items.BorderSizePixel = 0
CGift_Modern2017Items.Position = UDim2.new(0, 242, 0, 410)
CGift_Modern2017Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Modern2017Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Modern2017Items.Font = Enum.Font.SourceSans
CGift_Modern2017Items.FontSize = Enum.FontSize.Size14
CGift_Modern2017Items.Text = "0"
CGift_Modern2017Items.TextScaled = true
CGift_Modern2017Items.TextSize = 14
CGift_Modern2017Items.TextWrapped = true

CGift_Wobble2017Info = Instance.new("ImageLabel")
CGift_Wobble2017Info.BackgroundTransparency = 1
CGift_Wobble2017Info.Name = "CGift_Wobble2017Info"
CGift_Wobble2017Info.Parent = Giftsframe
CGift_Wobble2017Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2017Info.Position = UDim2.new(0, 300, 0, 340)
CGift_Wobble2017Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2017Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211472019"
CGift_Wobble2017Info.Visible = true

CGift_Wobble2017 = Instance.new("TextLabel")
CGift_Wobble2017.Name = "CGift_Wobble2017"
CGift_Wobble2017.Parent = Giftsframe
CGift_Wobble2017.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2017.BackgroundTransparency = 0.1
CGift_Wobble2017.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2017.BorderSizePixel = 0
CGift_Wobble2017.Position = UDim2.new(0, 275, 0, 410)
CGift_Wobble2017.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2017.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2017.Font = Enum.Font.SourceSans
CGift_Wobble2017.FontSize = Enum.FontSize.Size14
CGift_Wobble2017.Text = "Wobble Gift 2017"
CGift_Wobble2017.TextScaled = true
CGift_Wobble2017.TextSize = 14
CGift_Wobble2017.TextWrapped = true

CGift_Wobble2017Items = Instance.new("TextLabel")
CGift_Wobble2017Items.Name = "CGift_Wobble2017Items1"
CGift_Wobble2017Items.Parent = Giftsframe
CGift_Wobble2017Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2017Items.BackgroundTransparency = 0.1
CGift_Wobble2017Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2017Items.BorderSizePixel = 0
CGift_Wobble2017Items.Position = UDim2.new(0, 357, 0, 410)
CGift_Wobble2017Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2017Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2017Items.Font = Enum.Font.SourceSans
CGift_Wobble2017Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2017Items.Text = "0"
CGift_Wobble2017Items.TextScaled = true
CGift_Wobble2017Items.TextSize = 14
CGift_Wobble2017Items.TextWrapped = true

CGift_Wobble2019Info = Instance.new("ImageLabel")
CGift_Wobble2019Info.BackgroundTransparency = 1
CGift_Wobble2019Info.Name = "CGift_Wobble2019Info"
CGift_Wobble2019Info.Parent = Giftsframe
CGift_Wobble2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2019Info.Position = UDim2.new(0, 410, 0, 340)
CGift_Wobble2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2019Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479104674"
CGift_Wobble2019Info.Visible = true

CGift_Wobble2019 = Instance.new("TextLabel")
CGift_Wobble2019.Name = "CGift_Wobble2019"
CGift_Wobble2019.Parent = Giftsframe
CGift_Wobble2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2019.BackgroundTransparency = 0.1
CGift_Wobble2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2019.BorderSizePixel = 0
CGift_Wobble2019.Position = UDim2.new(0, 390, 0, 410)
CGift_Wobble2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2019.Font = Enum.Font.SourceSans
CGift_Wobble2019.FontSize = Enum.FontSize.Size14
CGift_Wobble2019.Text = "Wobble Gift 2019"
CGift_Wobble2019.TextScaled = true
CGift_Wobble2019.TextSize = 14
CGift_Wobble2019.TextWrapped = true

CGift_Wobble2019Items = Instance.new("TextLabel")
CGift_Wobble2019Items.Name = "CGift_Wobble2019Items1"
CGift_Wobble2019Items.Parent = Giftsframe
CGift_Wobble2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2019Items.BackgroundTransparency = 0.1
CGift_Wobble2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2019Items.BorderSizePixel = 0
CGift_Wobble2019Items.Position = UDim2.new(0, 472, 0, 410)
CGift_Wobble2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2019Items.Font = Enum.Font.SourceSans
CGift_Wobble2019Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2019Items.Text = "0"
CGift_Wobble2019Items.TextScaled = true
CGift_Wobble2019Items.TextSize = 14
CGift_Wobble2019Items.TextWrapped = true

CGift_Gold2017Info = Instance.new("ImageLabel")
CGift_Gold2017Info.BackgroundTransparency = 1
CGift_Gold2017Info.Name = "CGift_Gold2017Info"
CGift_Gold2017Info.Parent = Giftsframe
CGift_Gold2017Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Gold2017Info.Position = UDim2.new(0, 75, 0, 440)
CGift_Gold2017Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Gold2017Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1212799900"
CGift_Gold2017Info.Visible = true

CGift_Gold2017 = Instance.new("TextLabel")
CGift_Gold2017.Name = "CGift_Gold2017"
CGift_Gold2017.Parent = Giftsframe
CGift_Gold2017.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Gold2017.BackgroundTransparency = 0.1
CGift_Gold2017.BorderColor3 = Color3.new(0, 0, 0)
CGift_Gold2017.BorderSizePixel = 0
CGift_Gold2017.Position = UDim2.new(0, 45, 0, 510)
CGift_Gold2017.Size = UDim2.new(0, 80, 0, 15)
CGift_Gold2017.TextColor3 = Color3.new(1, 1, 1)
CGift_Gold2017.Font = Enum.Font.SourceSans
CGift_Gold2017.FontSize = Enum.FontSize.Size14
CGift_Gold2017.Text = "Gold Gift 2017"
CGift_Gold2017.TextScaled = true
CGift_Gold2017.TextSize = 14
CGift_Gold2017.TextWrapped = true

CGift_Gold2017Items = Instance.new("TextLabel")
CGift_Gold2017Items.Name = "CGift_Gold2017Items1"
CGift_Gold2017Items.Parent = Giftsframe
CGift_Gold2017Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Gold2017Items.BackgroundTransparency = 0.1
CGift_Gold2017Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Gold2017Items.BorderSizePixel = 0
CGift_Gold2017Items.Position = UDim2.new(0, 127, 0, 510)
CGift_Gold2017Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Gold2017Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Gold2017Items.Font = Enum.Font.SourceSans
CGift_Gold2017Items.FontSize = Enum.FontSize.Size14
CGift_Gold2017Items.Text = "0"
CGift_Gold2017Items.TextScaled = true
CGift_Gold2017Items.TextSize = 14
CGift_Gold2017Items.TextWrapped = true

CGift_Snow2018Info = Instance.new("ImageLabel")
CGift_Snow2018Info.BackgroundTransparency = 1
CGift_Snow2018Info.Name = "CGift_Snow2018Info"
CGift_Snow2018Info.Parent = Giftsframe
CGift_Snow2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Snow2018Info.Position = UDim2.new(0, 190, 0, 440)
CGift_Snow2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Snow2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618101098"
CGift_Snow2018Info.Visible = true

CGift_Snow2018 = Instance.new("TextLabel")
CGift_Snow2018.Name = "CGift_Snow2018"
CGift_Snow2018.Parent = Giftsframe
CGift_Snow2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Snow2018.BackgroundTransparency = 0.1
CGift_Snow2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Snow2018.BorderSizePixel = 0
CGift_Snow2018.Position = UDim2.new(0, 160, 0, 510)
CGift_Snow2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Snow2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Snow2018.Font = Enum.Font.SourceSans
CGift_Snow2018.FontSize = Enum.FontSize.Size14
CGift_Snow2018.Text = "Snow Gift 2018"
CGift_Snow2018.TextScaled = true
CGift_Snow2018.TextSize = 14
CGift_Snow2018.TextWrapped = true

CGift_Snow2018Items = Instance.new("TextLabel")
CGift_Snow2018Items.Name = "CGift_Snow2018Items1"
CGift_Snow2018Items.Parent = Giftsframe
CGift_Snow2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Snow2018Items.BackgroundTransparency = 0.1
CGift_Snow2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Snow2018Items.BorderSizePixel = 0
CGift_Snow2018Items.Position = UDim2.new(0, 242, 0, 510)
CGift_Snow2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Snow2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Snow2018Items.Font = Enum.Font.SourceSans
CGift_Snow2018Items.FontSize = Enum.FontSize.Size14
CGift_Snow2018Items.Text = "0"
CGift_Snow2018Items.TextScaled = true
CGift_Snow2018Items.TextSize = 14
CGift_Snow2018Items.TextWrapped = true

CGift_Plate2018Info = Instance.new("ImageLabel")
CGift_Plate2018Info.BackgroundTransparency = 1
CGift_Plate2018Info.Name = "CGift_Plate2018Info"
CGift_Plate2018Info.Parent = Giftsframe
CGift_Plate2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Plate2018Info.Position = UDim2.new(0, 300, 0, 440)
CGift_Plate2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Plate2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2640326487"
CGift_Plate2018Info.Visible = true

CGift_Plate2018 = Instance.new("TextLabel")
CGift_Plate2018.Name = "CGift_Plate2018"
CGift_Plate2018.Parent = Giftsframe
CGift_Plate2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Plate2018.BackgroundTransparency = 0.1
CGift_Plate2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Plate2018.BorderSizePixel = 0
CGift_Plate2018.Position = UDim2.new(0, 275, 0, 510)
CGift_Plate2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Plate2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Plate2018.Font = Enum.Font.SourceSans
CGift_Plate2018.FontSize = Enum.FontSize.Size14
CGift_Plate2018.Text = "Plate Gift 2018"
CGift_Plate2018.TextScaled = true
CGift_Plate2018.TextSize = 14
CGift_Plate2018.TextWrapped = true

CGift_Plate2018Items = Instance.new("TextLabel")
CGift_Plate2018Items.Name = "CGift_Plate2018Items1"
CGift_Plate2018Items.Parent = Giftsframe
CGift_Plate2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Plate2018Items.BackgroundTransparency = 0.1
CGift_Plate2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Plate2018Items.BorderSizePixel = 0
CGift_Plate2018Items.Position = UDim2.new(0, 357, 0, 510)
CGift_Plate2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Plate2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Plate2018Items.Font = Enum.Font.SourceSans
CGift_Plate2018Items.FontSize = Enum.FontSize.Size14
CGift_Plate2018Items.Text = "0"
CGift_Plate2018Items.TextScaled = true
CGift_Plate2018Items.TextSize = 14
CGift_Plate2018Items.TextWrapped = true


CGift_Cocoa2018Info = Instance.new("ImageLabel")
CGift_Cocoa2018Info.BackgroundTransparency = 1
CGift_Cocoa2018Info.Name = "CGift_Cocoa2018Info"
CGift_Cocoa2018Info.Parent = Giftsframe
CGift_Cocoa2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Cocoa2018Info.Position = UDim2.new(0, 410, 0, 440)
CGift_Cocoa2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Cocoa2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618103613"
CGift_Cocoa2018Info.Visible = true

CGift_Cocoa2018 = Instance.new("TextLabel")
CGift_Cocoa2018.Name = "CGift_Cocoa2018"
CGift_Cocoa2018.Parent = Giftsframe
CGift_Cocoa2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cocoa2018.BackgroundTransparency = 0.1
CGift_Cocoa2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cocoa2018.BorderSizePixel = 0
CGift_Cocoa2018.Position = UDim2.new(0, 390, 0, 510)
CGift_Cocoa2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Cocoa2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Cocoa2018.Font = Enum.Font.SourceSans
CGift_Cocoa2018.FontSize = Enum.FontSize.Size14
CGift_Cocoa2018.Text = "Cocoa Gift 2018"
CGift_Cocoa2018.TextScaled = true
CGift_Cocoa2018.TextSize = 14
CGift_Cocoa2018.TextWrapped = true

CGift_Cocoa2018Items = Instance.new("TextLabel")
CGift_Cocoa2018Items.Name = "CGift_Cocoa2018Items1"
CGift_Cocoa2018Items.Parent = Giftsframe
CGift_Cocoa2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cocoa2018Items.BackgroundTransparency = 0.1
CGift_Cocoa2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cocoa2018Items.BorderSizePixel = 0
CGift_Cocoa2018Items.Position = UDim2.new(0, 472, 0, 510)
CGift_Cocoa2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Cocoa2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Cocoa2018Items.Font = Enum.Font.SourceSans
CGift_Cocoa2018Items.FontSize = Enum.FontSize.Size14
CGift_Cocoa2018Items.Text = "0"
CGift_Cocoa2018Items.TextScaled = true
CGift_Cocoa2018Items.TextSize = 14
CGift_Cocoa2018Items.TextWrapped = true

CGift_Candy2018Info = Instance.new("ImageLabel")
CGift_Candy2018Info.BackgroundTransparency = 1
CGift_Candy2018Info.Name = "CGift_Candy2018Info"
CGift_Candy2018Info.Parent = Giftsframe
CGift_Candy2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Candy2018Info.Position = UDim2.new(0, 75, 0, 540)
CGift_Candy2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Candy2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618105627"
CGift_Candy2018Info.Visible = true

CGift_Candy2018 = Instance.new("TextLabel")
CGift_Candy2018.Name = "CGift_Candy2018"
CGift_Candy2018.Parent = Giftsframe
CGift_Candy2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Candy2018.BackgroundTransparency = 0.1
CGift_Candy2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Candy2018.BorderSizePixel = 0
CGift_Candy2018.Position = UDim2.new(0, 45, 0, 610)
CGift_Candy2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Candy2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Candy2018.Font = Enum.Font.SourceSans
CGift_Candy2018.FontSize = Enum.FontSize.Size14
CGift_Candy2018.Text = "Cocoa Gift 2018"
CGift_Candy2018.TextScaled = true
CGift_Candy2018.TextSize = 14
CGift_Candy2018.TextWrapped = true

CGift_Candy2018Items = Instance.new("TextLabel")
CGift_Candy2018Items.Name = "CGift_Candy2018Items1"
CGift_Candy2018Items.Parent = Giftsframe
CGift_Candy2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Candy2018Items.BackgroundTransparency = 0.1
CGift_Candy2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Candy2018Items.BorderSizePixel = 0
CGift_Candy2018Items.Position = UDim2.new(0, 127, 0, 610)
CGift_Candy2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Candy2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Candy2018Items.Font = Enum.Font.SourceSans
CGift_Candy2018Items.FontSize = Enum.FontSize.Size14
CGift_Candy2018Items.Text = "0"
CGift_Candy2018Items.TextScaled = true
CGift_Candy2018Items.TextSize = 14
CGift_Candy2018Items.TextWrapped = true

CGift_Duck2018Info = Instance.new("ImageLabel")
CGift_Duck2018Info.BackgroundTransparency = 1
CGift_Duck2018Info.Name = "CGift_Duck2018Info"
CGift_Duck2018Info.Parent = Giftsframe
CGift_Duck2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Duck2018Info.Position = UDim2.new(0, 190, 0, 540)
CGift_Duck2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Duck2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618107094"
CGift_Duck2018Info.Visible = true

CGift_Duck2018 = Instance.new("TextLabel")
CGift_Duck2018.Name = "CGift_Duck2018"
CGift_Duck2018.Parent = Giftsframe
CGift_Duck2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Duck2018.BackgroundTransparency = 0.1
CGift_Duck2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Duck2018.BorderSizePixel = 0
CGift_Duck2018.Position = UDim2.new(0, 160, 0, 610)
CGift_Duck2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Duck2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Duck2018.Font = Enum.Font.SourceSans
CGift_Duck2018.FontSize = Enum.FontSize.Size14
CGift_Duck2018.Text = "Duck Gift 2018"
CGift_Duck2018.TextScaled = true
CGift_Duck2018.TextSize = 14
CGift_Duck2018.TextWrapped = true

CGift_Duck2018Items = Instance.new("TextLabel")
CGift_Duck2018Items.Name = "CGift_Duck2018Items1"
CGift_Duck2018Items.Parent = Giftsframe
CGift_Duck2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Duck2018Items.BackgroundTransparency = 0.1
CGift_Duck2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Duck2018Items.BorderSizePixel = 0
CGift_Duck2018Items.Position = UDim2.new(0, 242, 0, 610)
CGift_Duck2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Duck2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Duck2018Items.Font = Enum.Font.SourceSans
CGift_Duck2018Items.FontSize = Enum.FontSize.Size14
CGift_Duck2018Items.Text = "0"
CGift_Duck2018Items.TextScaled = true
CGift_Duck2018Items.TextSize = 14
CGift_Duck2018Items.TextWrapped = true

CGift_Cone2018Info = Instance.new("ImageLabel")
CGift_Cone2018Info.BackgroundTransparency = 1
CGift_Cone2018Info.Name = "CGift_Cone2018Info"
CGift_Cone2018Info.Parent = Giftsframe
CGift_Cone2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Cone2018Info.Position = UDim2.new(0, 300, 0, 540)
CGift_Cone2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Cone2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618108691"
CGift_Cone2018Info.Visible = true

CGift_Cone2018 = Instance.new("TextLabel")
CGift_Cone2018.Name = "CGift_Cone2018"
CGift_Cone2018.Parent = Giftsframe
CGift_Cone2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cone2018.BackgroundTransparency = 0.1
CGift_Cone2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cone2018.BorderSizePixel = 0
CGift_Cone2018.Position = UDim2.new(0, 275, 0, 610)
CGift_Cone2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Cone2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Cone2018.Font = Enum.Font.SourceSans
CGift_Cone2018.FontSize = Enum.FontSize.Size14
CGift_Cone2018.Text = "Cone Gift 2018"
CGift_Cone2018.TextScaled = true
CGift_Cone2018.TextSize = 14
CGift_Cone2018.TextWrapped = true

CGift_Cone2018Items = Instance.new("TextLabel")
CGift_Cone2018Items.Name = "CGift_Cone2018Items1"
CGift_Cone2018Items.Parent = Giftsframe
CGift_Cone2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cone2018Items.BackgroundTransparency = 0.1
CGift_Cone2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cone2018Items.BorderSizePixel = 0
CGift_Cone2018Items.Position = UDim2.new(0, 357, 0, 610)
CGift_Cone2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Cone2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Cone2018Items.Font = Enum.Font.SourceSans
CGift_Cone2018Items.FontSize = Enum.FontSize.Size14
CGift_Cone2018Items.Text = "0"
CGift_Cone2018Items.TextScaled = true
CGift_Cone2018Items.TextSize = 14
CGift_Cone2018Items.TextWrapped = true

CGift_Sled2018Info = Instance.new("ImageLabel")
CGift_Sled2018Info.BackgroundTransparency = 1
CGift_Sled2018Info.Name = "CGift_Sled2018Info"
CGift_Sled2018Info.Parent = Giftsframe
CGift_Sled2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Sled2018Info.Position = UDim2.new(0, 410, 0, 540)
CGift_Sled2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Sled2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618117188"
CGift_Sled2018Info.Visible = true

CGift_Sled2018 = Instance.new("TextLabel")
CGift_Sled2018.Name = "CGift_Sled2018"
CGift_Sled2018.Parent = Giftsframe
CGift_Sled2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Sled2018.BackgroundTransparency = 0.1
CGift_Sled2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Sled2018.BorderSizePixel = 0
CGift_Sled2018.Position = UDim2.new(0, 390, 0, 610)
CGift_Sled2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Sled2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Sled2018.Font = Enum.Font.SourceSans
CGift_Sled2018.FontSize = Enum.FontSize.Size14
CGift_Sled2018.Text = "Sled Gift 2018"
CGift_Sled2018.TextScaled = true
CGift_Sled2018.TextSize = 14
CGift_Sled2018.TextWrapped = true

CGift_Sled2018Items = Instance.new("TextLabel")
CGift_Sled2018Items.Name = "CGift_Sled2018Items1"
CGift_Sled2018Items.Parent = Giftsframe
CGift_Sled2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Sled2018Items.BackgroundTransparency = 0.1
CGift_Sled2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Sled2018Items.BorderSizePixel = 0
CGift_Sled2018Items.Position = UDim2.new(0, 472, 0, 610)
CGift_Sled2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Sled2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Sled2018Items.Font = Enum.Font.SourceSans
CGift_Sled2018Items.FontSize = Enum.FontSize.Size14
CGift_Sled2018Items.Text = "0"
CGift_Sled2018Items.TextScaled = true
CGift_Sled2018Items.TextSize = 14
CGift_Sled2018Items.TextWrapped = true

CGift_GingerAxe2018Info = Instance.new("ImageLabel")
CGift_GingerAxe2018Info.BackgroundTransparency = 1
CGift_GingerAxe2018Info.Name = "CGift_GingerAxe2018Info"
CGift_GingerAxe2018Info.Parent = Giftsframe
CGift_GingerAxe2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_GingerAxe2018Info.Position = UDim2.new(0, 75, 0, 640)
CGift_GingerAxe2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_GingerAxe2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618174608"
CGift_GingerAxe2018Info.Visible = true

CGift_GingerAxe2018 = Instance.new("TextLabel")
CGift_GingerAxe2018.Name = "CGift_GingerAxe2018"
CGift_GingerAxe2018.Parent = Giftsframe
CGift_GingerAxe2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_GingerAxe2018.BackgroundTransparency = 0.1
CGift_GingerAxe2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_GingerAxe2018.BorderSizePixel = 0
CGift_GingerAxe2018.Position = UDim2.new(0, 45, 0, 710)
CGift_GingerAxe2018.Size = UDim2.new(0, 80, 0, 15)
CGift_GingerAxe2018.TextColor3 = Color3.new(1, 1, 1)
CGift_GingerAxe2018.Font = Enum.Font.SourceSans
CGift_GingerAxe2018.FontSize = Enum.FontSize.Size14
CGift_GingerAxe2018.Text = "GingerAxe Gift 2018"
CGift_GingerAxe2018.TextScaled = true
CGift_GingerAxe2018.TextSize = 14
CGift_GingerAxe2018.TextWrapped = true

CGift_GingerAxe2018Items = Instance.new("TextLabel")
CGift_GingerAxe2018Items.Name = "CGift_GingerAxe2018Items1"
CGift_GingerAxe2018Items.Parent = Giftsframe
CGift_GingerAxe2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_GingerAxe2018Items.BackgroundTransparency = 0.1
CGift_GingerAxe2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_GingerAxe2018Items.BorderSizePixel = 0
CGift_GingerAxe2018Items.Position = UDim2.new(0, 127, 0, 710)
CGift_GingerAxe2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_GingerAxe2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_GingerAxe2018Items.Font = Enum.Font.SourceSans
CGift_GingerAxe2018Items.FontSize = Enum.FontSize.Size14
CGift_GingerAxe2018Items.Text = "0"
CGift_GingerAxe2018Items.TextScaled = true
CGift_GingerAxe2018Items.TextSize = 14
CGift_GingerAxe2018Items.TextWrapped = true

CGift_Plum2018Info = Instance.new("ImageLabel")
CGift_Plum2018Info.BackgroundTransparency = 1
CGift_Plum2018Info.Name = "CGift_Plum2018Info"
CGift_Plum2018Info.Parent = Giftsframe
CGift_Plum2018Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Plum2018Info.Position = UDim2.new(0, 190, 0, 640)
CGift_Plum2018Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Plum2018Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2653676477"
CGift_Plum2018Info.Visible = true

CGift_Plum2018 = Instance.new("TextLabel")
CGift_Plum2018.Name = "CGift_Plum2018"
CGift_Plum2018.Parent = Giftsframe
CGift_Plum2018.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Plum2018.BackgroundTransparency = 0.1
CGift_Plum2018.BorderColor3 = Color3.new(0, 0, 0)
CGift_Plum2018.BorderSizePixel = 0
CGift_Plum2018.Position = UDim2.new(0, 160, 0, 710)
CGift_Plum2018.Size = UDim2.new(0, 80, 0, 15)
CGift_Plum2018.TextColor3 = Color3.new(1, 1, 1)
CGift_Plum2018.Font = Enum.Font.SourceSans
CGift_Plum2018.FontSize = Enum.FontSize.Size14
CGift_Plum2018.Text = "Plum Gift 2018"
CGift_Plum2018.TextScaled = true
CGift_Plum2018.TextSize = 14
CGift_Plum2018.TextWrapped = true

CGift_Plum2018Items = Instance.new("TextLabel")
CGift_Plum2018Items.Name = "CGift_Plum2018Items1"
CGift_Plum2018Items.Parent = Giftsframe
CGift_Plum2018Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Plum2018Items.BackgroundTransparency = 0.1
CGift_Plum2018Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Plum2018Items.BorderSizePixel = 0
CGift_Plum2018Items.Position = UDim2.new(0, 242, 0, 710)
CGift_Plum2018Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Plum2018Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Plum2018Items.Font = Enum.Font.SourceSans
CGift_Plum2018Items.FontSize = Enum.FontSize.Size14
CGift_Plum2018Items.Text = "0"
CGift_Plum2018Items.TextScaled = true
CGift_Plum2018Items.TextSize = 14
CGift_Plum2018Items.TextWrapped = true

CGift_Yellow2019Info = Instance.new("ImageLabel")
CGift_Yellow2019Info.BackgroundTransparency = 1
CGift_Yellow2019Info.Name = "CGift_Yellow2019Info"
CGift_Yellow2019Info.Parent = Giftsframe
CGift_Yellow2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Yellow2019Info.Position = UDim2.new(0, 300, 0, 640)
CGift_Yellow2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Yellow2019Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2655526836"
CGift_Yellow2019Info.Visible = true

CGift_Yellow2019 = Instance.new("TextLabel")
CGift_Yellow2019.Name = "CGift_Yellow2019"
CGift_Yellow2019.Parent = Giftsframe
CGift_Yellow2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Yellow2019.BackgroundTransparency = 0.1
CGift_Yellow2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Yellow2019.BorderSizePixel = 0
CGift_Yellow2019.Position = UDim2.new(0, 275, 0, 710)
CGift_Yellow2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Yellow2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Yellow2019.Font = Enum.Font.SourceSans
CGift_Yellow2019.FontSize = Enum.FontSize.Size14
CGift_Yellow2019.Text = "Yellow Gift 2019"
CGift_Yellow2019.TextScaled = true
CGift_Yellow2019.TextSize = 14
CGift_Yellow2019.TextWrapped = true

CGift_Yellow2019Items = Instance.new("TextLabel")
CGift_Yellow2019Items.Name = "CGift_Yellow2019Items1"
CGift_Yellow2019Items.Parent = Giftsframe
CGift_Yellow2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Yellow2019Items.BackgroundTransparency = 0.1
CGift_Yellow2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Yellow2019Items.BorderSizePixel = 0
CGift_Yellow2019Items.Position = UDim2.new(0, 357, 0, 710)
CGift_Yellow2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Yellow2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Yellow2019Items.Font = Enum.Font.SourceSans
CGift_Yellow2019Items.FontSize = Enum.FontSize.Size14
CGift_Yellow2019Items.Text = "0"
CGift_Yellow2019Items.TextScaled = true
CGift_Yellow2019Items.TextSize = 14
CGift_Yellow2019Items.TextWrapped = true

CGift_Wobble2020Info = Instance.new("ImageLabel")
CGift_Wobble2020Info.BackgroundTransparency = 1
CGift_Wobble2020Info.Name = "CGift_Wobble2020Info"
CGift_Wobble2020Info.Parent = Giftsframe
CGift_Wobble2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobble2020Info.Position = UDim2.new(0, 410, 0, 640)
CGift_Wobble2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobble2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479123756"
CGift_Wobble2020Info.Visible = true

CGift_Wobble2020 = Instance.new("TextLabel")
CGift_Wobble2020.Name = "CGift_Wobble2020"
CGift_Wobble2020.Parent = Giftsframe
CGift_Wobble2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2020.BackgroundTransparency = 0.1
CGift_Wobble2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2020.BorderSizePixel = 0
CGift_Wobble2020.Position = UDim2.new(0, 390, 0, 710)
CGift_Wobble2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobble2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2020.Font = Enum.Font.SourceSans
CGift_Wobble2020.FontSize = Enum.FontSize.Size14
CGift_Wobble2020.Text = "Wobble Gift 2020"
CGift_Wobble2020.TextScaled = true
CGift_Wobble2020.TextSize = 14
CGift_Wobble2020.TextWrapped = true

CGift_Wobble2020Items = Instance.new("TextLabel")
CGift_Wobble2020Items.Name = "CGift_Wobble2020Items1"
CGift_Wobble2020Items.Parent = Giftsframe
CGift_Wobble2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobble2020Items.BackgroundTransparency = 0.1
CGift_Wobble2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobble2020Items.BorderSizePixel = 0
CGift_Wobble2020Items.Position = UDim2.new(0, 472, 0, 710)
CGift_Wobble2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobble2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobble2020Items.Font = Enum.Font.SourceSans
CGift_Wobble2020Items.FontSize = Enum.FontSize.Size14
CGift_Wobble2020Items.Text = "0"
CGift_Wobble2020Items.TextScaled = true
CGift_Wobble2020Items.TextSize = 14
CGift_Wobble2020Items.TextWrapped = true

CGift_Teal2020Info = Instance.new("ImageLabel")
CGift_Teal2020Info.BackgroundTransparency = 1
CGift_Teal2020Info.Name = "CGift_Teal2020Info"
CGift_Teal2020Info.Parent = Giftsframe
CGift_Teal2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Teal2020Info.Position = UDim2.new(0, 75, 0, 740)
CGift_Teal2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Teal2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479135648"
CGift_Teal2020Info.Visible = true

CGift_Teal2020 = Instance.new("TextLabel")
CGift_Teal2020.Name = "CGift_Teal2020"
CGift_Teal2020.Parent = Giftsframe
CGift_Teal2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Teal2020.BackgroundTransparency = 0.1
CGift_Teal2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Teal2020.BorderSizePixel = 0
CGift_Teal2020.Position = UDim2.new(0, 45, 0, 810)
CGift_Teal2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Teal2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Teal2020.Font = Enum.Font.SourceSans
CGift_Teal2020.FontSize = Enum.FontSize.Size14
CGift_Teal2020.Text = "Teal Gift 2020"
CGift_Teal2020.TextScaled = true
CGift_Teal2020.TextSize = 14
CGift_Teal2020.TextWrapped = true

CGift_Teal2020Items = Instance.new("TextLabel")
CGift_Teal2020Items.Name = "CGift_Teal2020Items1"
CGift_Teal2020Items.Parent = Giftsframe
CGift_Teal2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Teal2020Items.BackgroundTransparency = 0.1
CGift_Teal2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Teal2020Items.BorderSizePixel = 0
CGift_Teal2020Items.Position = UDim2.new(0, 127, 0, 810)
CGift_Teal2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Teal2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Teal2020Items.Font = Enum.Font.SourceSans
CGift_Teal2020Items.FontSize = Enum.FontSize.Size14
CGift_Teal2020Items.Text = "0"
CGift_Teal2020Items.TextScaled = true
CGift_Teal2020Items.TextSize = 14
CGift_Teal2020Items.TextWrapped = true

CGift_Wobblel2021Info = Instance.new("ImageLabel")
CGift_Wobblel2021Info.BackgroundTransparency = 1
CGift_Wobblel2021Info.Name = "CGift_Wobblel2021Info"
CGift_Wobblel2021Info.Parent = Giftsframe
CGift_Wobblel2021Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Wobblel2021Info.Position = UDim2.new(0, 190, 0, 740)
CGift_Wobblel2021Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Wobblel2021Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479140819"
CGift_Wobblel2021Info.Visible = true

CGift_Wobblel2021 = Instance.new("TextLabel")
CGift_Wobblel2021.Name = "CGift_Wobblel2021"
CGift_Wobblel2021.Parent = Giftsframe
CGift_Wobblel2021.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobblel2021.BackgroundTransparency = 0.1
CGift_Wobblel2021.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobblel2021.BorderSizePixel = 0
CGift_Wobblel2021.Position = UDim2.new(0, 160, 0, 810)
CGift_Wobblel2021.Size = UDim2.new(0, 80, 0, 15)
CGift_Wobblel2021.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobblel2021.Font = Enum.Font.SourceSans
CGift_Wobblel2021.FontSize = Enum.FontSize.Size14
CGift_Wobblel2021.Text = "Wobble Gift 2021"
CGift_Wobblel2021.TextScaled = true
CGift_Wobblel2021.TextSize = 14
CGift_Wobblel2021.TextWrapped = true

CGift_Wobblel2021Items = Instance.new("TextLabel")
CGift_Wobblel2021Items.Name = "CGift_Wobblel2021Items1"
CGift_Wobblel2021Items.Parent = Giftsframe
CGift_Wobblel2021Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Wobblel2021Items.BackgroundTransparency = 0.1
CGift_Wobblel2021Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Wobblel2021Items.BorderSizePixel = 0
CGift_Wobblel2021Items.Position = UDim2.new(0, 242, 0, 810)
CGift_Wobblel2021Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Wobblel2021Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Wobblel2021Items.Font = Enum.Font.SourceSans
CGift_Wobblel2021Items.FontSize = Enum.FontSize.Size14
CGift_Wobblel2021Items.Text = "0"
CGift_Wobblel2021Items.TextScaled = true
CGift_Wobblel2021Items.TextSize = 14
CGift_Wobblel2021Items.TextWrapped = true

CGift_Black2021Info = Instance.new("ImageLabel")
CGift_Black2021Info.BackgroundTransparency = 1
CGift_Black2021Info.Name = "CGift_Black2021Info"
CGift_Black2021Info.Parent = Giftsframe
CGift_Black2021Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Black2021Info.Position = UDim2.new(0, 300, 0, 740)
CGift_Black2021Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Black2021Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479145384"
CGift_Black2021Info.Visible = true

CGift_Black2021 = Instance.new("TextLabel")
CGift_Black2021.Name = "CGift_Black2021"
CGift_Black2021.Parent = Giftsframe
CGift_Black2021.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Black2021.BackgroundTransparency = 0.1
CGift_Black2021.BorderColor3 = Color3.new(0, 0, 0)
CGift_Black2021.BorderSizePixel = 0
CGift_Black2021.Position = UDim2.new(0, 275, 0, 810)
CGift_Black2021.Size = UDim2.new(0, 80, 0, 15)
CGift_Black2021.TextColor3 = Color3.new(1, 1, 1)
CGift_Black2021.Font = Enum.Font.SourceSans
CGift_Black2021.FontSize = Enum.FontSize.Size14
CGift_Black2021.Text = "Black Gift 2021"
CGift_Black2021.TextScaled = true
CGift_Black2021.TextSize = 14
CGift_Black2021.TextWrapped = true

CGift_Black2021Items = Instance.new("TextLabel")
CGift_Black2021Items.Name = "CGift_Black2021Items1"
CGift_Black2021Items.Parent = Giftsframe
CGift_Black2021Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Black2021Items.BackgroundTransparency = 0.1
CGift_Black2021Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Black2021Items.BorderSizePixel = 0
CGift_Black2021Items.Position = UDim2.new(0, 357, 0, 810)
CGift_Black2021Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Black2021Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Black2021Items.Font = Enum.Font.SourceSans
CGift_Black2021Items.FontSize = Enum.FontSize.Size14
CGift_Black2021Items.Text = "0"
CGift_Black2021Items.TextScaled = true
CGift_Black2021Items.TextSize = 14
CGift_Black2021Items.TextWrapped = true

CGift_Cola2019Info = Instance.new("ImageLabel")
CGift_Cola2019Info.BackgroundTransparency = 1
CGift_Cola2019Info.Name = "CGift_Cola2019Info"
CGift_Cola2019Info.Parent = Giftsframe
CGift_Cola2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Cola2019Info.Position = UDim2.new(0, 410, 0, 740)
CGift_Cola2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Cola2019Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479249184"
CGift_Cola2019Info.Visible = true

CGift_Cola2019 = Instance.new("TextLabel")
CGift_Cola2019.Name = "CGift_Cola2019"
CGift_Cola2019.Parent = Giftsframe
CGift_Cola2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cola2019.BackgroundTransparency = 0.1
CGift_Cola2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cola2019.BorderSizePixel = 0
CGift_Cola2019.Position = UDim2.new(0, 390, 0, 810)
CGift_Cola2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Cola2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Cola2019.Font = Enum.Font.SourceSans
CGift_Cola2019.FontSize = Enum.FontSize.Size14
CGift_Cola2019.Text = "Cola Gift 2019"
CGift_Cola2019.TextScaled = true
CGift_Cola2019.TextSize = 14
CGift_Cola2019.TextWrapped = true

CGift_Cola2019Items = Instance.new("TextLabel")
CGift_Cola2019Items.Name = "CGift_Cola2019Items1"
CGift_Cola2019Items.Parent = Giftsframe
CGift_Cola2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cola2019Items.BackgroundTransparency = 0.1
CGift_Cola2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cola2019Items.BorderSizePixel = 0
CGift_Cola2019Items.Position = UDim2.new(0, 472, 0, 810)
CGift_Cola2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Cola2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Cola2019Items.Font = Enum.Font.SourceSans
CGift_Cola2019Items.FontSize = Enum.FontSize.Size14
CGift_Cola2019Items.Text = "0"
CGift_Cola2019Items.TextScaled = true
CGift_Cola2019Items.TextSize = 14
CGift_Cola2019Items.TextWrapped = true

CGift_Burnt2019Info = Instance.new("ImageLabel")
CGift_Burnt2019Info.BackgroundTransparency = 1
CGift_Burnt2019Info.Name = "CGift_Burnt2019Info"
CGift_Burnt2019Info.Parent = Giftsframe
CGift_Burnt2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Burnt2019Info.Position = UDim2.new(0, 75, 0, 840)
CGift_Burnt2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Burnt2019Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479280350"
CGift_Burnt2019Info.Visible = true

CGift_Burnt2019 = Instance.new("TextLabel")
CGift_Burnt2019.Name = "CGift_Burnt2019"
CGift_Burnt2019.Parent = Giftsframe
CGift_Burnt2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Burnt2019.BackgroundTransparency = 0.1
CGift_Burnt2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Burnt2019.BorderSizePixel = 0
CGift_Burnt2019.Position = UDim2.new(0, 45, 0, 910)
CGift_Burnt2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Burnt2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Burnt2019.Font = Enum.Font.SourceSans
CGift_Burnt2019.FontSize = Enum.FontSize.Size14
CGift_Burnt2019.Text = "Burnt Gift 2019"
CGift_Burnt2019.TextScaled = true
CGift_Burnt2019.TextSize = 14
CGift_Burnt2019.TextWrapped = true

CGift_Burnt2019Items = Instance.new("TextLabel")
CGift_Burnt2019Items.Name = "CGift_Burnt2019Items1"
CGift_Burnt2019Items.Parent = Giftsframe
CGift_Burnt2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Burnt2019Items.BackgroundTransparency = 0.1
CGift_Burnt2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Burnt2019Items.BorderSizePixel = 0
CGift_Burnt2019Items.Position = UDim2.new(0, 127, 0, 910)
CGift_Burnt2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Burnt2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Burnt2019Items.Font = Enum.Font.SourceSans
CGift_Burnt2019Items.FontSize = Enum.FontSize.Size14
CGift_Burnt2019Items.Text = "0"
CGift_Burnt2019Items.TextScaled = true
CGift_Burnt2019Items.TextSize = 14
CGift_Burnt2019Items.TextWrapped = true

CGift_Rusty2019Info = Instance.new("ImageLabel")
CGift_Rusty2019Info.BackgroundTransparency = 1
CGift_Rusty2019Info.Name = "CGift_Rusty2019Info"
CGift_Rusty2019Info.Parent = Giftsframe
CGift_Rusty2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Rusty2019Info.Position = UDim2.new(0, 190, 0, 840)
CGift_Rusty2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Rusty2019Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479365606"
CGift_Rusty2019Info.Visible = true

CGift_Rusty2019 = Instance.new("TextLabel")
CGift_Rusty2019.Name = "CGift_Rusty2019"
CGift_Rusty2019.Parent = Giftsframe
CGift_Rusty2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Rusty2019.BackgroundTransparency = 0.1
CGift_Rusty2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Rusty2019.BorderSizePixel = 0
CGift_Rusty2019.Position = UDim2.new(0, 160, 0, 910)
CGift_Rusty2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Rusty2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Rusty2019.Font = Enum.Font.SourceSans
CGift_Rusty2019.FontSize = Enum.FontSize.Size14
CGift_Rusty2019.Text = "Rusty Gift 2019"
CGift_Rusty2019.TextScaled = true
CGift_Rusty2019.TextSize = 14
CGift_Rusty2019.TextWrapped = true

CGift_Rusty2019Items = Instance.new("TextLabel")
CGift_Rusty2019Items.Name = "CGift_Rusty2019Items1"
CGift_Rusty2019Items.Parent = Giftsframe
CGift_Rusty2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Rusty2019Items.BackgroundTransparency = 0.1
CGift_Rusty2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Rusty2019Items.BorderSizePixel = 0
CGift_Rusty2019Items.Position = UDim2.new(0, 242, 0, 910)
CGift_Rusty2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Rusty2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Rusty2019Items.Font = Enum.Font.SourceSans
CGift_Rusty2019Items.FontSize = Enum.FontSize.Size14
CGift_Rusty2019Items.Text = "0"
CGift_Rusty2019Items.TextScaled = true
CGift_Rusty2019Items.TextSize = 14
CGift_Rusty2019Items.TextWrapped = true

CGift_Bowl2019Info = Instance.new("ImageLabel")
CGift_Bowl2019Info.BackgroundTransparency = 1
CGift_Bowl2019Info.Name = "CGift_Bowl2019Info"
CGift_Bowl2019Info.Parent = Giftsframe
CGift_Bowl2019Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Bowl2019Info.Position = UDim2.new(0, 300, 0, 840)
CGift_Bowl2019Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Bowl2019Info.Image = "rbxassetid://4518791342"
CGift_Bowl2019Info.Visible = true

CGift_Bowl2019 = Instance.new("TextLabel")
CGift_Bowl2019.Name = "CGift_Bowl2019"
CGift_Bowl2019.Parent = Giftsframe
CGift_Bowl2019.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Bowl2019.BackgroundTransparency = 0.1
CGift_Bowl2019.BorderColor3 = Color3.new(0, 0, 0)
CGift_Bowl2019.BorderSizePixel = 0
CGift_Bowl2019.Position = UDim2.new(0, 275, 0, 910)
CGift_Bowl2019.Size = UDim2.new(0, 80, 0, 15)
CGift_Bowl2019.TextColor3 = Color3.new(1, 1, 1)
CGift_Bowl2019.Font = Enum.Font.SourceSans
CGift_Bowl2019.FontSize = Enum.FontSize.Size14
CGift_Bowl2019.Text = "Bowl Gift 2019"
CGift_Bowl2019.TextScaled = true
CGift_Bowl2019.TextSize = 14
CGift_Bowl2019.TextWrapped = true

CGift_Bowl2019Items = Instance.new("TextLabel")
CGift_Bowl2019Items.Name = "CGift_Bowl2019Items1"
CGift_Bowl2019Items.Parent = Giftsframe
CGift_Bowl2019Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Bowl2019Items.BackgroundTransparency = 0.1
CGift_Bowl2019Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Bowl2019Items.BorderSizePixel = 0
CGift_Bowl2019Items.Position = UDim2.new(0, 357, 0, 910)
CGift_Bowl2019Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Bowl2019Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Bowl2019Items.Font = Enum.Font.SourceSans
CGift_Bowl2019Items.FontSize = Enum.FontSize.Size14
CGift_Bowl2019Items.Text = "0"
CGift_Bowl2019Items.TextScaled = true
CGift_Bowl2019Items.TextSize = 14
CGift_Bowl2019Items.TextWrapped = true

CGift_Cave2020Info = Instance.new("ImageLabel")
CGift_Cave2020Info.BackgroundTransparency = 1
CGift_Cave2020Info.Name = "CGift_Cave2020Info"
CGift_Cave2020Info.Parent = Giftsframe
CGift_Cave2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Cave2020Info.Position = UDim2.new(0, 410, 0, 840)
CGift_Cave2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Cave2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479426528"
CGift_Cave2020Info.Visible = true

CGift_Cave2020 = Instance.new("TextLabel")
CGift_Cave2020.Name = "CGift_Cave2020"
CGift_Cave2020.Parent = Giftsframe
CGift_Cave2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cave2020.BackgroundTransparency = 0.1
CGift_Cave2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cave2020.BorderSizePixel = 0
CGift_Cave2020.Position = UDim2.new(0, 390, 0, 910)
CGift_Cave2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Cave2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Cave2020.Font = Enum.Font.SourceSans
CGift_Cave2020.FontSize = Enum.FontSize.Size14
CGift_Cave2020.Text = "Cave Gift 2020"
CGift_Cave2020.TextScaled = true
CGift_Cave2020.TextSize = 14
CGift_Cave2020.TextWrapped = true

CGift_Cave2020Items = Instance.new("TextLabel")
CGift_Cave2020Items.Name = "CGift_Cave2020Items1"
CGift_Cave2020Items.Parent = Giftsframe
CGift_Cave2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Cave2020Items.BackgroundTransparency = 0.1
CGift_Cave2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Cave2020Items.BorderSizePixel = 0
CGift_Cave2020Items.Position = UDim2.new(0, 472, 0, 910)
CGift_Cave2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Cave2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Cave2020Items.Font = Enum.Font.SourceSans
CGift_Cave2020Items.FontSize = Enum.FontSize.Size14
CGift_Cave2020Items.Text = "0"
CGift_Cave2020Items.TextScaled = true
CGift_Cave2020Items.TextSize = 14
CGift_Cave2020Items.TextWrapped = true

CGift_Candy2020Info = Instance.new("ImageLabel")
CGift_Candy2020Info.BackgroundTransparency = 1
CGift_Candy2020Info.Name = "CGift_Candy2020Info"
CGift_Candy2020Info.Parent = Giftsframe
CGift_Candy2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Candy2020Info.Position = UDim2.new(0, 75, 0, 940)
CGift_Candy2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Candy2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=6027559735"
CGift_Candy2020Info.Visible = true

CGift_Candy2020 = Instance.new("TextLabel")
CGift_Candy2020.Name = "CGift_Candy2020"
CGift_Candy2020.Parent = Giftsframe
CGift_Candy2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Candy2020.BackgroundTransparency = 0.1
CGift_Candy2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Candy2020.BorderSizePixel = 0
CGift_Candy2020.Position = UDim2.new(0, 45, 0, 1010)
CGift_Candy2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Candy2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Candy2020.Font = Enum.Font.SourceSans
CGift_Candy2020.FontSize = Enum.FontSize.Size14
CGift_Candy2020.Text = "Candy Gift 2020"
CGift_Candy2020.TextScaled = true
CGift_Candy2020.TextSize = 14
CGift_Candy2020.TextWrapped = true

CGift_Candy2020Items = Instance.new("TextLabel")
CGift_Candy2020Items.Name = "CGift_Candy2020Items1"
CGift_Candy2020Items.Parent = Giftsframe
CGift_Candy2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Candy2020Items.BackgroundTransparency = 0.1
CGift_Candy2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Candy2020Items.BorderSizePixel = 0
CGift_Candy2020Items.Position = UDim2.new(0, 127, 0, 1010)
CGift_Candy2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Candy2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Candy2020Items.Font = Enum.Font.SourceSans
CGift_Candy2020Items.FontSize = Enum.FontSize.Size14
CGift_Candy2020Items.Text = "0"
CGift_Candy2020Items.TextScaled = true
CGift_Candy2020Items.TextSize = 14
CGift_Candy2020Items.TextWrapped = true

CGift_Hatchet2020Info = Instance.new("ImageLabel")
CGift_Hatchet2020Info.BackgroundTransparency = 1
CGift_Hatchet2020Info.Name = "CGift_Hatchet2020Info"
CGift_Hatchet2020Info.Parent = Giftsframe
CGift_Hatchet2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Hatchet2020Info.Position = UDim2.new(0, 190, 0, 940)
CGift_Hatchet2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Hatchet2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=6027556780"
CGift_Hatchet2020Info.Visible = true

CGift_Hatchet2020 = Instance.new("TextLabel")
CGift_Hatchet2020.Name = "CGift_Hatchet2020"
CGift_Hatchet2020.Parent = Giftsframe
CGift_Hatchet2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Hatchet2020.BackgroundTransparency = 0.1
CGift_Hatchet2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Hatchet2020.BorderSizePixel = 0
CGift_Hatchet2020.Position = UDim2.new(0, 160, 0, 1010)
CGift_Hatchet2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Hatchet2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Hatchet2020.Font = Enum.Font.SourceSans
CGift_Hatchet2020.FontSize = Enum.FontSize.Size14
CGift_Hatchet2020.Text = "Hatchet 2020"
CGift_Hatchet2020.TextScaled = true
CGift_Hatchet2020.TextSize = 14
CGift_Hatchet2020.TextWrapped = true

CGift_Hatchet2020Items = Instance.new("TextLabel")
CGift_Hatchet2020Items.Name = "CGift_Hatchet2020Items1"
CGift_Hatchet2020Items.Parent = Giftsframe
CGift_Hatchet2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Hatchet2020Items.BackgroundTransparency = 0.1
CGift_Hatchet2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Hatchet2020Items.BorderSizePixel = 0
CGift_Hatchet2020Items.Position = UDim2.new(0, 242, 0, 1010)
CGift_Hatchet2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Hatchet2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Hatchet2020Items.Font = Enum.Font.SourceSans
CGift_Hatchet2020Items.FontSize = Enum.FontSize.Size14
CGift_Hatchet2020Items.Text = "0"
CGift_Hatchet2020Items.TextScaled = true
CGift_Hatchet2020Items.TextSize = 14
CGift_Hatchet2020Items.TextWrapped = true

CGift_Car2020Info = Instance.new("ImageLabel")
CGift_Car2020Info.BackgroundTransparency = 1
CGift_Car2020Info.Name = "CGift_Car2020Info"
CGift_Car2020Info.Parent = Giftsframe
CGift_Car2020Info.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_Car2020Info.Position = UDim2.new(0, 300, 0, 940)
CGift_Car2020Info.Size = UDim2.new(0, 40, 0, 60)
CGift_Car2020Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=6027599922"
CGift_Car2020Info.Visible = true

CGift_Car2020 = Instance.new("TextLabel")
CGift_Car2020.Name = "CGift_Car2020"
CGift_Car2020.Parent = Giftsframe
CGift_Car2020.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Car2020.BackgroundTransparency = 0.1
CGift_Car2020.BorderColor3 = Color3.new(0, 0, 0)
CGift_Car2020.BorderSizePixel = 0
CGift_Car2020.Position = UDim2.new(0, 275, 0, 1010)
CGift_Car2020.Size = UDim2.new(0, 80, 0, 15)
CGift_Car2020.TextColor3 = Color3.new(1, 1, 1)
CGift_Car2020.Font = Enum.Font.SourceSans
CGift_Car2020.FontSize = Enum.FontSize.Size14
CGift_Car2020.Text = "Car Gift 2020"
CGift_Car2020.TextScaled = true
CGift_Car2020.TextSize = 14
CGift_Car2020.TextWrapped = true

CGift_Car2020Items = Instance.new("TextLabel")
CGift_Car2020Items.Name = "CGift_Car2020Items1"
CGift_Car2020Items.Parent = Giftsframe
CGift_Car2020Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_Car2020Items.BackgroundTransparency = 0.1
CGift_Car2020Items.BorderColor3 = Color3.new(0, 0, 0)
CGift_Car2020Items.BorderSizePixel = 0
CGift_Car2020Items.Position = UDim2.new(0, 357, 0, 1010)
CGift_Car2020Items.Size = UDim2.new(0, 20, 0, 15)
CGift_Car2020Items.TextColor3 = Color3.new(1, 1, 1)
CGift_Car2020Items.Font = Enum.Font.SourceSans
CGift_Car2020Items.FontSize = Enum.FontSize.Size14
CGift_Car2020Items.Text = "0"
CGift_Car2020Items.TextScaled = true
CGift_Car2020Items.TextSize = 14
CGift_Car2020Items.TextWrapped = true

CGift_2021CGift_TallInfo = Instance.new("ImageLabel")
CGift_2021CGift_TallInfo.BackgroundTransparency = 1
CGift_2021CGift_TallInfo.Name = "CGift_2021CGift_TallInfo"
CGift_2021CGift_TallInfo.Parent = Giftsframe
CGift_2021CGift_TallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CGift_2021CGift_TallInfo.Position = UDim2.new(0, 410, 0, 940)
CGift_2021CGift_TallInfo.Size = UDim2.new(0, 40, 0, 60)
CGift_2021CGift_TallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8255916410"
CGift_2021CGift_TallInfo.Visible = true

CGift_2021CGift_Tall = Instance.new("TextLabel")
CGift_2021CGift_Tall.Name = "CGift_2021CGift_Tall"
CGift_2021CGift_Tall.Parent = Giftsframe
CGift_2021CGift_Tall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_2021CGift_Tall.BackgroundTransparency = 0.1
CGift_2021CGift_Tall.BorderColor3 = Color3.new(0, 0, 0)
CGift_2021CGift_Tall.BorderSizePixel = 0
CGift_2021CGift_Tall.Position = UDim2.new(0, 390, 0, 1010)
CGift_2021CGift_Tall.Size = UDim2.new(0, 80, 0, 15)
CGift_2021CGift_Tall.TextColor3 = Color3.new(1, 1, 1)
CGift_2021CGift_Tall.Font = Enum.Font.SourceSans
CGift_2021CGift_Tall.FontSize = Enum.FontSize.Size14
CGift_2021CGift_Tall.Text = "2021 CGift Tall"
CGift_2021CGift_Tall.TextScaled = true
CGift_2021CGift_Tall.TextSize = 14
CGift_2021CGift_Tall.TextWrapped = true

CGift_2021CGift_TallItems = Instance.new("TextLabel")
CGift_2021CGift_TallItems.Name = "CGift_2021CGift_TallItems1"
CGift_2021CGift_TallItems.Parent = Giftsframe
CGift_2021CGift_TallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CGift_2021CGift_TallItems.BackgroundTransparency = 0.1
CGift_2021CGift_TallItems.BorderColor3 = Color3.new(0, 0, 0)
CGift_2021CGift_TallItems.BorderSizePixel = 0
CGift_2021CGift_TallItems.Position = UDim2.new(0, 472, 0, 1010)
CGift_2021CGift_TallItems.Size = UDim2.new(0, 20, 0, 15)
CGift_2021CGift_TallItems.TextColor3 = Color3.new(1, 1, 1)
CGift_2021CGift_TallItems.Font = Enum.Font.SourceSans
CGift_2021CGift_TallItems.FontSize = Enum.FontSize.Size14
CGift_2021CGift_TallItems.Text = "0"
CGift_2021CGift_TallItems.TextScaled = true
CGift_2021CGift_TallItems.TextSize = 14
CGift_2021CGift_TallItems.TextWrapped = true

C2021CGift_LumberInfo = Instance.new("ImageLabel")
C2021CGift_LumberInfo.BackgroundTransparency = 1
C2021CGift_LumberInfo.Name = "C2021CGift_LumberInfo"
C2021CGift_LumberInfo.Parent = Giftsframe
C2021CGift_LumberInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021CGift_LumberInfo.Position = UDim2.new(0, 75, 0, 1040)
C2021CGift_LumberInfo.Size = UDim2.new(0, 40, 0, 60)
C2021CGift_LumberInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8152434890"
C2021CGift_LumberInfo.Visible = true

C2021CGift_Lumber = Instance.new("TextLabel")
C2021CGift_Lumber.Name = "C2021CGift_Lumber"
C2021CGift_Lumber.Parent = Giftsframe
C2021CGift_Lumber.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_Lumber.BackgroundTransparency = 0.1
C2021CGift_Lumber.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_Lumber.BorderSizePixel = 0
C2021CGift_Lumber.Position = UDim2.new(0, 45, 0, 1110)
C2021CGift_Lumber.Size = UDim2.new(0, 80, 0, 15)
C2021CGift_Lumber.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_Lumber.Font = Enum.Font.SourceSans
C2021CGift_Lumber.FontSize = Enum.FontSize.Size14
C2021CGift_Lumber.Text = "2021 Gift Lumber"
C2021CGift_Lumber.TextScaled = true
C2021CGift_Lumber.TextSize = 14
C2021CGift_Lumber.TextWrapped = true

C2021CGift_LumberItems = Instance.new("TextLabel")
C2021CGift_LumberItems.Name = "C2021CGift_LumberItems1"
C2021CGift_LumberItems.Parent = Giftsframe
C2021CGift_LumberItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_LumberItems.BackgroundTransparency = 0.1
C2021CGift_LumberItems.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_LumberItems.BorderSizePixel = 0
C2021CGift_LumberItems.Position = UDim2.new(0, 127, 0, 1110)
C2021CGift_LumberItems.Size = UDim2.new(0, 20, 0, 15)
C2021CGift_LumberItems.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_LumberItems.Font = Enum.Font.SourceSans
C2021CGift_LumberItems.FontSize = Enum.FontSize.Size14
C2021CGift_LumberItems.Text = "0"
C2021CGift_LumberItems.TextScaled = true
C2021CGift_LumberItems.TextSize = 14
C2021CGift_LumberItems.TextWrapped = true

C2021GGift_GooInfo = Instance.new("ImageLabel")
C2021GGift_GooInfo.BackgroundTransparency = 1
C2021GGift_GooInfo.Name = "C2021GGift_GooInfo"
C2021GGift_GooInfo.Parent = Giftsframe
C2021GGift_GooInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021GGift_GooInfo.Position = UDim2.new(0, 190, 0, 1040)
C2021GGift_GooInfo.Size = UDim2.new(0, 40, 0, 60)
C2021GGift_GooInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8174040705"
C2021GGift_GooInfo.Visible = true

C2021GGift_Goo = Instance.new("TextLabel")
C2021GGift_Goo.Name = "C2021GGift_Goo"
C2021GGift_Goo.Parent = Giftsframe
C2021GGift_Goo.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_Goo.BackgroundTransparency = 0.1
C2021GGift_Goo.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_Goo.BorderSizePixel = 0
C2021GGift_Goo.Position = UDim2.new(0, 160, 0, 1110)
C2021GGift_Goo.Size = UDim2.new(0, 80, 0, 15)
C2021GGift_Goo.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_Goo.Font = Enum.Font.SourceSans
C2021GGift_Goo.FontSize = Enum.FontSize.Size14
C2021GGift_Goo.Text = "2021 Gift Goo"
C2021GGift_Goo.TextScaled = true
C2021GGift_Goo.TextSize = 14
C2021GGift_Goo.TextWrapped = true

C2021GGift_GooItems = Instance.new("TextLabel")
C2021GGift_GooItems.Name = "C2021GGift_GooItems1"
C2021GGift_GooItems.Parent = Giftsframe
C2021GGift_GooItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_GooItems.BackgroundTransparency = 0.1
C2021GGift_GooItems.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_GooItems.BorderSizePixel = 0
C2021GGift_GooItems.Position = UDim2.new(0, 242, 0, 1110)
C2021GGift_GooItems.Size = UDim2.new(0, 20, 0, 15)
C2021GGift_GooItems.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_GooItems.Font = Enum.Font.SourceSans
C2021GGift_GooItems.FontSize = Enum.FontSize.Size14
C2021GGift_GooItems.Text = "0"
C2021GGift_GooItems.TextScaled = true
C2021GGift_GooItems.TextSize = 14
C2021GGift_GooItems.TextWrapped = true

C2021GGift_WeightedInfo = Instance.new("ImageLabel")
C2021GGift_WeightedInfo.BackgroundTransparency = 1
C2021GGift_WeightedInfo.Name = "CGift_Hatchet2020Info"
C2021GGift_WeightedInfo.Parent = Giftsframe
C2021GGift_WeightedInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021GGift_WeightedInfo.Position = UDim2.new(0, 300, 0, 1040)
C2021GGift_WeightedInfo.Size = UDim2.new(0, 40, 0, 60)
C2021GGift_WeightedInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8174079935"
C2021GGift_WeightedInfo.Visible = true

C2021GGift_Weighted = Instance.new("TextLabel")
C2021GGift_Weighted.Name = "C2021GGift_Weighted"
C2021GGift_Weighted.Parent = Giftsframe
C2021GGift_Weighted.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_Weighted.BackgroundTransparency = 0.1
C2021GGift_Weighted.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_Weighted.BorderSizePixel = 0
C2021GGift_Weighted.Position = UDim2.new(0, 275, 0, 1110)
C2021GGift_Weighted.Size = UDim2.new(0, 80, 0, 15)
C2021GGift_Weighted.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_Weighted.Font = Enum.Font.SourceSans
C2021GGift_Weighted.FontSize = Enum.FontSize.Size14
C2021GGift_Weighted.Text = "2021 Gift Weighted"
C2021GGift_Weighted.TextScaled = true
C2021GGift_Weighted.TextSize = 14
C2021GGift_Weighted.TextWrapped = true

C2021GGift_WeightedItems = Instance.new("TextLabel")
C2021GGift_WeightedItems.Name = "C2021GGift_WeightedItems1"
C2021GGift_WeightedItems.Parent = Giftsframe
C2021GGift_WeightedItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_WeightedItems.BackgroundTransparency = 0.1
C2021GGift_WeightedItems.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_WeightedItems.BorderSizePixel = 0
C2021GGift_WeightedItems.Position = UDim2.new(0, 357, 0, 1110)
C2021GGift_WeightedItems.Size = UDim2.new(0, 20, 0, 15)
C2021GGift_WeightedItems.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_WeightedItems.Font = Enum.Font.SourceSans
C2021GGift_WeightedItems.FontSize = Enum.FontSize.Size14
C2021GGift_WeightedItems.Text = "0"
C2021GGift_WeightedItems.TextScaled = true
C2021GGift_WeightedItems.TextSize = 14
C2021GGift_WeightedItems.TextWrapped = true

C2021CGift_CandyInfo = Instance.new("ImageLabel")
C2021CGift_CandyInfo.BackgroundTransparency = 1
C2021CGift_CandyInfo.Name = "C2021CGift_CandyInfo"
C2021CGift_CandyInfo.Parent = Giftsframe
C2021CGift_CandyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021CGift_CandyInfo.Position = UDim2.new(0, 410, 0, 1040)
C2021CGift_CandyInfo.Size = UDim2.new(0, 40, 0, 60)
C2021CGift_CandyInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8152389260"
C2021CGift_CandyInfo.Visible = true

C2021CGift_Candy = Instance.new("TextLabel")
C2021CGift_Candy.Name = "C2021CGift_Candy"
C2021CGift_Candy.Parent = Giftsframe
C2021CGift_Candy.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_Candy.BackgroundTransparency = 0.1
C2021CGift_Candy.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_Candy.BorderSizePixel = 0
C2021CGift_Candy.Position = UDim2.new(0, 390, 0, 1110)
C2021CGift_Candy.Size = UDim2.new(0, 80, 0, 15)
C2021CGift_Candy.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_Candy.Font = Enum.Font.SourceSans
C2021CGift_Candy.FontSize = Enum.FontSize.Size14
C2021CGift_Candy.Text = "2021 Gift Candy"
C2021CGift_Candy.TextScaled = true
C2021CGift_Candy.TextSize = 14
C2021CGift_Candy.TextWrapped = true

C2021CGift_CandyItems = Instance.new("TextLabel")
C2021CGift_CandyItems.Name = "C2021CGift_CandyItems1"
C2021CGift_CandyItems.Parent = Giftsframe
C2021CGift_CandyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_CandyItems.BackgroundTransparency = 0.1
C2021CGift_CandyItems.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_CandyItems.BorderSizePixel = 0
C2021CGift_CandyItems.Position = UDim2.new(0, 472, 0, 1110)
C2021CGift_CandyItems.Size = UDim2.new(0, 20, 0, 15)
C2021CGift_CandyItems.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_CandyItems.Font = Enum.Font.SourceSans
C2021CGift_CandyItems.FontSize = Enum.FontSize.Size14
C2021CGift_CandyItems.Text = "0"
C2021CGift_CandyItems.TextScaled = true
C2021CGift_CandyItems.TextSize = 14
C2021CGift_CandyItems.TextWrapped = true

C2021CGift_PlumpInfo = Instance.new("ImageLabel")
C2021CGift_PlumpInfo.BackgroundTransparency = 1
C2021CGift_PlumpInfo.Name = "C2021CGift_PlumpInfo"
C2021CGift_PlumpInfo.Parent = Giftsframe
C2021CGift_PlumpInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021CGift_PlumpInfo.Position = UDim2.new(0, 75, 0, 1140)
C2021CGift_PlumpInfo.Size = UDim2.new(0, 40, 0, 60)
C2021CGift_PlumpInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8174151902"
C2021CGift_PlumpInfo.Visible = true

C2021CGift_Plump = Instance.new("TextLabel")
C2021CGift_Plump.Name = "C2021CGift_Plump"
C2021CGift_Plump.Parent = Giftsframe
C2021CGift_Plump.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_Plump.BackgroundTransparency = 0.1
C2021CGift_Plump.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_Plump.BorderSizePixel = 0
C2021CGift_Plump.Position = UDim2.new(0, 45, 0, 1210)
C2021CGift_Plump.Size = UDim2.new(0, 80, 0, 15)
C2021CGift_Plump.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_Plump.Font = Enum.Font.SourceSans
C2021CGift_Plump.FontSize = Enum.FontSize.Size14
C2021CGift_Plump.Text = "2021 Gift Plump"
C2021CGift_Plump.TextScaled = true
C2021CGift_Plump.TextSize = 14
C2021CGift_Plump.TextWrapped = true

C2021CGift_PlumpItems = Instance.new("TextLabel")
C2021CGift_PlumpItems.Name = "C2021CGift_PlumpItems1"
C2021CGift_PlumpItems.Parent = Giftsframe
C2021CGift_PlumpItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021CGift_PlumpItems.BackgroundTransparency = 0.1
C2021CGift_PlumpItems.BorderColor3 = Color3.new(0, 0, 0)
C2021CGift_PlumpItems.BorderSizePixel = 0
C2021CGift_PlumpItems.Position = UDim2.new(0, 127, 0, 1210)
C2021CGift_PlumpItems.Size = UDim2.new(0, 20, 0, 15)
C2021CGift_PlumpItems.TextColor3 = Color3.new(1, 1, 1)
C2021CGift_PlumpItems.Font = Enum.Font.SourceSans
C2021CGift_PlumpItems.FontSize = Enum.FontSize.Size14
C2021CGift_PlumpItems.Text = "0"
C2021CGift_PlumpItems.TextScaled = true
C2021CGift_PlumpItems.TextSize = 14
C2021CGift_PlumpItems.TextWrapped = true

C2021GGift_ColdInfo = Instance.new("ImageLabel")
C2021GGift_ColdInfo.BackgroundTransparency = 1
C2021GGift_ColdInfo.Name = "C2021GGift_ColdInfo"
C2021GGift_ColdInfo.Parent = Giftsframe
C2021GGift_ColdInfo.BackgroundColor3 = Color3.new(1, 1, 1)
C2021GGift_ColdInfo.Position = UDim2.new(0, 190, 0, 1140)
C2021GGift_ColdInfo.Size = UDim2.new(0, 40, 0, 60)
C2021GGift_ColdInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8174179098"
C2021GGift_ColdInfo.Visible = true

C2021GGift_Cold = Instance.new("TextLabel")
C2021GGift_Cold.Name = "C2021GGift_Cold"
C2021GGift_Cold.Parent = Giftsframe
C2021GGift_Cold.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_Cold.BackgroundTransparency = 0.1
C2021GGift_Cold.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_Cold.BorderSizePixel = 0
C2021GGift_Cold.Position = UDim2.new(0, 160, 0, 1210)
C2021GGift_Cold.Size = UDim2.new(0, 80, 0, 15)
C2021GGift_Cold.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_Cold.Font = Enum.Font.SourceSans
C2021GGift_Cold.FontSize = Enum.FontSize.Size14
C2021GGift_Cold.Text = "2021 Gift Cold"
C2021GGift_Cold.TextScaled = true
C2021GGift_Cold.TextSize = 14
C2021GGift_Cold.TextWrapped = true

C2021GGift_ColdItems = Instance.new("TextLabel")
C2021GGift_ColdItems.Name = "C2021GGift_ColdItems1"
C2021GGift_ColdItems.Parent = Giftsframe
C2021GGift_ColdItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
C2021GGift_ColdItems.BackgroundTransparency = 0.1
C2021GGift_ColdItems.BorderColor3 = Color3.new(0, 0, 0)
C2021GGift_ColdItems.BorderSizePixel = 0
C2021GGift_ColdItems.Position = UDim2.new(0, 242, 0, 1210)
C2021GGift_ColdItems.Size = UDim2.new(0, 20, 0, 15)
C2021GGift_ColdItems.TextColor3 = Color3.new(1, 1, 1)
C2021GGift_ColdItems.Font = Enum.Font.SourceSans
C2021GGift_ColdItems.FontSize = Enum.FontSize.Size14
C2021GGift_ColdItems.Text = "0"
C2021GGift_ColdItems.TextScaled = true
C2021GGift_ColdItems.TextSize = 14
C2021GGift_ColdItems.TextWrapped = true

Painting1Info = Instance.new("ImageLabel")
Painting1Info.BackgroundTransparency = 1
Painting1Info.Name = "Painting1Info"
Painting1Info.Parent = Paintingsframe
Painting1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting1Info.Position = UDim2.new(0, 75, 0, 40)
Painting1Info.Size = UDim2.new(0, 40, 0, 60)
Painting1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=432783499"
Painting1Info.Visible = true

Painting1 = Instance.new("TextLabel")
Painting1.Name = "Painting1"
Painting1.Parent = Paintingsframe
Painting1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting1.BackgroundTransparency = 0.1
Painting1.BorderColor3 = Color3.new(0, 0, 0)
Painting1.BorderSizePixel = 0
Painting1.Position = UDim2.new(0, 45, 0, 110)
Painting1.Size = UDim2.new(0, 80, 0, 15)
Painting1.TextColor3 = Color3.new(1, 1, 1)
Painting1.Font = Enum.Font.SourceSans
Painting1.FontSize = Enum.FontSize.Size14
Painting1.Text = "Title Unknown"
Painting1.TextScaled = true
Painting1.TextSize = 14
Painting1.TextWrapped = true

Painting1Items = Instance.new("TextLabel")
Painting1Items.Name = "Painting1Items1"
Painting1Items.Parent = Paintingsframe
Painting1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting1Items.BackgroundTransparency = 0.1
Painting1Items.BorderColor3 = Color3.new(0, 0, 0)
Painting1Items.BorderSizePixel = 0
Painting1Items.Position = UDim2.new(0, 127, 0, 110)
Painting1Items.Size = UDim2.new(0, 20, 0, 15)
Painting1Items.TextColor3 = Color3.new(1, 1, 1)
Painting1Items.Font = Enum.Font.SourceSans
Painting1Items.FontSize = Enum.FontSize.Size14
Painting1Items.Text = "0"
Painting1Items.TextScaled = true
Painting1Items.TextSize = 14
Painting1Items.TextWrapped = true

Painting2Info = Instance.new("ImageLabel")
Painting2Info.BackgroundTransparency = 1
Painting2Info.Name = "Painting2Info"
Painting2Info.Parent = Paintingsframe
Painting2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting2Info.Position = UDim2.new(0, 190, 0, 40)
Painting2Info.Size = UDim2.new(0, 40, 0, 60)
Painting2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=509092758"
Painting2Info.Visible = true

Painting2 = Instance.new("TextLabel")
Painting2.Name = "Painting2"
Painting2.Parent = Paintingsframe
Painting2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting2.BackgroundTransparency = 0.1
Painting2.BorderColor3 = Color3.new(0, 0, 0)
Painting2.BorderSizePixel = 0
Painting2.Position = UDim2.new(0, 160, 0, 110)
Painting2.Size = UDim2.new(0, 80, 0, 15)
Painting2.TextColor3 = Color3.new(1, 1, 1)
Painting2.Font = Enum.Font.SourceSans
Painting2.FontSize = Enum.FontSize.Size14
Painting2.Text = "Disturbed Painting"
Painting2.TextScaled = true
Painting2.TextSize = 14
Painting2.TextWrapped = true

Painting2Items = Instance.new("TextLabel")
Painting2Items.Name = "Painting2Items1"
Painting2Items.Parent = Paintingsframe
Painting2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting2Items.BackgroundTransparency = 0.1
Painting2Items.BorderColor3 = Color3.new(0, 0, 0)
Painting2Items.BorderSizePixel = 0
Painting2Items.Position = UDim2.new(0, 242, 0, 110)
Painting2Items.Size = UDim2.new(0, 20, 0, 15)
Painting2Items.TextColor3 = Color3.new(1, 1, 1)
Painting2Items.Font = Enum.Font.SourceSans
Painting2Items.FontSize = Enum.FontSize.Size14
Painting2Items.Text = "0"
Painting2Items.TextScaled = true
Painting2Items.TextSize = 14
Painting2Items.TextWrapped = true

Painting3Info = Instance.new("ImageLabel")
Painting3Info.BackgroundTransparency = 1
Painting3Info.Name = "Painting3Info"
Painting3Info.Parent = Paintingsframe
Painting3Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting3Info.Position = UDim2.new(0, 300, 0, 40)
Painting3Info.Size = UDim2.new(0, 40, 0, 60)
Painting3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=526706231"
Painting3Info.Visible = true

Painting3 = Instance.new("TextLabel")
Painting3.Name = "Painting3"
Painting3.Parent = Paintingsframe
Painting3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting3.BackgroundTransparency = 0.1
Painting3.BorderColor3 = Color3.new(0, 0, 0)
Painting3.BorderSizePixel = 0
Painting3.Position = UDim2.new(0, 275, 0, 110)
Painting3.Size = UDim2.new(0, 80, 0, 15)
Painting3.TextColor3 = Color3.new(1, 1, 1)
Painting3.Font = Enum.Font.SourceSans
Painting3.FontSize = Enum.FontSize.Size14
Painting3.Text = "Outdoor Watercolor"
Painting3.TextScaled = true
Painting3.TextSize = 14
Painting3.TextWrapped = true

Painting3Items = Instance.new("TextLabel")
Painting3Items.Name = "Painting3Items1"
Painting3Items.Parent = Paintingsframe
Painting3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting3Items.BackgroundTransparency = 0.1
Painting3Items.BorderColor3 = Color3.new(0, 0, 0)
Painting3Items.BorderSizePixel = 0
Painting3Items.Position = UDim2.new(0, 357, 0, 110)
Painting3Items.Size = UDim2.new(0, 20, 0, 15)
Painting3Items.TextColor3 = Color3.new(1, 1, 1)
Painting3Items.Font = Enum.Font.SourceSans
Painting3Items.FontSize = Enum.FontSize.Size14
Painting3Items.Text = "0"
Painting3Items.TextScaled = true
Painting3Items.TextSize = 14
Painting3Items.TextWrapped = true


Painting4Info = Instance.new("ImageLabel")
Painting4Info.BackgroundTransparency = 1
Painting4Info.Name = "Painting4Info"
Painting4Info.Parent = Paintingsframe
Painting4Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting4Info.Position = UDim2.new(0, 410, 0, 40)
Painting4Info.Size = UDim2.new(0, 40, 0, 60)
Painting4Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=572000368"
Painting4Info.Visible = true

Painting4 = Instance.new("TextLabel")
Painting4.Name = "Painting4"
Painting4.Parent = Paintingsframe
Painting4.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting4.BackgroundTransparency = 0.1
Painting4.BorderColor3 = Color3.new(0, 0, 0)
Painting4.BorderSizePixel = 0
Painting4.Position = UDim2.new(0, 390, 0, 110)
Painting4.Size = UDim2.new(0, 80, 0, 15)
Painting4.TextColor3 = Color3.new(1, 1, 1)
Painting4.Font = Enum.Font.SourceSans
Painting4.FontSize = Enum.FontSize.Size14
Painting4.Text = "Bold and Brash"
Painting4.TextScaled = true
Painting4.TextSize = 14
Painting4.TextWrapped = true

Painting4Items = Instance.new("TextLabel")
Painting4Items.Name = "Painting4Items1"
Painting4Items.Parent = Paintingsframe
Painting4Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting4Items.BackgroundTransparency = 0.1
Painting4Items.BorderColor3 = Color3.new(0, 0, 0)
Painting4Items.BorderSizePixel = 0
Painting4Items.Position = UDim2.new(0, 472, 0, 110)
Painting4Items.Size = UDim2.new(0, 20, 0, 15)
Painting4Items.TextColor3 = Color3.new(1, 1, 1)
Painting4Items.Font = Enum.Font.SourceSans
Painting4Items.FontSize = Enum.FontSize.Size14
Painting4Items.Text = "0"
Painting4Items.TextScaled = true
Painting4Items.TextSize = 14
Painting4Items.TextWrapped = true

Painting5Info = Instance.new("ImageLabel")
Painting5Info.BackgroundTransparency = 1
Painting5Info.Name = "Painting5Info"
Painting5Info.Parent = Paintingsframe
Painting5Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting5Info.Position = UDim2.new(0, 75, 0, 140)
Painting5Info.Size = UDim2.new(0, 40, 0, 60)
Painting5Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211442028"
Painting5Info.Visible = true

Painting5 = Instance.new("TextLabel")
Painting5.Name = "Painting5"
Painting5.Parent = Paintingsframe
Painting5.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting5.BackgroundTransparency = 0.1
Painting5.BorderColor3 = Color3.new(0, 0, 0)
Painting5.BorderSizePixel = 0
Painting5.Position = UDim2.new(0, 45, 0, 210)
Painting5.Size = UDim2.new(0, 80, 0, 15)
Painting5.TextColor3 = Color3.new(1, 1, 1)
Painting5.Font = Enum.Font.SourceSans
Painting5.FontSize = Enum.FontSize.Size14
Painting5.Text = "Full Context"
Painting5.TextScaled = true
Painting5.TextSize = 14
Painting5.TextWrapped = true

Painting5Items = Instance.new("TextLabel")
Painting5Items.Name = "Painting5Items1"
Painting5Items.Parent = Paintingsframe
Painting5Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting5Items.BackgroundTransparency = 0.1
Painting5Items.BorderColor3 = Color3.new(0, 0, 0)
Painting5Items.BorderSizePixel = 0
Painting5Items.Position = UDim2.new(0, 127, 0, 210)
Painting5Items.Size = UDim2.new(0, 20, 0, 15)
Painting5Items.TextColor3 = Color3.new(1, 1, 1)
Painting5Items.Font = Enum.Font.SourceSans
Painting5Items.FontSize = Enum.FontSize.Size14
Painting5Items.Text = "0"
Painting5Items.TextScaled = true
Painting5Items.TextSize = 14
Painting5Items.TextWrapped = true

Painting6Info = Instance.new("ImageLabel")
Painting6Info.BackgroundTransparency = 1
Painting6Info.Name = "Painting6Info"
Painting6Info.Parent = Paintingsframe
Painting6Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting6Info.Position = UDim2.new(0, 190, 0, 140)
Painting6Info.Size = UDim2.new(0, 40, 0, 60)
Painting6Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2360984275"
Painting6Info.Visible = true

Painting6 = Instance.new("TextLabel")
Painting6.Name = "Painting6"
Painting6.Parent = Paintingsframe
Painting6.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting6.BackgroundTransparency = 0.1
Painting6.BorderColor3 = Color3.new(0, 0, 0)
Painting6.BorderSizePixel = 0
Painting6.Position = UDim2.new(0, 160, 0, 210)
Painting6.Size = UDim2.new(0, 80, 0, 15)
Painting6.TextColor3 = Color3.new(1, 1, 1)
Painting6.Font = Enum.Font.SourceSans
Painting6.FontSize = Enum.FontSize.Size14
Painting6.Text = "Gloomy Seascape"
Painting6.TextScaled = true
Painting6.TextSize = 14
Painting6.TextWrapped = true

Painting6Items = Instance.new("TextLabel")
Painting6Items.Name = "Painting6Items1"
Painting6Items.Parent = Paintingsframe
Painting6Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting6Items.BackgroundTransparency = 0.1
Painting6Items.BorderColor3 = Color3.new(0, 0, 0)
Painting6Items.BorderSizePixel = 0
Painting6Items.Position = UDim2.new(0, 242, 0, 210)
Painting6Items.Size = UDim2.new(0, 20, 0, 15)
Painting6Items.TextColor3 = Color3.new(1, 1, 1)
Painting6Items.Font = Enum.Font.SourceSans
Painting6Items.FontSize = Enum.FontSize.Size14
Painting6Items.Text = "0"
Painting6Items.TextScaled = true
Painting6Items.TextSize = 14
Painting6Items.TextWrapped = true

Painting7Info = Instance.new("ImageLabel")
Painting7Info.BackgroundTransparency = 1
Painting7Info.Name = "Painting7Info"
Painting7Info.Parent = Paintingsframe
Painting7Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting7Info.Position = UDim2.new(0, 300, 0, 140)
Painting7Info.Size = UDim2.new(0, 40, 0, 60)
Painting7Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2361000233"
Painting7Info.Visible = true

Painting7 = Instance.new("TextLabel")
Painting7.Name = "Painting7"
Painting7.Parent = Paintingsframe
Painting7.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting7.BackgroundTransparency = 0.1
Painting7.BorderColor3 = Color3.new(0, 0, 0)
Painting7.BorderSizePixel = 0
Painting7.Position = UDim2.new(0, 275, 0, 210)
Painting7.Size = UDim2.new(0, 80, 0, 15)
Painting7.TextColor3 = Color3.new(1, 1, 1)
Painting7.Font = Enum.Font.SourceSans
Painting7.FontSize = Enum.FontSize.Size14
Painting7.Text = "Arctic Light"
Painting7.TextScaled = true
Painting7.TextSize = 14
Painting7.TextWrapped = true

Painting7Items = Instance.new("TextLabel")
Painting7Items.Name = "Painting7Items1"
Painting7Items.Parent = Paintingsframe
Painting7Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting7Items.BackgroundTransparency = 0.1
Painting7Items.BorderColor3 = Color3.new(0, 0, 0)
Painting7Items.BorderSizePixel = 0
Painting7Items.Position = UDim2.new(0, 357, 0, 210)
Painting7Items.Size = UDim2.new(0, 20, 0, 15)
Painting7Items.TextColor3 = Color3.new(1, 1, 1)
Painting7Items.Font = Enum.Font.SourceSans
Painting7Items.FontSize = Enum.FontSize.Size14
Painting7Items.Text = "0"
Painting7Items.TextScaled = true
Painting7Items.TextSize = 14
Painting7Items.TextWrapped = true

Painting8Info = Instance.new("ImageLabel")
Painting8Info.BackgroundTransparency = 1
Painting8Info.Name = "Painting8Info"
Painting8Info.Parent = Paintingsframe
Painting8Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting8Info.Position = UDim2.new(0, 410, 0, 140)
Painting8Info.Size = UDim2.new(0, 40, 0, 60)
Painting8Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2361031460"
Painting8Info.Visible = true

Painting8 = Instance.new("TextLabel")
Painting8.Name = "Painting8"
Painting8.Parent = Paintingsframe
Painting8.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting8.BackgroundTransparency = 0.1
Painting8.BorderColor3 = Color3.new(0, 0, 0)
Painting8.BorderSizePixel = 0
Painting8.Position = UDim2.new(0, 390, 0, 210)
Painting8.Size = UDim2.new(0, 80, 0, 15)
Painting8.TextColor3 = Color3.new(1, 1, 1)
Painting8.Font = Enum.Font.SourceSans
Painting8.FontSize = Enum.FontSize.Size14
Painting8.Text = "Pineapple"
Painting8.TextScaled = true
Painting8.TextSize = 14
Painting8.TextWrapped = true

Painting8Items = Instance.new("TextLabel")
Painting8Items.Name = "Painting8Items1"
Painting8Items.Parent = Paintingsframe
Painting8Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting8Items.BackgroundTransparency = 0.1
Painting8Items.BorderColor3 = Color3.new(0, 0, 0)
Painting8Items.BorderSizePixel = 0
Painting8Items.Position = UDim2.new(0, 472, 0, 210)
Painting8Items.Size = UDim2.new(0, 20, 0, 15)
Painting8Items.TextColor3 = Color3.new(1, 1, 1)
Painting8Items.Font = Enum.Font.SourceSans
Painting8Items.FontSize = Enum.FontSize.Size14
Painting8Items.Text = "0"
Painting8Items.TextScaled = true
Painting8Items.TextSize = 14
Painting8Items.TextWrapped = true

Painting9Info = Instance.new("ImageLabel")
Painting9Info.BackgroundTransparency = 1
Painting9Info.Name = "Painting9Info"
Painting9Info.Parent = Paintingsframe
Painting9Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting9Info.Position = UDim2.new(0, 75, 0, 240)
Painting9Info.Size = UDim2.new(0, 40, 0, 60)
Painting9Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2617775429"
Painting9Info.Visible = true

Painting9 = Instance.new("TextLabel")
Painting9.Name = "Painting9"
Painting9.Parent = Paintingsframe
Painting9.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting9.BackgroundTransparency = 0.1
Painting9.BorderColor3 = Color3.new(0, 0, 0)
Painting9.BorderSizePixel = 0
Painting9.Position = UDim2.new(0, 45, 0, 310)
Painting9.Size = UDim2.new(0, 80, 0, 15)
Painting9.TextColor3 = Color3.new(1, 1, 1)
Painting9.Font = Enum.Font.SourceSans
Painting9.FontSize = Enum.FontSize.Size14
Painting9.Text = "Lonely Giraffe"
Painting9.TextScaled = true
Painting9.TextSize = 14
Painting9.TextWrapped = true

Painting9Items = Instance.new("TextLabel")
Painting9Items.Name = "Painting9Items1"
Painting9Items.Parent = Paintingsframe
Painting9Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting9Items.BackgroundTransparency = 0.1
Painting9Items.BorderColor3 = Color3.new(0, 0, 0)
Painting9Items.BorderSizePixel = 0
Painting9Items.Position = UDim2.new(0, 127, 0, 310)
Painting9Items.Size = UDim2.new(0, 20, 0, 15)
Painting9Items.TextColor3 = Color3.new(1, 1, 1)
Painting9Items.Font = Enum.Font.SourceSans
Painting9Items.FontSize = Enum.FontSize.Size14
Painting9Items.Text = "0"
Painting9Items.TextScaled = true
Painting9Items.TextSize = 14
Painting9Items.TextWrapped = true

Painting10Info = Instance.new("ImageLabel")
Painting10Info.BackgroundTransparency = 1
Painting10Info.Name = "Painting10Info"
Painting10Info.Parent = Paintingsframe
Painting10Info.BackgroundColor3 = Color3.new(1, 1, 1)
Painting10Info.Position = UDim2.new(0, 190, 0, 240)
Painting10Info.Size = UDim2.new(0, 40, 0, 60)
Painting10Info.Image = "http://www.roblox.com/asset/?id=4472455025"
Painting10Info.Visible = true

Painting10 = Instance.new("TextLabel")
Painting10.Name = "Painting10"
Painting10.Parent = Paintingsframe
Painting10.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting10.BackgroundTransparency = 0.1
Painting10.BorderColor3 = Color3.new(0, 0, 0)
Painting10.BorderSizePixel = 0
Painting10.Position = UDim2.new(0, 160, 0, 310)
Painting10.Size = UDim2.new(0, 80, 0, 15)
Painting10.TextColor3 = Color3.new(1, 1, 1)
Painting10.Font = Enum.Font.SourceSans
Painting10.FontSize = Enum.FontSize.Size14
Painting10.Text = "Burnt Painting"
Painting10.TextScaled = true
Painting10.TextSize = 14
Painting10.TextWrapped = true

Painting10Items = Instance.new("TextLabel")
Painting10Items.Name = "Painting10Items1"
Painting10Items.Parent = Paintingsframe
Painting10Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Painting10Items.BackgroundTransparency = 0.1
Painting10Items.BorderColor3 = Color3.new(0, 0, 0)
Painting10Items.BorderSizePixel = 0
Painting10Items.Position = UDim2.new(0, 242, 0, 310)
Painting10Items.Size = UDim2.new(0, 20, 0, 15)
Painting10Items.TextColor3 = Color3.new(1, 1, 1)
Painting10Items.Font = Enum.Font.SourceSans
Painting10Items.FontSize = Enum.FontSize.Size14
Painting10Items.Text = "0"
Painting10Items.TextScaled = true
Painting10Items.TextSize = 14
Painting10Items.TextWrapped = true

FloorLamp1Info = Instance.new("ImageLabel")
FloorLamp1Info.BackgroundTransparency = 1
FloorLamp1Info.Name = "FloorLamp1Info"
FloorLamp1Info.Parent = Furnishingsframe
FloorLamp1Info.BackgroundColor3 = Color3.new(1, 1, 1)
FloorLamp1Info.Position = UDim2.new(0, 75, 0, 40)
FloorLamp1Info.Size = UDim2.new(0, 40, 0, 60)
FloorLamp1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273532549"
FloorLamp1Info.Visible = true

FloorLamp1 = Instance.new("TextLabel")
FloorLamp1.Name = "FloorLamp1"
FloorLamp1.Parent = Furnishingsframe
FloorLamp1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FloorLamp1.BackgroundTransparency = 0.1
FloorLamp1.BorderColor3 = Color3.new(0, 0, 0)
FloorLamp1.BorderSizePixel = 0
FloorLamp1.Position = UDim2.new(0, 45, 0, 110)
FloorLamp1.Size = UDim2.new(0, 80, 0, 15)
FloorLamp1.TextColor3 = Color3.new(1, 1, 1)
FloorLamp1.Font = Enum.Font.SourceSans
FloorLamp1.FontSize = Enum.FontSize.Size14
FloorLamp1.Text = "Floor Lamp"
FloorLamp1.TextScaled = true
FloorLamp1.TextSize = 14
FloorLamp1.TextWrapped = true

FloorLamp1Items = Instance.new("TextLabel")
FloorLamp1Items.Name = "FloorLamp1Items1"
FloorLamp1Items.Parent = Furnishingsframe
FloorLamp1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FloorLamp1Items.BackgroundTransparency = 0.1
FloorLamp1Items.BorderColor3 = Color3.new(0, 0, 0)
FloorLamp1Items.BorderSizePixel = 0
FloorLamp1Items.Position = UDim2.new(0, 127, 0, 110)
FloorLamp1Items.Size = UDim2.new(0, 20, 0, 15)
FloorLamp1Items.TextColor3 = Color3.new(1, 1, 1)
FloorLamp1Items.Font = Enum.Font.SourceSans
FloorLamp1Items.FontSize = Enum.FontSize.Size14
FloorLamp1Items.Text = "0"
FloorLamp1Items.TextScaled = true
FloorLamp1Items.TextSize = 14
FloorLamp1Items.TextWrapped = true

WallLight1Info = Instance.new("ImageLabel")
WallLight1Info.BackgroundTransparency = 1
WallLight1Info.Name = "WallLight1Info"
WallLight1Info.Parent = Furnishingsframe
WallLight1Info.BackgroundColor3 = Color3.new(1, 1, 1)
WallLight1Info.Position = UDim2.new(0, 190, 0, 40)
WallLight1Info.Size = UDim2.new(0, 40, 0, 60)
WallLight1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273605903"
WallLight1Info.Visible = true

WallLight1 = Instance.new("TextLabel")
WallLight1.Name = "WallLight1"
WallLight1.Parent = Furnishingsframe
WallLight1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WallLight1.BackgroundTransparency = 0.1
WallLight1.BorderColor3 = Color3.new(0, 0, 0)
WallLight1.BorderSizePixel = 0
WallLight1.Position = UDim2.new(0, 160, 0, 110)
WallLight1.Size = UDim2.new(0, 80, 0, 15)
WallLight1.TextColor3 = Color3.new(1, 1, 1)
WallLight1.Font = Enum.Font.SourceSans
WallLight1.FontSize = Enum.FontSize.Size14
WallLight1.Text = "Wall Light"
WallLight1.TextScaled = true
WallLight1.TextSize = 14
WallLight1.TextWrapped = true

WallLight1Items = Instance.new("TextLabel")
WallLight1Items.Name = "WallLight1Items1"
WallLight1Items.Parent = Furnishingsframe
WallLight1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WallLight1Items.BackgroundTransparency = 0.1
WallLight1Items.BorderColor3 = Color3.new(0, 0, 0)
WallLight1Items.BorderSizePixel = 0
WallLight1Items.Position = UDim2.new(0, 242, 0, 110)
WallLight1Items.Size = UDim2.new(0, 20, 0, 15)
WallLight1Items.TextColor3 = Color3.new(1, 1, 1)
WallLight1Items.Font = Enum.Font.SourceSans
WallLight1Items.FontSize = Enum.FontSize.Size14
WallLight1Items.Text = "0"
WallLight1Items.TextScaled = true
WallLight1Items.TextSize = 14
WallLight1Items.TextWrapped = true

WallLight2Info = Instance.new("ImageLabel")
WallLight2Info.BackgroundTransparency = 1
WallLight2Info.Name = "WallLight2Info"
WallLight2Info.Parent = Furnishingsframe
WallLight2Info.BackgroundColor3 = Color3.new(1, 1, 1)
WallLight2Info.Position = UDim2.new(0, 300, 0, 40)
WallLight2Info.Size = UDim2.new(0, 40, 0, 60)
WallLight2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275575904"
WallLight2Info.Visible = true

WallLight2 = Instance.new("TextLabel")
WallLight2.Name = "WallLight2"
WallLight2.Parent = Furnishingsframe
WallLight2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WallLight2.BackgroundTransparency = 0.1
WallLight2.BorderColor3 = Color3.new(0, 0, 0)
WallLight2.BorderSizePixel = 0
WallLight2.Position = UDim2.new(0, 275, 0, 110)
WallLight2.Size = UDim2.new(0, 80, 0, 15)
WallLight2.TextColor3 = Color3.new(1, 1, 1)
WallLight2.Font = Enum.Font.SourceSans
WallLight2.FontSize = Enum.FontSize.Size14
WallLight2.Text = "Flood light"
WallLight2.TextScaled = true
WallLight2.TextSize = 14
WallLight2.TextWrapped = true

WallLight2Items = Instance.new("TextLabel")
WallLight2Items.Name = "WallLight2Items1"
WallLight2Items.Parent = Furnishingsframe
WallLight2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WallLight2Items.BackgroundTransparency = 0.1
WallLight2Items.BorderColor3 = Color3.new(0, 0, 0)
WallLight2Items.BorderSizePixel = 0
WallLight2Items.Position = UDim2.new(0, 357, 0, 110)
WallLight2Items.Size = UDim2.new(0, 20, 0, 15)
WallLight2Items.TextColor3 = Color3.new(1, 1, 1)
WallLight2Items.Font = Enum.Font.SourceSans
WallLight2Items.FontSize = Enum.FontSize.Size14
WallLight2Items.Text = "0"
WallLight2Items.TextScaled = true
WallLight2Items.TextSize = 14
WallLight2Items.TextWrapped = true

Seat_CouchInfo = Instance.new("ImageLabel")
Seat_CouchInfo.BackgroundTransparency = 1
Seat_CouchInfo.Name = "Seat_CouchInfo"
Seat_CouchInfo.Parent = Furnishingsframe
Seat_CouchInfo.BackgroundColor3 = Color3.new(1, 1, 1)
Seat_CouchInfo.Position = UDim2.new(0, 410, 0, 40)
Seat_CouchInfo.Size = UDim2.new(0, 40, 0, 60)
Seat_CouchInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275701343"
Seat_CouchInfo.Visible = true

Seat_Couch = Instance.new("TextLabel")
Seat_Couch.Name = "Seat_Couch"
Seat_Couch.Parent = Furnishingsframe
Seat_Couch.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_Couch.BackgroundTransparency = 0.1
Seat_Couch.BorderColor3 = Color3.new(0, 0, 0)
Seat_Couch.BorderSizePixel = 0
Seat_Couch.Position = UDim2.new(0, 390, 0, 110)
Seat_Couch.Size = UDim2.new(0, 80, 0, 15)
Seat_Couch.TextColor3 = Color3.new(1, 1, 1)
Seat_Couch.Font = Enum.Font.SourceSans
Seat_Couch.FontSize = Enum.FontSize.Size14
Seat_Couch.Text = "Seat Couch"
Seat_Couch.TextScaled = true
Seat_Couch.TextSize = 14
Seat_Couch.TextWrapped = true

Seat_CouchItems = Instance.new("TextLabel")
Seat_CouchItems.Name = "Seat_CouchItems1"
Seat_CouchItems.Parent = Furnishingsframe
Seat_CouchItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_CouchItems.BackgroundTransparency = 0.1
Seat_CouchItems.BorderColor3 = Color3.new(0, 0, 0)
Seat_CouchItems.BorderSizePixel = 0
Seat_CouchItems.Position = UDim2.new(0, 472, 0, 110)
Seat_CouchItems.Size = UDim2.new(0, 20, 0, 15)
Seat_CouchItems.TextColor3 = Color3.new(1, 1, 1)
Seat_CouchItems.Font = Enum.Font.SourceSans
Seat_CouchItems.FontSize = Enum.FontSize.Size14
Seat_CouchItems.Text = "0"
Seat_CouchItems.TextScaled = true
Seat_CouchItems.TextSize = 14
Seat_CouchItems.TextWrapped = true

Seat_LoveseatInfo = Instance.new("ImageLabel")
Seat_LoveseatInfo.BackgroundTransparency = 1
Seat_LoveseatInfo.Name = "Seat_LoveseatInfo"
Seat_LoveseatInfo.Parent = Furnishingsframe
Seat_LoveseatInfo.BackgroundColor3 = Color3.new(1, 1, 1)
Seat_LoveseatInfo.Position = UDim2.new(0, 75, 0, 140)
Seat_LoveseatInfo.Size = UDim2.new(0, 40, 0, 60)
Seat_LoveseatInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275701014"
Seat_LoveseatInfo.Visible = true

Seat_Loveseat = Instance.new("TextLabel")
Seat_Loveseat.Name = "Seat_Loveseat"
Seat_Loveseat.Parent = Furnishingsframe
Seat_Loveseat.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_Loveseat.BackgroundTransparency = 0.1
Seat_Loveseat.BorderColor3 = Color3.new(0, 0, 0)
Seat_Loveseat.BorderSizePixel = 0
Seat_Loveseat.Position = UDim2.new(0, 45, 0, 210)
Seat_Loveseat.Size = UDim2.new(0, 80, 0, 15)
Seat_Loveseat.TextColor3 = Color3.new(1, 1, 1)
Seat_Loveseat.Font = Enum.Font.SourceSans
Seat_Loveseat.FontSize = Enum.FontSize.Size14
Seat_Loveseat.Text = "Seat Loveseat"
Seat_Loveseat.TextScaled = true
Seat_Loveseat.TextSize = 14
Seat_Loveseat.TextWrapped = true

Seat_LoveseatItems = Instance.new("TextLabel")
Seat_LoveseatItems.Name = "Seat_LoveseatItems1"
Seat_LoveseatItems.Parent = Furnishingsframe
Seat_LoveseatItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_LoveseatItems.BackgroundTransparency = 0.1
Seat_LoveseatItems.BorderColor3 = Color3.new(0, 0, 0)
Seat_LoveseatItems.BorderSizePixel = 0
Seat_LoveseatItems.Position = UDim2.new(0, 127, 0, 210)
Seat_LoveseatItems.Size = UDim2.new(0, 20, 0, 15)
Seat_LoveseatItems.TextColor3 = Color3.new(1, 1, 1)
Seat_LoveseatItems.Font = Enum.Font.SourceSans
Seat_LoveseatItems.FontSize = Enum.FontSize.Size14
Seat_LoveseatItems.Text = "0"
Seat_LoveseatItems.TextScaled = true
Seat_LoveseatItems.TextSize = 14
Seat_LoveseatItems.TextWrapped = true

Seat_ArmchairInfo = Instance.new("ImageLabel")
Seat_ArmchairInfo.BackgroundTransparency = 1
Seat_ArmchairInfo.Name = "Seat_ArmchairInfo"
Seat_ArmchairInfo.Parent = Furnishingsframe
Seat_ArmchairInfo.BackgroundColor3 = Color3.new(1, 1, 1)
Seat_ArmchairInfo.Position = UDim2.new(0, 190, 0, 140)
Seat_ArmchairInfo.Size = UDim2.new(0, 40, 0, 60)
Seat_ArmchairInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275700249"
Seat_ArmchairInfo.Visible = true

Seat_Armchair = Instance.new("TextLabel")
Seat_Armchair.Name = "Seat_Armchair"
Seat_Armchair.Parent = Furnishingsframe
Seat_Armchair.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_Armchair.BackgroundTransparency = 0.1
Seat_Armchair.BorderColor3 = Color3.new(0, 0, 0)
Seat_Armchair.BorderSizePixel = 0
Seat_Armchair.Position = UDim2.new(0, 160, 0, 210)
Seat_Armchair.Size = UDim2.new(0, 80, 0, 15)
Seat_Armchair.TextColor3 = Color3.new(1, 1, 1)
Seat_Armchair.Font = Enum.Font.SourceSans
Seat_Armchair.FontSize = Enum.FontSize.Size14
Seat_Armchair.Text = "Seat Armchair"
Seat_Armchair.TextScaled = true
Seat_Armchair.TextSize = 14
Seat_Armchair.TextWrapped = true

Seat_ArmchairItems = Instance.new("TextLabel")
Seat_ArmchairItems.Name = "Seat_ArmchairItems1"
Seat_ArmchairItems.Parent = Furnishingsframe
Seat_ArmchairItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Seat_ArmchairItems.BackgroundTransparency = 0.1
Seat_ArmchairItems.BorderColor3 = Color3.new(0, 0, 0)
Seat_ArmchairItems.BorderSizePixel = 0
Seat_ArmchairItems.Position = UDim2.new(0, 242, 0, 210)
Seat_ArmchairItems.Size = UDim2.new(0, 20, 0, 15)
Seat_ArmchairItems.TextColor3 = Color3.new(1, 1, 1)
Seat_ArmchairItems.Font = Enum.Font.SourceSans
Seat_ArmchairItems.FontSize = Enum.FontSize.Size14
Seat_ArmchairItems.Text = "0"
Seat_ArmchairItems.TextScaled = true
Seat_ArmchairItems.TextSize = 14
Seat_ArmchairItems.TextWrapped = true

RefridgeratorInfo = Instance.new("ImageLabel")
RefridgeratorInfo.BackgroundTransparency = 1
RefridgeratorInfo.Name = "RefridgeratorInfo"
RefridgeratorInfo.Parent = Furnishingsframe
RefridgeratorInfo.BackgroundColor3 = Color3.new(1, 1, 1)
RefridgeratorInfo.Position = UDim2.new(0, 300, 0, 140)
RefridgeratorInfo.Size = UDim2.new(0, 40, 0, 60)
RefridgeratorInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275702969"
RefridgeratorInfo.Visible = true

Refridgerator = Instance.new("TextLabel")
Refridgerator.Name = "Refridgerator"
Refridgerator.Parent = Furnishingsframe
Refridgerator.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Refridgerator.BackgroundTransparency = 0.1
Refridgerator.BorderColor3 = Color3.new(0, 0, 0)
Refridgerator.BorderSizePixel = 0
Refridgerator.Position = UDim2.new(0, 275, 0, 210)
Refridgerator.Size = UDim2.new(0, 80, 0, 15)
Refridgerator.TextColor3 = Color3.new(1, 1, 1)
Refridgerator.Font = Enum.Font.SourceSans
Refridgerator.FontSize = Enum.FontSize.Size14
Refridgerator.Text = "Refridgerator"
Refridgerator.TextScaled = true
Refridgerator.TextSize = 14
Refridgerator.TextWrapped = true

RefridgeratorItems = Instance.new("TextLabel")
RefridgeratorItems.Name = "RefridgeratorItems1"
RefridgeratorItems.Parent = Furnishingsframe
RefridgeratorItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RefridgeratorItems.BackgroundTransparency = 0.1
RefridgeratorItems.BorderColor3 = Color3.new(0, 0, 0)
RefridgeratorItems.BorderSizePixel = 0
RefridgeratorItems.Position = UDim2.new(0, 357, 0, 210)
RefridgeratorItems.Size = UDim2.new(0, 20, 0, 15)
RefridgeratorItems.TextColor3 = Color3.new(1, 1, 1)
RefridgeratorItems.Font = Enum.Font.SourceSans
RefridgeratorItems.FontSize = Enum.FontSize.Size14
RefridgeratorItems.Text = "0"
RefridgeratorItems.TextScaled = true
RefridgeratorItems.TextSize = 14
RefridgeratorItems.TextWrapped = true

StoveInfo = Instance.new("ImageLabel")
StoveInfo.BackgroundTransparency = 1
StoveInfo.Name = "StoveInfo"
StoveInfo.Parent = Furnishingsframe
StoveInfo.BackgroundColor3 = Color3.new(1, 1, 1)
StoveInfo.Position = UDim2.new(0, 410, 0, 140)
StoveInfo.Size = UDim2.new(0, 40, 0, 60)
StoveInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275703367"
StoveInfo.Visible = true

Stove = Instance.new("TextLabel")
Stove.Name = "Stove"
Stove.Parent = Furnishingsframe
Stove.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Stove.BackgroundTransparency = 0.1
Stove.BorderColor3 = Color3.new(0, 0, 0)
Stove.BorderSizePixel = 0
Stove.Position = UDim2.new(0, 390, 0, 210)
Stove.Size = UDim2.new(0, 80, 0, 15)
Stove.TextColor3 = Color3.new(1, 1, 1)
Stove.Font = Enum.Font.SourceSans
Stove.FontSize = Enum.FontSize.Size14
Stove.Text = "Stove"
Stove.TextScaled = true
Stove.TextSize = 14
Stove.TextWrapped = true

StoveItems = Instance.new("TextLabel")
StoveItems.Name = "StoveItems1"
StoveItems.Parent = Furnishingsframe
StoveItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StoveItems.BackgroundTransparency = 0.1
StoveItems.BorderColor3 = Color3.new(0, 0, 0)
StoveItems.BorderSizePixel = 0
StoveItems.Position = UDim2.new(0, 472, 0, 210)
StoveItems.Size = UDim2.new(0, 20, 0, 15)
StoveItems.TextColor3 = Color3.new(1, 1, 1)
StoveItems.Font = Enum.Font.SourceSans
StoveItems.FontSize = Enum.FontSize.Size14
StoveItems.Text = "0"
StoveItems.TextScaled = true
StoveItems.TextSize = 14
StoveItems.TextWrapped = true

DishwasherInfo = Instance.new("ImageLabel")
DishwasherInfo.BackgroundTransparency = 1
DishwasherInfo.Name = "DishwasherInfo"
DishwasherInfo.Parent = Furnishingsframe
DishwasherInfo.BackgroundColor3 = Color3.new(1, 1, 1)
DishwasherInfo.Position = UDim2.new(0, 75, 0, 240)
DishwasherInfo.Size = UDim2.new(0, 40, 0, 60)
DishwasherInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275703762"
DishwasherInfo.Visible = true

Dishwasher = Instance.new("TextLabel")
Dishwasher.Name = "Dishwasher"
Dishwasher.Parent = Furnishingsframe
Dishwasher.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Dishwasher.BackgroundTransparency = 0.1
Dishwasher.BorderColor3 = Color3.new(0, 0, 0)
Dishwasher.BorderSizePixel = 0
Dishwasher.Position = UDim2.new(0, 45, 0, 310)
Dishwasher.Size = UDim2.new(0, 80, 0, 15)
Dishwasher.TextColor3 = Color3.new(1, 1, 1)
Dishwasher.Font = Enum.Font.SourceSans
Dishwasher.FontSize = Enum.FontSize.Size14
Dishwasher.Text = "Dishwasher"
Dishwasher.TextScaled = true
Dishwasher.TextSize = 14
Dishwasher.TextWrapped = true

DishwasherItems = Instance.new("TextLabel")
DishwasherItems.Name = "DishwasherItems1"
DishwasherItems.Parent = Furnishingsframe
DishwasherItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
DishwasherItems.BackgroundTransparency = 0.1
DishwasherItems.BorderColor3 = Color3.new(0, 0, 0)
DishwasherItems.BorderSizePixel = 0
DishwasherItems.Position = UDim2.new(0, 127, 0, 310)
DishwasherItems.Size = UDim2.new(0, 20, 0, 15)
DishwasherItems.TextColor3 = Color3.new(1, 1, 1)
DishwasherItems.Font = Enum.Font.SourceSans
DishwasherItems.FontSize = Enum.FontSize.Size14
DishwasherItems.Text = "0"
DishwasherItems.TextScaled = true
DishwasherItems.TextSize = 14
DishwasherItems.TextWrapped = true

ToiletInfo = Instance.new("ImageLabel")
ToiletInfo.BackgroundTransparency = 1
ToiletInfo.Name = "ToiletInfo"
ToiletInfo.Parent = Furnishingsframe
ToiletInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ToiletInfo.Position = UDim2.new(0, 190, 0, 240)
ToiletInfo.Size = UDim2.new(0, 40, 0, 60)
ToiletInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275705370"
ToiletInfo.Visible = true

Toilet = Instance.new("TextLabel")
Toilet.Name = "Toilet"
Toilet.Parent = Furnishingsframe
Toilet.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Toilet.BackgroundTransparency = 0.1
Toilet.BorderColor3 = Color3.new(0, 0, 0)
Toilet.BorderSizePixel = 0
Toilet.Position = UDim2.new(0, 160, 0, 310)
Toilet.Size = UDim2.new(0, 80, 0, 15)
Toilet.TextColor3 = Color3.new(1, 1, 1)
Toilet.Font = Enum.Font.SourceSans
Toilet.FontSize = Enum.FontSize.Size14
Toilet.Text = "Toilet"
Toilet.TextScaled = true
Toilet.TextSize = 14
Toilet.TextWrapped = true

ToiletItems = Instance.new("TextLabel")
ToiletItems.Name = "ToiletItems1"
ToiletItems.Parent = Furnishingsframe
ToiletItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ToiletItems.BackgroundTransparency = 0.1
ToiletItems.BorderColor3 = Color3.new(0, 0, 0)
ToiletItems.BorderSizePixel = 0
ToiletItems.Position = UDim2.new(0, 242, 0, 310)
ToiletItems.Size = UDim2.new(0, 20, 0, 15)
ToiletItems.TextColor3 = Color3.new(1, 1, 1)
ToiletItems.Font = Enum.Font.SourceSans
ToiletItems.FontSize = Enum.FontSize.Size14
ToiletItems.Text = "0"
ToiletItems.TextScaled = true
ToiletItems.TextSize = 14
ToiletItems.TextWrapped = true

Bed1Info = Instance.new("ImageLabel")
Bed1Info.BackgroundTransparency = 1
Bed1Info.Name = "Bed1Info"
Bed1Info.Parent = Furnishingsframe
Bed1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bed1Info.Position = UDim2.new(0, 300, 0, 240)
Bed1Info.Size = UDim2.new(0, 40, 0, 60)
Bed1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=280056327"
Bed1Info.Visible = true

Bed1 = Instance.new("TextLabel")
Bed1.Name = "Bed1"
Bed1.Parent = Furnishingsframe
Bed1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bed1.BackgroundTransparency = 0.1
Bed1.BorderColor3 = Color3.new(0, 0, 0)
Bed1.BorderSizePixel = 0
Bed1.Position = UDim2.new(0, 275, 0, 310)
Bed1.Size = UDim2.new(0, 80, 0, 15)
Bed1.TextColor3 = Color3.new(1, 1, 1)
Bed1.Font = Enum.Font.SourceSans
Bed1.FontSize = Enum.FontSize.Size14
Bed1.Text = "Bed"
Bed1.TextScaled = true
Bed1.TextSize = 14
Bed1.TextWrapped = true

Bed1Items = Instance.new("TextLabel")
Bed1Items.Name = "Bed1Items1"
Bed1Items.Parent = Furnishingsframe
Bed1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bed1Items.BackgroundTransparency = 0.1
Bed1Items.BorderColor3 = Color3.new(0, 0, 0)
Bed1Items.BorderSizePixel = 0
Bed1Items.Position = UDim2.new(0, 357, 0, 310)
Bed1Items.Size = UDim2.new(0, 20, 0, 15)
Bed1Items.TextColor3 = Color3.new(1, 1, 1)
Bed1Items.Font = Enum.Font.SourceSans
Bed1Items.FontSize = Enum.FontSize.Size14
Bed1Items.Text = "0"
Bed1Items.TextScaled = true
Bed1Items.TextSize = 14
Bed1Items.TextWrapped = true

Bed2Info = Instance.new("ImageLabel")
Bed2Info.BackgroundTransparency = 1
Bed2Info.Name = "Bed2Info"
Bed2Info.Parent = Furnishingsframe
Bed2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bed2Info.Position = UDim2.new(0, 410, 0, 240)
Bed2Info.Size = UDim2.new(0, 40, 0, 60)
Bed2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=280058003"
Bed2Info.Visible = true

Bed2 = Instance.new("TextLabel")
Bed2.Name = "Bed2"
Bed2.Parent = Furnishingsframe
Bed2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bed2.BackgroundTransparency = 0.1
Bed2.BorderColor3 = Color3.new(0, 0, 0)
Bed2.BorderSizePixel = 0
Bed2.Position = UDim2.new(0, 390, 0, 310)
Bed2.Size = UDim2.new(0, 80, 0, 15)
Bed2.TextColor3 = Color3.new(1, 1, 1)
Bed2.Font = Enum.Font.SourceSans
Bed2.FontSize = Enum.FontSize.Size14
Bed2.Text = "Big Bed"
Bed2.TextScaled = true
Bed2.TextSize = 14
Bed2.TextWrapped = true

Bed2Items = Instance.new("TextLabel")
Bed2Items.Name = "Bed2Items1"
Bed2Items.Parent = Furnishingsframe
Bed2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bed2Items.BackgroundTransparency = 0.1
Bed2Items.BorderColor3 = Color3.new(0, 0, 0)
Bed2Items.BorderSizePixel = 0
Bed2Items.Position = UDim2.new(0, 472, 0, 310)
Bed2Items.Size = UDim2.new(0, 20, 0, 15)
Bed2Items.TextColor3 = Color3.new(1, 1, 1)
Bed2Items.Font = Enum.Font.SourceSans
Bed2Items.FontSize = Enum.FontSize.Size14
Bed2Items.Text = "0"
Bed2Items.TextScaled = true
Bed2Items.TextSize = 14
Bed2Items.TextWrapped = true

Lamp1Info = Instance.new("ImageLabel")
Lamp1Info.BackgroundTransparency = 1
Lamp1Info.Name = "Lamp1Info"
Lamp1Info.Parent = Furnishingsframe
Lamp1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Lamp1Info.Position = UDim2.new(0, 75, 0, 340)
Lamp1Info.Size = UDim2.new(0, 40, 0, 60)
Lamp1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=284734811"
Lamp1Info.Visible = true

Lamp1 = Instance.new("TextLabel")
Lamp1.Name = "Lamp1"
Lamp1.Parent = Furnishingsframe
Lamp1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Lamp1.BackgroundTransparency = 0.1
Lamp1.BorderColor3 = Color3.new(0, 0, 0)
Lamp1.BorderSizePixel = 0
Lamp1.Position = UDim2.new(0, 45, 0, 410)
Lamp1.Size = UDim2.new(0, 80, 0, 15)
Lamp1.TextColor3 = Color3.new(1, 1, 1)
Lamp1.Font = Enum.Font.SourceSans
Lamp1.FontSize = Enum.FontSize.Size14
Lamp1.Text = "Lamp"
Lamp1.TextScaled = true
Lamp1.TextSize = 14
Lamp1.TextWrapped = true

Lamp1Items = Instance.new("TextLabel")
Lamp1Items.Name = "Lamp1Items1"
Lamp1Items.Parent = Furnishingsframe
Lamp1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Lamp1Items.BackgroundTransparency = 0.1
Lamp1Items.BorderColor3 = Color3.new(0, 0, 0)
Lamp1Items.BorderSizePixel = 0
Lamp1Items.Position = UDim2.new(0, 127, 0, 410)
Lamp1Items.Size = UDim2.new(0, 20, 0, 15)
Lamp1Items.TextColor3 = Color3.new(1, 1, 1)
Lamp1Items.Font = Enum.Font.SourceSans
Lamp1Items.FontSize = Enum.FontSize.Size14
Lamp1Items.Text = "0"
Lamp1Items.TextScaled = true
Lamp1Items.TextSize = 14
Lamp1Items.TextWrapped = true

ToiletGoldInfo = Instance.new("ImageLabel")
ToiletGoldInfo.BackgroundTransparency = 1
ToiletGoldInfo.Name = "ToiletGoldInfo"
ToiletGoldInfo.Parent = Furnishingsframe
ToiletGoldInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ToiletGoldInfo.Position = UDim2.new(0, 190, 0, 340)
ToiletGoldInfo.Size = UDim2.new(0, 40, 0, 60)
ToiletGoldInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1123315696"
ToiletGoldInfo.Visible = true

ToiletGold = Instance.new("TextLabel")
ToiletGold.Name = "ToiletGold"
ToiletGold.Parent = Furnishingsframe
ToiletGold.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ToiletGold.BackgroundTransparency = 0.1
ToiletGold.BorderColor3 = Color3.new(0, 0, 0)
ToiletGold.BorderSizePixel = 0
ToiletGold.Position = UDim2.new(0, 160, 0, 410)
ToiletGold.Size = UDim2.new(0, 80, 0, 15)
ToiletGold.TextColor3 = Color3.new(1, 1, 1)
ToiletGold.Font = Enum.Font.SourceSans
ToiletGold.FontSize = Enum.FontSize.Size14
ToiletGold.Text = "Toilet Gold"
ToiletGold.TextScaled = true
ToiletGold.TextSize = 14
ToiletGold.TextWrapped = true

ToiletGoldItems = Instance.new("TextLabel")
ToiletGoldItems.Name = "ToiletGoldItems1"
ToiletGoldItems.Parent = Furnishingsframe
ToiletGoldItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ToiletGoldItems.BackgroundTransparency = 0.1
ToiletGoldItems.BorderColor3 = Color3.new(0, 0, 0)
ToiletGoldItems.BorderSizePixel = 0
ToiletGoldItems.Position = UDim2.new(0, 242, 0, 410)
ToiletGoldItems.Size = UDim2.new(0, 20, 0, 15)
ToiletGoldItems.TextColor3 = Color3.new(1, 1, 1)
ToiletGoldItems.Font = Enum.Font.SourceSans
ToiletGoldItems.FontSize = Enum.FontSize.Size14
ToiletGoldItems.Text = "0"
ToiletGoldItems.TextScaled = true
ToiletGoldItems.TextSize = 14
ToiletGoldItems.TextWrapped = true

GlassPane1Info = Instance.new("ImageLabel")
GlassPane1Info.BackgroundTransparency = 0
GlassPane1Info.Name = "GlassPane1Info"
GlassPane1Info.Parent = Glassframe
GlassPane1Info.BackgroundColor3 = Color3.new(1, 1, 1)
GlassPane1Info.Position = UDim2.new(0, 75, 0, 40)
GlassPane1Info.Size = UDim2.new(0, 40, 0, 60)
GlassPane1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=284720757"
GlassPane1Info.Visible = true

GlassPane1 = Instance.new("TextLabel")
GlassPane1.Name = "GlassPane1"
GlassPane1.Parent = Glassframe
GlassPane1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane1.BackgroundTransparency = 0.1
GlassPane1.BorderColor3 = Color3.new(0, 0, 0)
GlassPane1.BorderSizePixel = 0
GlassPane1.Position = UDim2.new(0, 45, 0, 110)
GlassPane1.Size = UDim2.new(0, 80, 0, 15)
GlassPane1.TextColor3 = Color3.new(1, 1, 1)
GlassPane1.Font = Enum.Font.SourceSans
GlassPane1.FontSize = Enum.FontSize.Size14
GlassPane1.Text = "Tiny Glass Pane"
GlassPane1.TextScaled = true
GlassPane1.TextSize = 14
GlassPane1.TextWrapped = true

GlassPane1Items = Instance.new("TextLabel")
GlassPane1Items.Name = "GlassPane1Items1"
GlassPane1Items.Parent = Glassframe
GlassPane1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane1Items.BackgroundTransparency = 0.1
GlassPane1Items.BorderColor3 = Color3.new(0, 0, 0)
GlassPane1Items.BorderSizePixel = 0
GlassPane1Items.Position = UDim2.new(0, 127, 0, 110)
GlassPane1Items.Size = UDim2.new(0, 20, 0, 15)
GlassPane1Items.TextColor3 = Color3.new(1, 1, 1)
GlassPane1Items.Font = Enum.Font.SourceSans
GlassPane1Items.FontSize = Enum.FontSize.Size14
GlassPane1Items.Text = "0"
GlassPane1Items.TextScaled = true
GlassPane1Items.TextSize = 14
GlassPane1Items.TextWrapped = true

GlassPane2Info = Instance.new("ImageLabel")
GlassPane2Info.BackgroundTransparency = 0
GlassPane2Info.Name = "GlassPane2Info"
GlassPane2Info.Parent = Glassframe
GlassPane2Info.BackgroundColor3 = Color3.new(1, 1, 1)
GlassPane2Info.Position = UDim2.new(0, 190, 0, 40)
GlassPane2Info.Size = UDim2.new(0, 40, 0, 60)
GlassPane2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=284721497"
GlassPane2Info.Visible = true

GlassPane2 = Instance.new("TextLabel")
GlassPane2.Name = "GlassPane2"
GlassPane2.Parent = Glassframe
GlassPane2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane2.BackgroundTransparency = 0.1
GlassPane2.BorderColor3 = Color3.new(0, 0, 0)
GlassPane2.BorderSizePixel = 0
GlassPane2.Position = UDim2.new(0, 160, 0, 110)
GlassPane2.Size = UDim2.new(0, 80, 0, 15)
GlassPane2.TextColor3 = Color3.new(1, 1, 1)
GlassPane2.Font = Enum.Font.SourceSans
GlassPane2.FontSize = Enum.FontSize.Size14
GlassPane2.Text = "Small Glass Pane"
GlassPane2.TextScaled = true
GlassPane2.TextSize = 14
GlassPane2.TextWrapped = true

GlassPane2Items = Instance.new("TextLabel")
GlassPane2Items.Name = "GlassPane2Items1"
GlassPane2Items.Parent = Glassframe
GlassPane2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane2Items.BackgroundTransparency = 0.1
GlassPane2Items.BorderColor3 = Color3.new(0, 0, 0)
GlassPane2Items.BorderSizePixel = 0
GlassPane2Items.Position = UDim2.new(0, 242, 0, 110)
GlassPane2Items.Size = UDim2.new(0, 20, 0, 15)
GlassPane2Items.TextColor3 = Color3.new(1, 1, 1)
GlassPane2Items.Font = Enum.Font.SourceSans
GlassPane2Items.FontSize = Enum.FontSize.Size14
GlassPane2Items.Text = "0"
GlassPane2Items.TextScaled = true
GlassPane2Items.TextSize = 14
GlassPane2Items.TextWrapped = true

GlassPane3Info = Instance.new("ImageLabel")
GlassPane3Info.BackgroundTransparency = 0
GlassPane3Info.Name = "GlassPane3Info"
GlassPane3Info.Parent = Glassframe
GlassPane3Info.BackgroundColor3 = Color3.new(1, 1, 1)
GlassPane3Info.Position = UDim2.new(0, 300, 0, 40)
GlassPane3Info.Size = UDim2.new(0, 40, 0, 60)
GlassPane3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=284722684"
GlassPane3Info.Visible = true

GlassPane3 = Instance.new("TextLabel")
GlassPane3.Name = "GlassPane3"
GlassPane3.Parent = Glassframe
GlassPane3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane3.BackgroundTransparency = 0.1
GlassPane3.BorderColor3 = Color3.new(0, 0, 0)
GlassPane3.BorderSizePixel = 0
GlassPane3.Position = UDim2.new(0, 275, 0, 110)
GlassPane3.Size = UDim2.new(0, 80, 0, 15)
GlassPane3.TextColor3 = Color3.new(1, 1, 1)
GlassPane3.Font = Enum.Font.SourceSans
GlassPane3.FontSize = Enum.FontSize.Size14
GlassPane3.Text = "Glass Pane"
GlassPane3.TextScaled = true
GlassPane3.TextSize = 14
GlassPane3.TextWrapped = true

GlassPane3Items = Instance.new("TextLabel")
GlassPane3Items.Name = "GlassPane3Items1"
GlassPane3Items.Parent = Glassframe
GlassPane3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane3Items.BackgroundTransparency = 0.1
GlassPane3Items.BorderColor3 = Color3.new(0, 0, 0)
GlassPane3Items.BorderSizePixel = 0
GlassPane3Items.Position = UDim2.new(0, 357, 0, 110)
GlassPane3Items.Size = UDim2.new(0, 20, 0, 15)
GlassPane3Items.TextColor3 = Color3.new(1, 1, 1)
GlassPane3Items.Font = Enum.Font.SourceSans
GlassPane3Items.FontSize = Enum.FontSize.Size14
GlassPane3Items.Text = "0"
GlassPane3Items.TextScaled = true
GlassPane3Items.TextSize = 14
GlassPane3Items.TextWrapped = true

GlassPane4Info = Instance.new("ImageLabel")
GlassPane4Info.BackgroundTransparency = 0
GlassPane4Info.Name = "GlassPane4Info"
GlassPane4Info.Parent = Glassframe
GlassPane4Info.BackgroundColor3 = Color3.new(1, 1, 1)
GlassPane4Info.Position = UDim2.new(0, 410, 0, 40)
GlassPane4Info.Size = UDim2.new(0, 40, 0, 60)
GlassPane4Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=284722684"
GlassPane4Info.Visible = true

GlassPane4 = Instance.new("TextLabel")
GlassPane4.Name = "GlassPane4"
GlassPane4.Parent = Glassframe
GlassPane4.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane4.BackgroundTransparency = 0.1
GlassPane4.BorderColor3 = Color3.new(0, 0, 0)
GlassPane4.BorderSizePixel = 0
GlassPane4.Position = UDim2.new(0, 390, 0, 110)
GlassPane4.Size = UDim2.new(0, 80, 0, 15)
GlassPane4.TextColor3 = Color3.new(1, 1, 1)
GlassPane4.Font = Enum.Font.SourceSans
GlassPane4.FontSize = Enum.FontSize.Size14
GlassPane4.Text = "Large Glass Pane"
GlassPane4.TextScaled = true
GlassPane4.TextSize = 14
GlassPane4.TextWrapped = true

GlassPane4Items = Instance.new("TextLabel")
GlassPane4Items.Name = "GlassPane4Items1"
GlassPane4Items.Parent = Glassframe
GlassPane4Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassPane4Items.BackgroundTransparency = 0.1
GlassPane4Items.BorderColor3 = Color3.new(0, 0, 0)
GlassPane4Items.BorderSizePixel = 0
GlassPane4Items.Position = UDim2.new(0, 472, 0, 110)
GlassPane4Items.Size = UDim2.new(0, 20, 0, 15)
GlassPane4Items.TextColor3 = Color3.new(1, 1, 1)
GlassPane4Items.Font = Enum.Font.SourceSans
GlassPane4Items.FontSize = Enum.FontSize.Size14
GlassPane4Items.Text = "0"
GlassPane4Items.TextScaled = true
GlassPane4Items.TextSize = 14
GlassPane4Items.TextWrapped = true

GlassDoor1Info = Instance.new("ImageLabel")
GlassDoor1Info.BackgroundTransparency = 0
GlassDoor1Info.Name = "GlassDoor1Info"
GlassDoor1Info.Parent = Glassframe
GlassDoor1Info.BackgroundColor3 = Color3.new(1, 1, 1)
GlassDoor1Info.Position = UDim2.new(0, 75, 0, 140)
GlassDoor1Info.Size = UDim2.new(0, 40, 0, 60)
GlassDoor1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=306266873"
GlassDoor1Info.Visible = true

GlassDoor1 = Instance.new("TextLabel")
GlassDoor1.Name = "GlassDoor1"
GlassDoor1.Parent = Glassframe
GlassDoor1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassDoor1.BackgroundTransparency = 0.1
GlassDoor1.BorderColor3 = Color3.new(0, 0, 0)
GlassDoor1.BorderSizePixel = 0
GlassDoor1.Position = UDim2.new(0, 45, 0, 210)
GlassDoor1.Size = UDim2.new(0, 80, 0, 15)
GlassDoor1.TextColor3 = Color3.new(1, 1, 1)
GlassDoor1.Font = Enum.Font.SourceSans
GlassDoor1.FontSize = Enum.FontSize.Size14
GlassDoor1.Text = "Basic Glass Door"
GlassDoor1.TextScaled = true
GlassDoor1.TextSize = 14
GlassDoor1.TextWrapped = true

GlassDoor1Items = Instance.new("TextLabel")
GlassDoor1Items.Name = "GlassDoor1Items1"
GlassDoor1Items.Parent = Glassframe
GlassDoor1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GlassDoor1Items.BackgroundTransparency = 0.1
GlassDoor1Items.BorderColor3 = Color3.new(0, 0, 0)
GlassDoor1Items.BorderSizePixel = 0
GlassDoor1Items.Position = UDim2.new(0, 127, 0, 210)
GlassDoor1Items.Size = UDim2.new(0, 20, 0, 15)
GlassDoor1Items.TextColor3 = Color3.new(1, 1, 1)
GlassDoor1Items.Font = Enum.Font.SourceSans
GlassDoor1Items.FontSize = Enum.FontSize.Size14
GlassDoor1Items.Text = "0"
GlassDoor1Items.TextScaled = true
GlassDoor1Items.TextSize = 14
GlassDoor1Items.TextWrapped = true

SawmillInfo = Instance.new("ImageLabel")
SawmillInfo.BackgroundTransparency = 1
SawmillInfo.Name = "SawmillInfo"
SawmillInfo.Parent = conandsawframe
SawmillInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SawmillInfo.Position = UDim2.new(0, 75, 0, 40)
SawmillInfo.Size = UDim2.new(0, 40, 0, 60)
SawmillInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273198749"
SawmillInfo.Visible = true

Sawmill = Instance.new("TextLabel")
Sawmill.Name = "Sawmill"
Sawmill.Parent = conandsawframe
Sawmill.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill.BackgroundTransparency = 0.1
Sawmill.BorderColor3 = Color3.new(0, 0, 0)
Sawmill.BorderSizePixel = 0
Sawmill.Position = UDim2.new(0, 45, 0, 110)
Sawmill.Size = UDim2.new(0, 80, 0, 15)
Sawmill.TextColor3 = Color3.new(1, 1, 1)
Sawmill.Font = Enum.Font.SourceSans
Sawmill.FontSize = Enum.FontSize.Size14
Sawmill.Text = "Shabby Sawmill"
Sawmill.TextScaled = true
Sawmill.TextSize = 14
Sawmill.TextWrapped = true

SawmillItems = Instance.new("TextLabel")
SawmillItems.Name = "SawmillItems1"
SawmillItems.Parent = conandsawframe
SawmillItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SawmillItems.BackgroundTransparency = 0.1
SawmillItems.BorderColor3 = Color3.new(0, 0, 0)
SawmillItems.BorderSizePixel = 0
SawmillItems.Position = UDim2.new(0, 127, 0, 110)
SawmillItems.Size = UDim2.new(0, 20, 0, 15)
SawmillItems.TextColor3 = Color3.new(1, 1, 1)
SawmillItems.Font = Enum.Font.SourceSans
SawmillItems.FontSize = Enum.FontSize.Size14
SawmillItems.Text = "0"
SawmillItems.TextScaled = true
SawmillItems.TextSize = 14
SawmillItems.TextWrapped = true

Sawmill1Info = Instance.new("ImageLabel")
Sawmill1Info.BackgroundTransparency = 1
Sawmill1Info.Name = "Sawmill1Info"
Sawmill1Info.Parent = conandsawframe
Sawmill1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Sawmill1Info.Position = UDim2.new(0, 190, 0, 40)
Sawmill1Info.Size = UDim2.new(0, 40, 0, 60)
Sawmill1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273198637"
Sawmill1Info.Visible = true

Sawmill1 = Instance.new("TextLabel")
Sawmill1.Name = "Sawmill1"
Sawmill1.Parent = conandsawframe
Sawmill1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill1.BackgroundTransparency = 0.1
Sawmill1.BorderColor3 = Color3.new(0, 0, 0)
Sawmill1.BorderSizePixel = 0
Sawmill1.Position = UDim2.new(0, 160, 0, 110)
Sawmill1.Size = UDim2.new(0, 80, 0, 15)
Sawmill1.TextColor3 = Color3.new(1, 1, 1)
Sawmill1.Font = Enum.Font.SourceSans
Sawmill1.FontSize = Enum.FontSize.Size14
Sawmill1.Text = "Fair Sawmill"
Sawmill1.TextScaled = true
Sawmill1.TextSize = 14
Sawmill1.TextWrapped = true

Sawmill1Items = Instance.new("TextLabel")
Sawmill1Items.Name = "Sawmill1Items"
Sawmill1Items.Parent = conandsawframe
Sawmill1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill1Items.BackgroundTransparency = 0.1
Sawmill1Items.BorderColor3 = Color3.new(0, 0, 0)
Sawmill1Items.BorderSizePixel = 0
Sawmill1Items.Position = UDim2.new(0, 242, 0, 110)
Sawmill1Items.Size = UDim2.new(0, 20, 0, 15)
Sawmill1Items.TextColor3 = Color3.new(1, 1, 1)
Sawmill1Items.Font = Enum.Font.SourceSans
Sawmill1Items.FontSize = Enum.FontSize.Size14
Sawmill1Items.Text = "0"
Sawmill1Items.TextScaled = true
Sawmill1Items.TextSize = 14
Sawmill1Items.TextWrapped = true

Sawmill3Info = Instance.new("ImageLabel")
Sawmill3Info.BackgroundTransparency = 1
Sawmill3Info.Name = "Sawmill3Info"
Sawmill3Info.Parent = conandsawframe
Sawmill3Info.BackgroundColor3 = Color3.new(1, 1, 1)
Sawmill3Info.Position = UDim2.new(0, 300, 0, 40)
Sawmill3Info.Size = UDim2.new(0, 40, 0, 60)
Sawmill3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=277496106"
Sawmill3Info.Visible = true

Sawmill3 = Instance.new("TextLabel")
Sawmill3.Name = "Sawmill3"
Sawmill3.Parent = conandsawframe
Sawmill3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill3.BackgroundTransparency = 0.1
Sawmill3.BorderColor3 = Color3.new(0, 0, 0)
Sawmill3.BorderSizePixel = 0
Sawmill3.Position = UDim2.new(0, 275, 0, 110)
Sawmill3.Size = UDim2.new(0, 80, 0, 15)
Sawmill3.TextColor3 = Color3.new(1, 1, 1)
Sawmill3.Font = Enum.Font.SourceSans
Sawmill3.FontSize = Enum.FontSize.Size14
Sawmill3.Text = "Sawmax 01"
Sawmill3.TextScaled = true
Sawmill3.TextSize = 14
Sawmill3.TextWrapped = true

Sawmill3Items = Instance.new("TextLabel")
Sawmill3Items.Name = "Sawmill3Items"
Sawmill3Items.Parent = conandsawframe
Sawmill3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill3Items.BackgroundTransparency = 0.1
Sawmill3Items.BorderColor3 = Color3.new(0, 0, 0)
Sawmill3Items.BorderSizePixel = 0
Sawmill3Items.Position = UDim2.new(0, 357, 0, 110)
Sawmill3Items.Size = UDim2.new(0, 20, 0, 15)
Sawmill3Items.TextColor3 = Color3.new(1, 1, 1)
Sawmill3Items.Font = Enum.Font.SourceSans
Sawmill3Items.FontSize = Enum.FontSize.Size14
Sawmill3Items.Text = "0"
Sawmill3Items.TextScaled = true
Sawmill3Items.TextSize = 14
Sawmill3Items.TextWrapped = true

Sawmill4Info = Instance.new("ImageLabel")
Sawmill4Info.BackgroundTransparency = 1
Sawmill4Info.Name = "Sawmill4Info"
Sawmill4Info.Parent = conandsawframe
Sawmill4Info.BackgroundColor3 = Color3.new(1, 1, 1)
Sawmill4Info.Position = UDim2.new(0, 410, 0, 40)
Sawmill4Info.Size = UDim2.new(0, 40, 0, 60)
Sawmill4Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=283724207"
Sawmill4Info.Visible = true

Sawmill4 = Instance.new("TextLabel")
Sawmill4.Name = "Sawmill4"
Sawmill4.Parent = conandsawframe
Sawmill4.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill4.BackgroundTransparency = 0.1
Sawmill4.BorderColor3 = Color3.new(0, 0, 0)
Sawmill4.BorderSizePixel = 0
Sawmill4.Position = UDim2.new(0, 390, 0, 110)
Sawmill4.Size = UDim2.new(0, 80, 0, 15)
Sawmill4.TextColor3 = Color3.new(1, 1, 1)
Sawmill4.Font = Enum.Font.SourceSans
Sawmill4.FontSize = Enum.FontSize.Size14
Sawmill4.Text = "Sawmax 02"
Sawmill4.TextScaled = true
Sawmill4.TextSize = 14
Sawmill4.TextWrapped = true

Sawmill4Items = Instance.new("TextLabel")
Sawmill4Items.Name = "Sawmill4Items"
Sawmill4Items.Parent = conandsawframe
Sawmill4Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill4Items.BackgroundTransparency = 0.1
Sawmill4Items.BorderColor3 = Color3.new(0, 0, 0)
Sawmill4Items.BorderSizePixel = 0
Sawmill4Items.Position = UDim2.new(0, 472, 0, 110)
Sawmill4Items.Size = UDim2.new(0, 20, 0, 15)
Sawmill4Items.TextColor3 = Color3.new(1, 1, 1)
Sawmill4Items.Font = Enum.Font.SourceSans
Sawmill4Items.FontSize = Enum.FontSize.Size14
Sawmill4Items.Text = "0"
Sawmill4Items.TextScaled = true
Sawmill4Items.TextSize = 14
Sawmill4Items.TextWrapped = true

Sawmill4LInfo = Instance.new("ImageLabel")
Sawmill4LInfo.BackgroundTransparency = 1
Sawmill4LInfo.Name = "Sawmill4LInfo"
Sawmill4LInfo.Parent = conandsawframe
Sawmill4LInfo.BackgroundColor3 = Color3.new(1, 1, 1)
Sawmill4LInfo.Position = UDim2.new(0, 75, 0, 140)
Sawmill4LInfo.Size = UDim2.new(0, 40, 0, 60)
Sawmill4LInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=424520317"
Sawmill4LInfo.Visible = true

Sawmill4L = Instance.new("TextLabel")
Sawmill4L.Name = "Sawmill4L"
Sawmill4L.Parent = conandsawframe
Sawmill4L.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill4L.BackgroundTransparency = 0.1
Sawmill4L.BorderColor3 = Color3.new(0, 0, 0)
Sawmill4L.BorderSizePixel = 0
Sawmill4L.Position = UDim2.new(0, 45, 0, 210)
Sawmill4L.Size = UDim2.new(0, 80, 0, 15)
Sawmill4L.TextColor3 = Color3.new(1, 1, 1)
Sawmill4L.Font = Enum.Font.SourceSans
Sawmill4L.FontSize = Enum.FontSize.Size14
Sawmill4L.Text = "Sawmax 02L"
Sawmill4L.TextScaled = true
Sawmill4L.TextSize = 14
Sawmill4L.TextWrapped = true

Sawmill4LItems = Instance.new("TextLabel")
Sawmill4LItems.Name = "Sawmill4LItems"
Sawmill4LItems.Parent = conandsawframe
Sawmill4LItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Sawmill4LItems.BackgroundTransparency = 0.1
Sawmill4LItems.BorderColor3 = Color3.new(0, 0, 0)
Sawmill4LItems.BorderSizePixel = 0
Sawmill4LItems.Position = UDim2.new(0, 127, 0, 210)
Sawmill4LItems.Size = UDim2.new(0, 20, 0, 15)
Sawmill4LItems.TextColor3 = Color3.new(1, 1, 1)
Sawmill4LItems.Font = Enum.Font.SourceSans
Sawmill4LItems.FontSize = Enum.FontSize.Size14
Sawmill4LItems.Text = "0"
Sawmill4LItems.TextScaled = true
Sawmill4LItems.TextSize = 14
Sawmill4LItems.TextWrapped = true

StraightConveyorInfo = Instance.new("ImageLabel")
StraightConveyorInfo.BackgroundTransparency = 1
StraightConveyorInfo.Name = "StraightConveyorInfo"
StraightConveyorInfo.Parent = conandsawframe
StraightConveyorInfo.BackgroundColor3 = Color3.new(1, 1, 1)
StraightConveyorInfo.Position = UDim2.new(0, 190, 0, 140)
StraightConveyorInfo.Size = UDim2.new(0, 40, 0, 60)
StraightConveyorInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273196714"
StraightConveyorInfo.Visible = true

StraightConveyor = Instance.new("TextLabel")
StraightConveyor.Name = "StraightConveyor"
StraightConveyor.Parent = conandsawframe
StraightConveyor.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightConveyor.BackgroundTransparency = 0.1
StraightConveyor.BorderColor3 = Color3.new(0, 0, 0)
StraightConveyor.BorderSizePixel = 0
StraightConveyor.Position = UDim2.new(0, 160, 0, 210)
StraightConveyor.Size = UDim2.new(0, 80, 0, 15)
StraightConveyor.TextColor3 = Color3.new(1, 1, 1)
StraightConveyor.Font = Enum.Font.SourceSans
StraightConveyor.FontSize = Enum.FontSize.Size14
StraightConveyor.Text = "Straight"
StraightConveyor.TextScaled = true
StraightConveyor.TextSize = 14
StraightConveyor.TextWrapped = true

StraightConveyorItems = Instance.new("TextLabel")
StraightConveyorItems.Name = "StraightConveyorItems"
StraightConveyorItems.Parent = conandsawframe
StraightConveyorItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightConveyorItems.BackgroundTransparency = 0.1
StraightConveyorItems.BorderColor3 = Color3.new(0, 0, 0)
StraightConveyorItems.BorderSizePixel = 0
StraightConveyorItems.Position = UDim2.new(0, 242, 0, 210)
StraightConveyorItems.Size = UDim2.new(0, 20, 0, 15)
StraightConveyorItems.TextColor3 = Color3.new(1, 1, 1)
StraightConveyorItems.Font = Enum.Font.SourceSans
StraightConveyorItems.FontSize = Enum.FontSize.Size14
StraightConveyorItems.Text = "0"
StraightConveyorItems.TextScaled = true
StraightConveyorItems.TextSize = 14
StraightConveyorItems.TextWrapped = true

TightTurnConveyorInfo = Instance.new("ImageLabel")
TightTurnConveyorInfo.BackgroundTransparency = 1
TightTurnConveyorInfo.Name = "TightTurnConveyorInfo"
TightTurnConveyorInfo.Parent = conandsawframe
TightTurnConveyorInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TightTurnConveyorInfo.Position = UDim2.new(0, 300, 0, 140)
TightTurnConveyorInfo.Size = UDim2.new(0, 40, 0, 60)
TightTurnConveyorInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273194915"
TightTurnConveyorInfo.Visible = true

TightTurnConveyor = Instance.new("TextLabel")
TightTurnConveyor.Name = "TightTurnConveyor"
TightTurnConveyor.Parent = conandsawframe
TightTurnConveyor.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TightTurnConveyor.BackgroundTransparency = 0.1
TightTurnConveyor.BorderColor3 = Color3.new(0, 0, 0)
TightTurnConveyor.BorderSizePixel = 0
TightTurnConveyor.Position = UDim2.new(0, 275, 0, 210)
TightTurnConveyor.Size = UDim2.new(0, 80, 0, 15)
TightTurnConveyor.TextColor3 = Color3.new(1, 1, 1)
TightTurnConveyor.Font = Enum.Font.SourceSans
TightTurnConveyor.FontSize = Enum.FontSize.Size14
TightTurnConveyor.Text = "Tight Turn"
TightTurnConveyor.TextScaled = true
TightTurnConveyor.TextSize = 14
TightTurnConveyor.TextWrapped = true

TightTurnConveyorItems = Instance.new("TextLabel")
TightTurnConveyorItems.Name = "TightTurnConveyorItems"
TightTurnConveyorItems.Parent = conandsawframe
TightTurnConveyorItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TightTurnConveyorItems.BackgroundTransparency = 0.1
TightTurnConveyorItems.BorderColor3 = Color3.new(0, 0, 0)
TightTurnConveyorItems.BorderSizePixel = 0
TightTurnConveyorItems.Position = UDim2.new(0, 357, 0, 210)
TightTurnConveyorItems.Size = UDim2.new(0, 20, 0, 15)
TightTurnConveyorItems.TextColor3 = Color3.new(1, 1, 1)
TightTurnConveyorItems.Font = Enum.Font.SourceSans
TightTurnConveyorItems.FontSize = Enum.FontSize.Size14
TightTurnConveyorItems.Text = "0"
TightTurnConveyorItems.TextScaled = true
TightTurnConveyorItems.TextSize = 14
TightTurnConveyorItems.TextWrapped = true

TiltConveyorInfo = Instance.new("ImageLabel")
TiltConveyorInfo.BackgroundTransparency = 1
TiltConveyorInfo.Name = "TiltConveyorInfo"
TiltConveyorInfo.Parent = conandsawframe
TiltConveyorInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TiltConveyorInfo.Position = UDim2.new(0, 410, 0, 140)
TiltConveyorInfo.Size = UDim2.new(0, 40, 0, 60)
TiltConveyorInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197254"
TiltConveyorInfo.Visible = true

TiltConveyor = Instance.new("TextLabel")
TiltConveyor.Name = "TiltConveyor"
TiltConveyor.Parent = conandsawframe
TiltConveyor.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TiltConveyor.BackgroundTransparency = 0.1
TiltConveyor.BorderColor3 = Color3.new(0, 0, 0)
TiltConveyor.BorderSizePixel = 0
TiltConveyor.Position = UDim2.new(0, 390, 0, 210)
TiltConveyor.Size = UDim2.new(0, 80, 0, 15)
TiltConveyor.TextColor3 = Color3.new(1, 1, 1)
TiltConveyor.Font = Enum.Font.SourceSans
TiltConveyor.FontSize = Enum.FontSize.Size14
TiltConveyor.Text = "Tilt"
TiltConveyor.TextScaled = true
TiltConveyor.TextSize = 14
TiltConveyor.TextWrapped = true

TiltConveyorItems = Instance.new("TextLabel")
TiltConveyorItems.Name = "TiltConveyorItems"
TiltConveyorItems.Parent = conandsawframe
TiltConveyorItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TiltConveyorItems.BackgroundTransparency = 0.1
TiltConveyorItems.BorderColor3 = Color3.new(0, 0, 0)
TiltConveyorItems.BorderSizePixel = 0
TiltConveyorItems.Position = UDim2.new(0, 472, 0, 210)
TiltConveyorItems.Size = UDim2.new(0, 20, 0, 15)
TiltConveyorItems.TextColor3 = Color3.new(1, 1, 1)
TiltConveyorItems.Font = Enum.Font.SourceSans
TiltConveyorItems.FontSize = Enum.FontSize.Size14
TiltConveyorItems.Text = "0"
TiltConveyorItems.TextScaled = true
TiltConveyorItems.TextSize = 14
TiltConveyorItems.TextWrapped = true

LogSweeperInfo = Instance.new("ImageLabel")
LogSweeperInfo.BackgroundTransparency = 1
LogSweeperInfo.Name = "LogSweeperInfo"
LogSweeperInfo.Parent = conandsawframe
LogSweeperInfo.BackgroundColor3 = Color3.new(1, 1, 1)
LogSweeperInfo.Position = UDim2.new(0, 75, 0, 240)
LogSweeperInfo.Size = UDim2.new(0, 40, 0, 60)
LogSweeperInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197604"
LogSweeperInfo.Visible = true

LogSweeper = Instance.new("TextLabel")
LogSweeper.Name = "LogSweeper"
LogSweeper.Parent = conandsawframe
LogSweeper.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LogSweeper.BackgroundTransparency = 0.1
LogSweeper.BorderColor3 = Color3.new(0, 0, 0)
LogSweeper.BorderSizePixel = 0
LogSweeper.Position = UDim2.new(0, 45, 0, 310)
LogSweeper.Size = UDim2.new(0, 80, 0, 15)
LogSweeper.TextColor3 = Color3.new(1, 1, 1)
LogSweeper.Font = Enum.Font.SourceSans
LogSweeper.FontSize = Enum.FontSize.Size14
LogSweeper.Text = "Log Sweeper"
LogSweeper.TextScaled = true
LogSweeper.TextSize = 14
LogSweeper.TextWrapped = true

LogSweeperItems = Instance.new("TextLabel")
LogSweeperItems.Name = "LogSweeperItems"
LogSweeperItems.Parent = conandsawframe
LogSweeperItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LogSweeperItems.BackgroundTransparency = 0.1
LogSweeperItems.BorderColor3 = Color3.new(0, 0, 0)
LogSweeperItems.BorderSizePixel = 0
LogSweeperItems.Position = UDim2.new(0, 127, 0, 310)
LogSweeperItems.Size = UDim2.new(0, 20, 0, 15)
LogSweeperItems.TextColor3 = Color3.new(1, 1, 1)
LogSweeperItems.Font = Enum.Font.SourceSans
LogSweeperItems.FontSize = Enum.FontSize.Size14
LogSweeperItems.Text = "0"
LogSweeperItems.TextScaled = true
LogSweeperItems.TextSize = 14
LogSweeperItems.TextWrapped = true

ConveyorFunnelInfo = Instance.new("ImageLabel")
ConveyorFunnelInfo.BackgroundTransparency = 1
ConveyorFunnelInfo.Name = "ConveyorFunnelInfo"
ConveyorFunnelInfo.Parent = conandsawframe
ConveyorFunnelInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ConveyorFunnelInfo.Position = UDim2.new(0, 190, 0, 240)
ConveyorFunnelInfo.Size = UDim2.new(0, 40, 0, 60)
ConveyorFunnelInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197604"
ConveyorFunnelInfo.Visible = true

ConveyorFunnel = Instance.new("TextLabel")
ConveyorFunnel.Name = "ConveyorFunnel"
ConveyorFunnel.Parent = conandsawframe
ConveyorFunnel.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorFunnel.BackgroundTransparency = 0.1
ConveyorFunnel.BorderColor3 = Color3.new(0, 0, 0)
ConveyorFunnel.BorderSizePixel = 0
ConveyorFunnel.Position = UDim2.new(0, 160, 0, 310)
ConveyorFunnel.Size = UDim2.new(0, 80, 0, 15)
ConveyorFunnel.TextColor3 = Color3.new(1, 1, 1)
ConveyorFunnel.Font = Enum.Font.SourceSans
ConveyorFunnel.FontSize = Enum.FontSize.Size14
ConveyorFunnel.Text = "Funnel"
ConveyorFunnel.TextScaled = true
ConveyorFunnel.TextSize = 14
ConveyorFunnel.TextWrapped = true

ConveyorFunnelItems = Instance.new("TextLabel")
ConveyorFunnelItems.Name = "ConveyorFunnelItems"
ConveyorFunnelItems.Parent = conandsawframe
ConveyorFunnelItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorFunnelItems.BackgroundTransparency = 0.1
ConveyorFunnelItems.BorderColor3 = Color3.new(0, 0, 0)
ConveyorFunnelItems.BorderSizePixel = 0
ConveyorFunnelItems.Position = UDim2.new(0, 242, 0, 310)
ConveyorFunnelItems.Size = UDim2.new(0, 20, 0, 15)
ConveyorFunnelItems.TextColor3 = Color3.new(1, 1, 1)
ConveyorFunnelItems.Font = Enum.Font.SourceSans
ConveyorFunnelItems.FontSize = Enum.FontSize.Size14
ConveyorFunnelItems.Text = "0"
ConveyorFunnelItems.TextScaled = true
ConveyorFunnelItems.TextSize = 14
ConveyorFunnelItems.TextWrapped = true

ConveyorSupportsInfo = Instance.new("ImageLabel")
ConveyorSupportsInfo.BackgroundTransparency = 1
ConveyorSupportsInfo.Name = "ConveyorSupportsInfo"
ConveyorSupportsInfo.Parent = conandsawframe
ConveyorSupportsInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ConveyorSupportsInfo.Position = UDim2.new(0, 300, 0, 240)
ConveyorSupportsInfo.Size = UDim2.new(0, 40, 0, 60)
ConveyorSupportsInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197839"
ConveyorSupportsInfo.Visible = true

ConveyorSupports = Instance.new("TextLabel")
ConveyorSupports.Name = "ConveyorSupports"
ConveyorSupports.Parent = conandsawframe
ConveyorSupports.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorSupports.BackgroundTransparency = 0.1
ConveyorSupports.BorderColor3 = Color3.new(0, 0, 0)
ConveyorSupports.BorderSizePixel = 0
ConveyorSupports.Position = UDim2.new(0, 275, 0, 310)
ConveyorSupports.Size = UDim2.new(0, 80, 0, 15)
ConveyorSupports.TextColor3 = Color3.new(1, 1, 1)
ConveyorSupports.Font = Enum.Font.SourceSans
ConveyorSupports.FontSize = Enum.FontSize.Size14
ConveyorSupports.Text = "Supports"
ConveyorSupports.TextScaled = true
ConveyorSupports.TextSize = 14
ConveyorSupports.TextWrapped = true

ConveyorSupportsItems = Instance.new("TextLabel")
ConveyorSupportsItems.Name = "ConveyorSupportsItems"
ConveyorSupportsItems.Parent = conandsawframe
ConveyorSupportsItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorSupportsItems.BackgroundTransparency = 0.1
ConveyorSupportsItems.BorderColor3 = Color3.new(0, 0, 0)
ConveyorSupportsItems.BorderSizePixel = 0
ConveyorSupportsItems.Position = UDim2.new(0, 357, 0, 310)
ConveyorSupportsItems.Size = UDim2.new(0, 20, 0, 15)
ConveyorSupportsItems.TextColor3 = Color3.new(1, 1, 1)
ConveyorSupportsItems.Font = Enum.Font.SourceSans
ConveyorSupportsItems.FontSize = Enum.FontSize.Size14
ConveyorSupportsItems.Text = "0"
ConveyorSupportsItems.TextScaled = true
ConveyorSupportsItems.TextSize = 14
ConveyorSupportsItems.TextWrapped = true

ConveyorSwitchInfo = Instance.new("ImageLabel")
ConveyorSwitchInfo.BackgroundTransparency = 1
ConveyorSwitchInfo.Name = "ConveyorSwitchInfo"
ConveyorSwitchInfo.Parent = conandsawframe
ConveyorSwitchInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ConveyorSwitchInfo.Position = UDim2.new(0, 410, 0, 240)
ConveyorSwitchInfo.Size = UDim2.new(0, 40, 0, 60)
ConveyorSwitchInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197516"
ConveyorSwitchInfo.Visible = true

ConveyorSwitch = Instance.new("TextLabel")
ConveyorSwitch.Name = "ConveyorSwitch"
ConveyorSwitch.Parent = conandsawframe
ConveyorSwitch.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorSwitch.BackgroundTransparency = 0.1
ConveyorSwitch.BorderColor3 = Color3.new(0, 0, 0)
ConveyorSwitch.BorderSizePixel = 0
ConveyorSwitch.Position = UDim2.new(0, 390, 0, 310)
ConveyorSwitch.Size = UDim2.new(0, 80, 0, 15)
ConveyorSwitch.TextColor3 = Color3.new(1, 1, 1)
ConveyorSwitch.Font = Enum.Font.SourceSans
ConveyorSwitch.FontSize = Enum.FontSize.Size14
ConveyorSwitch.Text = "Switch"
ConveyorSwitch.TextScaled = true
ConveyorSwitch.TextSize = 14
ConveyorSwitch.TextWrapped = true

ConveyorSwitchItems = Instance.new("TextLabel")
ConveyorSwitchItems.Name = "ConveyorSwitchItems"
ConveyorSwitchItems.Parent = conandsawframe
ConveyorSwitchItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConveyorSwitchItems.BackgroundTransparency = 0.1
ConveyorSwitchItems.BorderColor3 = Color3.new(0, 0, 0)
ConveyorSwitchItems.BorderSizePixel = 0
ConveyorSwitchItems.Position = UDim2.new(0, 472, 0, 310)
ConveyorSwitchItems.Size = UDim2.new(0, 20, 0, 15)
ConveyorSwitchItems.TextColor3 = Color3.new(1, 1, 1)
ConveyorSwitchItems.Font = Enum.Font.SourceSans
ConveyorSwitchItems.FontSize = Enum.FontSize.Size14
ConveyorSwitchItems.Text = "0"
ConveyorSwitchItems.TextScaled = true
ConveyorSwitchItems.TextSize = 14
ConveyorSwitchItems.TextWrapped = true

TightTurnConveyorSupportsInfo = Instance.new("ImageLabel")
TightTurnConveyorSupportsInfo.BackgroundTransparency = 1
TightTurnConveyorSupportsInfo.Name = "TightTurnConveyorSupportsInfo"
TightTurnConveyorSupportsInfo.Parent = conandsawframe
TightTurnConveyorSupportsInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TightTurnConveyorSupportsInfo.Position = UDim2.new(0, 75, 0, 340)
TightTurnConveyorSupportsInfo.Size = UDim2.new(0, 40, 0, 60)
TightTurnConveyorSupportsInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273197936"
TightTurnConveyorSupportsInfo.Visible = true

TightTurnConveyorSupports = Instance.new("TextLabel")
TightTurnConveyorSupports.Name = "TightTurnConveyorSupports"
TightTurnConveyorSupports.Parent = conandsawframe
TightTurnConveyorSupports.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TightTurnConveyorSupports.BackgroundTransparency = 0.1
TightTurnConveyorSupports.BorderColor3 = Color3.new(0, 0, 0)
TightTurnConveyorSupports.BorderSizePixel = 0
TightTurnConveyorSupports.Position = UDim2.new(0, 45, 0, 410)
TightTurnConveyorSupports.Size = UDim2.new(0, 80, 0, 15)
TightTurnConveyorSupports.TextColor3 = Color3.new(1, 1, 1)
TightTurnConveyorSupports.Font = Enum.Font.SourceSans
TightTurnConveyorSupports.FontSize = Enum.FontSize.Size14
TightTurnConveyorSupports.Text = "Turn Supports"
TightTurnConveyorSupports.TextScaled = true
TightTurnConveyorSupports.TextSize = 14
TightTurnConveyorSupports.TextWrapped = true

TightTurnConveyorSupportsItems = Instance.new("TextLabel")
TightTurnConveyorSupportsItems.Name = "TightTurnConveyorSupportsItems"
TightTurnConveyorSupportsItems.Parent = conandsawframe
TightTurnConveyorSupportsItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TightTurnConveyorSupportsItems.BackgroundTransparency = 0.1
TightTurnConveyorSupportsItems.BorderColor3 = Color3.new(0, 0, 0)
TightTurnConveyorSupportsItems.BorderSizePixel = 0
TightTurnConveyorSupportsItems.Position = UDim2.new(0, 127, 0, 410)
TightTurnConveyorSupportsItems.Size = UDim2.new(0, 20, 0, 15)
TightTurnConveyorSupportsItems.TextColor3 = Color3.new(1, 1, 1)
TightTurnConveyorSupportsItems.Font = Enum.Font.SourceSans
TightTurnConveyorSupportsItems.FontSize = Enum.FontSize.Size14
TightTurnConveyorSupportsItems.Text = "0"
TightTurnConveyorSupportsItems.TextScaled = true
TightTurnConveyorSupportsItems.TextSize = 14
TightTurnConveyorSupportsItems.TextWrapped = true

StraightSwitchConveyorRightInfo = Instance.new("ImageLabel")
StraightSwitchConveyorRightInfo.BackgroundTransparency = 1
StraightSwitchConveyorRightInfo.Name = "StraightSwitchConveyorRightInfo"
StraightSwitchConveyorRightInfo.Parent = conandsawframe
StraightSwitchConveyorRightInfo.BackgroundColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorRightInfo.Position = UDim2.new(0, 190, 0, 340)
StraightSwitchConveyorRightInfo.Size = UDim2.new(0, 40, 0, 60)
StraightSwitchConveyorRightInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=434953586"
StraightSwitchConveyorRightInfo.Visible = true

StraightSwitchConveyorRight = Instance.new("TextLabel")
StraightSwitchConveyorRight.Name = "StraightSwitchConveyorRight"
StraightSwitchConveyorRight.Parent = conandsawframe
StraightSwitchConveyorRight.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightSwitchConveyorRight.BackgroundTransparency = 0.1
StraightSwitchConveyorRight.BorderColor3 = Color3.new(0, 0, 0)
StraightSwitchConveyorRight.BorderSizePixel = 0
StraightSwitchConveyorRight.Position = UDim2.new(0, 160, 0, 410)
StraightSwitchConveyorRight.Size = UDim2.new(0, 80, 0, 15)
StraightSwitchConveyorRight.TextColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorRight.Font = Enum.Font.SourceSans
StraightSwitchConveyorRight.FontSize = Enum.FontSize.Size14
StraightSwitchConveyorRight.Text = "Switch Right"
StraightSwitchConveyorRight.TextScaled = true
StraightSwitchConveyorRight.TextSize = 14
StraightSwitchConveyorRight.TextWrapped = true

StraightSwitchConveyorRightItems = Instance.new("TextLabel")
StraightSwitchConveyorRightItems.Name = "StraightSwitchConveyorRightItems"
StraightSwitchConveyorRightItems.Parent = conandsawframe
StraightSwitchConveyorRightItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightSwitchConveyorRightItems.BackgroundTransparency = 0.1
StraightSwitchConveyorRightItems.BorderColor3 = Color3.new(0, 0, 0)
StraightSwitchConveyorRightItems.BorderSizePixel = 0
StraightSwitchConveyorRightItems.Position = UDim2.new(0, 242, 0, 410)
StraightSwitchConveyorRightItems.Size = UDim2.new(0, 20, 0, 15)
StraightSwitchConveyorRightItems.TextColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorRightItems.Font = Enum.Font.SourceSans
StraightSwitchConveyorRightItems.FontSize = Enum.FontSize.Size14
StraightSwitchConveyorRightItems.Text = "0"
StraightSwitchConveyorRightItems.TextScaled = true
StraightSwitchConveyorRightItems.TextSize = 14
StraightSwitchConveyorRightItems.TextWrapped = true

StraightSwitchConveyorLeftInfo = Instance.new("ImageLabel")
StraightSwitchConveyorLeftInfo.BackgroundTransparency = 1
StraightSwitchConveyorLeftInfo.Name = "StraightSwitchConveyorLeftInfo"
StraightSwitchConveyorLeftInfo.Parent = conandsawframe
StraightSwitchConveyorLeftInfo.BackgroundColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorLeftInfo.Position = UDim2.new(0, 300, 0, 340)
StraightSwitchConveyorLeftInfo.Size = UDim2.new(0, 40, 0, 60)
StraightSwitchConveyorLeftInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=434954394"
StraightSwitchConveyorLeftInfo.Visible = true

StraightSwitchConveyorLeft = Instance.new("TextLabel")
StraightSwitchConveyorLeft.Name = "StraightSwitchConveyorLeft"
StraightSwitchConveyorLeft.Parent = conandsawframe
StraightSwitchConveyorLeft.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightSwitchConveyorLeft.BackgroundTransparency = 0.1
StraightSwitchConveyorLeft.BorderColor3 = Color3.new(0, 0, 0)
StraightSwitchConveyorLeft.BorderSizePixel = 0
StraightSwitchConveyorLeft.Position = UDim2.new(0, 275, 0, 410)
StraightSwitchConveyorLeft.Size = UDim2.new(0, 80, 0, 15)
StraightSwitchConveyorLeft.TextColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorLeft.Font = Enum.Font.SourceSans
StraightSwitchConveyorLeft.FontSize = Enum.FontSize.Size14
StraightSwitchConveyorLeft.Text = "Switch Left"
StraightSwitchConveyorLeft.TextScaled = true
StraightSwitchConveyorLeft.TextSize = 14
StraightSwitchConveyorLeft.TextWrapped = true

StraightSwitchConveyorLeftItems = Instance.new("TextLabel")
StraightSwitchConveyorLeftItems.Name = "StraightSwitchConveyorLeftItems"
StraightSwitchConveyorLeftItems.Parent = conandsawframe
StraightSwitchConveyorLeftItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
StraightSwitchConveyorLeftItems.BackgroundTransparency = 0.1
StraightSwitchConveyorLeftItems.BorderColor3 = Color3.new(0, 0, 0)
StraightSwitchConveyorLeftItems.BorderSizePixel = 0
StraightSwitchConveyorLeftItems.Position = UDim2.new(0, 357, 0, 410)
StraightSwitchConveyorLeftItems.Size = UDim2.new(0, 20, 0, 15)
StraightSwitchConveyorLeftItems.TextColor3 = Color3.new(1, 1, 1)
StraightSwitchConveyorLeftItems.Font = Enum.Font.SourceSans
StraightSwitchConveyorLeftItems.FontSize = Enum.FontSize.Size14
StraightSwitchConveyorLeftItems.Text = "0"
StraightSwitchConveyorLeftItems.TextScaled = true
StraightSwitchConveyorLeftItems.TextSize = 14
StraightSwitchConveyorLeftItems.TextWrapped = true

WireInfo = Instance.new("ImageLabel")
WireInfo.BackgroundTransparency = 1
WireInfo.Name = "WireInfo"
WireInfo.Parent = wireobjframe
WireInfo.BackgroundColor3 = Color3.new(1, 1, 1)
WireInfo.Position = UDim2.new(0, 75, 0, 40)
WireInfo.Size = UDim2.new(0, 40, 0, 60)
WireInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=432665431"
WireInfo.Visible = true

Wire = Instance.new("TextLabel")
Wire.Name = "Wire"
Wire.Parent = wireobjframe
Wire.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Wire.BackgroundTransparency = 0.1
Wire.BorderColor3 = Color3.new(0, 0, 0)
Wire.BorderSizePixel = 0
Wire.Position = UDim2.new(0, 45, 0, 110)
Wire.Size = UDim2.new(0, 80, 0, 15)
Wire.TextColor3 = Color3.new(1, 1, 1)
Wire.Font = Enum.Font.SourceSans
Wire.FontSize = Enum.FontSize.Size14
Wire.Text = "Wire"
Wire.TextScaled = true
Wire.TextSize = 14
Wire.TextWrapped = true

WireItems = Instance.new("TextLabel")
WireItems.Name = "WireItems"
WireItems.Parent = wireobjframe
WireItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WireItems.BackgroundTransparency = 0.1
WireItems.BorderColor3 = Color3.new(0, 0, 0)
WireItems.BorderSizePixel = 0
WireItems.Position = UDim2.new(0, 127, 0, 110)
WireItems.Size = UDim2.new(0, 20, 0, 15)
WireItems.TextColor3 = Color3.new(1, 1, 1)
WireItems.Font = Enum.Font.SourceSans
WireItems.FontSize = Enum.FontSize.Size14
WireItems.Text = "0"
WireItems.TextScaled = true
WireItems.TextSize = 14
WireItems.TextWrapped = true

NeonWireRedInfo = Instance.new("ImageLabel")
NeonWireRedInfo.BackgroundTransparency = 1
NeonWireRedInfo.Name = "NeonWireRedInfo"
NeonWireRedInfo.Parent = wireobjframe
NeonWireRedInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireRedInfo.Position = UDim2.new(0, 190, 0, 40)
NeonWireRedInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireRedInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488150677"
NeonWireRedInfo.Visible = true

NeonWireRed = Instance.new("TextLabel")
NeonWireRed.Name = "NeonWireRed"
NeonWireRed.Parent = wireobjframe
NeonWireRed.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireRed.BackgroundTransparency = 0.1
NeonWireRed.BorderColor3 = Color3.new(0, 0, 0)
NeonWireRed.BorderSizePixel = 0
NeonWireRed.Position = UDim2.new(0, 160, 0, 110)
NeonWireRed.Size = UDim2.new(0, 80, 0, 15)
NeonWireRed.TextColor3 = Color3.new(1, 1, 1)
NeonWireRed.Font = Enum.Font.SourceSans
NeonWireRed.FontSize = Enum.FontSize.Size14
NeonWireRed.Text = "Neon Wire Red"
NeonWireRed.TextScaled = true
NeonWireRed.TextSize = 14
NeonWireRed.TextWrapped = true

NeonWireRedItems = Instance.new("TextLabel")
NeonWireRedItems.Name = "NeonWireRedItems"
NeonWireRedItems.Parent = wireobjframe
NeonWireRedItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireRedItems.BackgroundTransparency = 0.1
NeonWireRedItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireRedItems.BorderSizePixel = 0
NeonWireRedItems.Position = UDim2.new(0, 242, 0, 110)
NeonWireRedItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireRedItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireRedItems.Font = Enum.Font.SourceSans
NeonWireRedItems.FontSize = Enum.FontSize.Size14
NeonWireRedItems.Text = "0"
NeonWireRedItems.TextScaled = true
NeonWireRedItems.TextSize = 14
NeonWireRedItems.TextWrapped = true

NeonWireOrangeInfo = Instance.new("ImageLabel")
NeonWireOrangeInfo.BackgroundTransparency = 1
NeonWireOrangeInfo.Name = "NeonWireOrangeInfo"
NeonWireOrangeInfo.Parent = wireobjframe
NeonWireOrangeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireOrangeInfo.Position = UDim2.new(0, 300, 0, 40)
NeonWireOrangeInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireOrangeInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488154010"
NeonWireOrangeInfo.Visible = true

NeonWireOrange = Instance.new("TextLabel")
NeonWireOrange.Name = "NeonWireOrange"
NeonWireOrange.Parent = wireobjframe
NeonWireOrange.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireOrange.BackgroundTransparency = 0.1
NeonWireOrange.BorderColor3 = Color3.new(0, 0, 0)
NeonWireOrange.BorderSizePixel = 0
NeonWireOrange.Position = UDim2.new(0, 275, 0, 110)
NeonWireOrange.Size = UDim2.new(0, 80, 0, 15)
NeonWireOrange.TextColor3 = Color3.new(1, 1, 1)
NeonWireOrange.Font = Enum.Font.SourceSans
NeonWireOrange.FontSize = Enum.FontSize.Size14
NeonWireOrange.Text = "Neon Wire Orange"
NeonWireOrange.TextScaled = true
NeonWireOrange.TextSize = 14
NeonWireOrange.TextWrapped = true

NeonWireOrangeItems = Instance.new("TextLabel")
NeonWireOrangeItems.Name = "NeonWireOrangeItems"
NeonWireOrangeItems.Parent = wireobjframe
NeonWireOrangeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireOrangeItems.BackgroundTransparency = 0.1
NeonWireOrangeItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireOrangeItems.BorderSizePixel = 0
NeonWireOrangeItems.Position = UDim2.new(0, 357, 0, 110)
NeonWireOrangeItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireOrangeItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireOrangeItems.Font = Enum.Font.SourceSans
NeonWireOrangeItems.FontSize = Enum.FontSize.Size14
NeonWireOrangeItems.Text = "0"
NeonWireOrangeItems.TextScaled = true
NeonWireOrangeItems.TextSize = 14
NeonWireOrangeItems.TextWrapped = true

NeonWireYellowInfo = Instance.new("ImageLabel")
NeonWireYellowInfo.BackgroundTransparency = 1
NeonWireYellowInfo.Name = "NeonWireYellowInfo"
NeonWireYellowInfo.Parent = wireobjframe
NeonWireYellowInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireYellowInfo.Position = UDim2.new(0, 410, 0, 40)
NeonWireYellowInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireYellowInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488171543"
NeonWireYellowInfo.Visible = true

NeonWireYellow = Instance.new("TextLabel")
NeonWireYellow.Name = "NeonWireYellow"
NeonWireYellow.Parent = wireobjframe
NeonWireYellow.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireYellow.BackgroundTransparency = 0.1
NeonWireYellow.BorderColor3 = Color3.new(0, 0, 0)
NeonWireYellow.BorderSizePixel = 0
NeonWireYellow.Position = UDim2.new(0, 390, 0, 110)
NeonWireYellow.Size = UDim2.new(0, 80, 0, 15)
NeonWireYellow.TextColor3 = Color3.new(1, 1, 1)
NeonWireYellow.Font = Enum.Font.SourceSans
NeonWireYellow.FontSize = Enum.FontSize.Size14
NeonWireYellow.Text = "Neon Wire Yellow"
NeonWireYellow.TextScaled = true
NeonWireYellow.TextSize = 14
NeonWireYellow.TextWrapped = true

NeonWireYellowItems = Instance.new("TextLabel")
NeonWireYellowItems.Name = "NeonWireYellowItems"
NeonWireYellowItems.Parent = wireobjframe
NeonWireYellowItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireYellowItems.BackgroundTransparency = 0.1
NeonWireYellowItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireYellowItems.BorderSizePixel = 0
NeonWireYellowItems.Position = UDim2.new(0, 472, 0, 110)
NeonWireYellowItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireYellowItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireYellowItems.Font = Enum.Font.SourceSans
NeonWireYellowItems.FontSize = Enum.FontSize.Size14
NeonWireYellowItems.Text = "0"
NeonWireYellowItems.TextScaled = true
NeonWireYellowItems.TextSize = 14
NeonWireYellowItems.TextWrapped = true

NeonWireGreenInfo = Instance.new("ImageLabel")
NeonWireGreenInfo.BackgroundTransparency = 1
NeonWireGreenInfo.Name = "NeonWireGreenInfo"
NeonWireGreenInfo.Parent = wireobjframe
NeonWireGreenInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireGreenInfo.Position = UDim2.new(0, 75, 0, 140)
NeonWireGreenInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireGreenInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488172235"
NeonWireGreenInfo.Visible = true

NeonWireGreen = Instance.new("TextLabel")
NeonWireGreen.Name = "NeonWireGreen"
NeonWireGreen.Parent = wireobjframe
NeonWireGreen.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireGreen.BackgroundTransparency = 0.1
NeonWireGreen.BorderColor3 = Color3.new(0, 0, 0)
NeonWireGreen.BorderSizePixel = 0
NeonWireGreen.Position = UDim2.new(0, 45, 0, 210)
NeonWireGreen.Size = UDim2.new(0, 80, 0, 15)
NeonWireGreen.TextColor3 = Color3.new(1, 1, 1)
NeonWireGreen.Font = Enum.Font.SourceSans
NeonWireGreen.FontSize = Enum.FontSize.Size14
NeonWireGreen.Text = "Neon Wire Green"
NeonWireGreen.TextScaled = true
NeonWireGreen.TextSize = 14
NeonWireGreen.TextWrapped = true

NeonWireGreenItems = Instance.new("TextLabel")
NeonWireGreenItems.Name = "NeonWireGreenItems"
NeonWireGreenItems.Parent = wireobjframe
NeonWireGreenItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireGreenItems.BackgroundTransparency = 0.1
NeonWireGreenItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireGreenItems.BorderSizePixel = 0
NeonWireGreenItems.Position = UDim2.new(0, 127, 0, 210)
NeonWireGreenItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireGreenItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireGreenItems.Font = Enum.Font.SourceSans
NeonWireGreenItems.FontSize = Enum.FontSize.Size14
NeonWireGreenItems.Text = "0"
NeonWireGreenItems.TextScaled = true
NeonWireGreenItems.TextSize = 14
NeonWireGreenItems.TextWrapped = true

NeonWireCyanInfo = Instance.new("ImageLabel")
NeonWireCyanInfo.BackgroundTransparency = 1
NeonWireCyanInfo.Name = "NeonWireCyanInfo"
NeonWireCyanInfo.Parent = wireobjframe
NeonWireCyanInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireCyanInfo.Position = UDim2.new(0, 190, 0, 140)
NeonWireCyanInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireCyanInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488173091"
NeonWireCyanInfo.Visible = true

NeonWireCyan = Instance.new("TextLabel")
NeonWireCyan.Name = "NeonWireCyan"
NeonWireCyan.Parent = wireobjframe
NeonWireCyan.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireCyan.BackgroundTransparency = 0.1
NeonWireCyan.BorderColor3 = Color3.new(0, 0, 0)
NeonWireCyan.BorderSizePixel = 0
NeonWireCyan.Position = UDim2.new(0, 160, 0, 210)
NeonWireCyan.Size = UDim2.new(0, 80, 0, 15)
NeonWireCyan.TextColor3 = Color3.new(1, 1, 1)
NeonWireCyan.Font = Enum.Font.SourceSans
NeonWireCyan.FontSize = Enum.FontSize.Size14
NeonWireCyan.Text = "Neon Wire Cyan"
NeonWireCyan.TextScaled = true
NeonWireCyan.TextSize = 14
NeonWireCyan.TextWrapped = true

NeonWireCyanItems = Instance.new("TextLabel")
NeonWireCyanItems.Name = "NeonWireCyanItems"
NeonWireCyanItems.Parent = wireobjframe
NeonWireCyanItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireCyanItems.BackgroundTransparency = 0.1
NeonWireCyanItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireCyanItems.BorderSizePixel = 0
NeonWireCyanItems.Position = UDim2.new(0, 242, 0, 210)
NeonWireCyanItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireCyanItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireCyanItems.Font = Enum.Font.SourceSans
NeonWireCyanItems.FontSize = Enum.FontSize.Size14
NeonWireCyanItems.Text = "0"
NeonWireCyanItems.TextScaled = true
NeonWireCyanItems.TextSize = 14
NeonWireCyanItems.TextWrapped = true

NeonWireBlueInfo = Instance.new("ImageLabel")
NeonWireBlueInfo.BackgroundTransparency = 1
NeonWireBlueInfo.Name = "NeonWireBlueInfo"
NeonWireBlueInfo.Parent = wireobjframe
NeonWireBlueInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireBlueInfo.Position = UDim2.new(0, 300, 0, 140)
NeonWireBlueInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireBlueInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488173768"
NeonWireBlueInfo.Visible = true

NeonWireBlue = Instance.new("TextLabel")
NeonWireBlue.Name = "NeonWireBlue"
NeonWireBlue.Parent = wireobjframe
NeonWireBlue.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireBlue.BackgroundTransparency = 0.1
NeonWireBlue.BorderColor3 = Color3.new(0, 0, 0)
NeonWireBlue.BorderSizePixel = 0
NeonWireBlue.Position = UDim2.new(0, 275, 0, 210)
NeonWireBlue.Size = UDim2.new(0, 80, 0, 15)
NeonWireBlue.TextColor3 = Color3.new(1, 1, 1)
NeonWireBlue.Font = Enum.Font.SourceSans
NeonWireBlue.FontSize = Enum.FontSize.Size14
NeonWireBlue.Text = "Neon Wire Blue"
NeonWireBlue.TextScaled = true
NeonWireBlue.TextSize = 14
NeonWireBlue.TextWrapped = true

NeonWireBlueItems = Instance.new("TextLabel")
NeonWireBlueItems.Name = "NeonWireBlueItems"
NeonWireBlueItems.Parent = wireobjframe
NeonWireBlueItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireBlueItems.BackgroundTransparency = 0.1
NeonWireBlueItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireBlueItems.BorderSizePixel = 0
NeonWireBlueItems.Position = UDim2.new(0, 357, 0, 210)
NeonWireBlueItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireBlueItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireBlueItems.Font = Enum.Font.SourceSans
NeonWireBlueItems.FontSize = Enum.FontSize.Size14
NeonWireBlueItems.Text = "0"
NeonWireBlueItems.TextScaled = true
NeonWireBlueItems.TextSize = 14
NeonWireBlueItems.TextWrapped = true

NeonWireVioletInfo = Instance.new("ImageLabel")
NeonWireVioletInfo.BackgroundTransparency = 1
NeonWireVioletInfo.Name = "NeonWireVioletInfo"
NeonWireVioletInfo.Parent = wireobjframe
NeonWireVioletInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireVioletInfo.Position = UDim2.new(0, 410, 0, 140)
NeonWireVioletInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireVioletInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488174839"
NeonWireVioletInfo.Visible = true

NeonWireViolet = Instance.new("TextLabel")
NeonWireViolet.Name = "NeonWireViolet"
NeonWireViolet.Parent = wireobjframe
NeonWireViolet.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireViolet.BackgroundTransparency = 0.1
NeonWireViolet.BorderColor3 = Color3.new(0, 0, 0)
NeonWireViolet.BorderSizePixel = 0
NeonWireViolet.Position = UDim2.new(0, 390, 0, 210)
NeonWireViolet.Size = UDim2.new(0, 80, 0, 15)
NeonWireViolet.TextColor3 = Color3.new(1, 1, 1)
NeonWireViolet.Font = Enum.Font.SourceSans
NeonWireViolet.FontSize = Enum.FontSize.Size14
NeonWireViolet.Text = "Neon Wire Violet"
NeonWireViolet.TextScaled = true
NeonWireViolet.TextSize = 14
NeonWireViolet.TextWrapped = true

NeonWireVioletItems = Instance.new("TextLabel")
NeonWireVioletItems.Name = "NeonWireVioletItems"
NeonWireVioletItems.Parent = wireobjframe
NeonWireVioletItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireVioletItems.BackgroundTransparency = 0.1
NeonWireVioletItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireVioletItems.BorderSizePixel = 0
NeonWireVioletItems.Position = UDim2.new(0, 472, 0, 210)
NeonWireVioletItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireVioletItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireVioletItems.Font = Enum.Font.SourceSans
NeonWireVioletItems.FontSize = Enum.FontSize.Size14
NeonWireVioletItems.Text = "0"
NeonWireVioletItems.TextScaled = true
NeonWireVioletItems.TextSize = 14
NeonWireVioletItems.TextWrapped = true

NeonWireWhiteInfo = Instance.new("ImageLabel")
NeonWireWhiteInfo.BackgroundTransparency = 1
NeonWireWhiteInfo.Name = "NeonWireWhiteInfo"
NeonWireWhiteInfo.Parent = wireobjframe
NeonWireWhiteInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWireWhiteInfo.Position = UDim2.new(0, 75, 0, 240)
NeonWireWhiteInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWireWhiteInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488176016"
NeonWireWhiteInfo.Visible = true

NeonWireWhite = Instance.new("TextLabel")
NeonWireWhite.Name = "NeonWireWhite"
NeonWireWhite.Parent = wireobjframe
NeonWireWhite.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireWhite.BackgroundTransparency = 0.1
NeonWireWhite.BorderColor3 = Color3.new(0, 0, 0)
NeonWireWhite.BorderSizePixel = 0
NeonWireWhite.Position = UDim2.new(0, 45, 0, 310)
NeonWireWhite.Size = UDim2.new(0, 80, 0, 15)
NeonWireWhite.TextColor3 = Color3.new(1, 1, 1)
NeonWireWhite.Font = Enum.Font.SourceSans
NeonWireWhite.FontSize = Enum.FontSize.Size14
NeonWireWhite.Text = "Neon Wire White"
NeonWireWhite.TextScaled = true
NeonWireWhite.TextSize = 14
NeonWireWhite.TextWrapped = true

NeonWireWhiteItems = Instance.new("TextLabel")
NeonWireWhiteItems.Name = "NeonWireWhiteItems"
NeonWireWhiteItems.Parent = wireobjframe
NeonWireWhiteItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWireWhiteItems.BackgroundTransparency = 0.1
NeonWireWhiteItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWireWhiteItems.BorderSizePixel = 0
NeonWireWhiteItems.Position = UDim2.new(0, 127, 0, 310)
NeonWireWhiteItems.Size = UDim2.new(0, 20, 0, 15)
NeonWireWhiteItems.TextColor3 = Color3.new(1, 1, 1)
NeonWireWhiteItems.Font = Enum.Font.SourceSans
NeonWireWhiteItems.FontSize = Enum.FontSize.Size14
NeonWireWhiteItems.Text = "0"
NeonWireWhiteItems.TextScaled = true
NeonWireWhiteItems.TextSize = 14
NeonWireWhiteItems.TextWrapped = true

NeonWirePinkyInfo = Instance.new("ImageLabel")
NeonWirePinkyInfo.BackgroundTransparency = 1
NeonWirePinkyInfo.Name = "NeonWirePinkyInfo"
NeonWirePinkyInfo.Parent = wireobjframe
NeonWirePinkyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
NeonWirePinkyInfo.Position = UDim2.new(0, 190, 0, 240)
NeonWirePinkyInfo.Size = UDim2.new(0, 40, 0, 60)
NeonWirePinkyInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=488176842"
NeonWirePinkyInfo.Visible = true

NeonWirePinky = Instance.new("TextLabel")
NeonWirePinky.Name = "NeonWirePinky"
NeonWirePinky.Parent = wireobjframe
NeonWirePinky.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWirePinky.BackgroundTransparency = 0.1
NeonWirePinky.BorderColor3 = Color3.new(0, 0, 0)
NeonWirePinky.BorderSizePixel = 0
NeonWirePinky.Position = UDim2.new(0, 160, 0, 310)
NeonWirePinky.Size = UDim2.new(0, 80, 0, 15)
NeonWirePinky.TextColor3 = Color3.new(1, 1, 1)
NeonWirePinky.Font = Enum.Font.SourceSans
NeonWirePinky.FontSize = Enum.FontSize.Size14
NeonWirePinky.Text = "Neon Wire Pinky"
NeonWirePinky.TextScaled = true
NeonWirePinky.TextSize = 14
NeonWirePinky.TextWrapped = true

NeonWirePinkyItems = Instance.new("TextLabel")
NeonWirePinkyItems.Name = "NeonWirePinkyItems"
NeonWirePinkyItems.Parent = wireobjframe
NeonWirePinkyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
NeonWirePinkyItems.BackgroundTransparency = 0.1
NeonWirePinkyItems.BorderColor3 = Color3.new(0, 0, 0)
NeonWirePinkyItems.BorderSizePixel = 0
NeonWirePinkyItems.Position = UDim2.new(0, 242, 0, 310)
NeonWirePinkyItems.Size = UDim2.new(0, 20, 0, 15)
NeonWirePinkyItems.TextColor3 = Color3.new(1, 1, 1)
NeonWirePinkyItems.Font = Enum.Font.SourceSans
NeonWirePinkyItems.FontSize = Enum.FontSize.Size14
NeonWirePinkyItems.Text = "0"
NeonWirePinkyItems.TextScaled = true
NeonWirePinkyItems.TextSize = 14
NeonWirePinkyItems.TextWrapped = true

IcicleWireAmberInfo = Instance.new("ImageLabel")
IcicleWireAmberInfo.BackgroundTransparency = 1
IcicleWireAmberInfo.Name = "IcicleWireAmberInfo"
IcicleWireAmberInfo.Parent = wireobjframe
IcicleWireAmberInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireAmberInfo.Position = UDim2.new(0, 300, 0, 240)
IcicleWireAmberInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireAmberInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552402024"
IcicleWireAmberInfo.Visible = true

IcicleWireAmber = Instance.new("TextLabel")
IcicleWireAmber.Name = "IcicleWireAmber"
IcicleWireAmber.Parent = wireobjframe
IcicleWireAmber.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireAmber.BackgroundTransparency = 0.1
IcicleWireAmber.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireAmber.BorderSizePixel = 0
IcicleWireAmber.Position = UDim2.new(0, 275, 0, 310)
IcicleWireAmber.Size = UDim2.new(0, 80, 0, 15)
IcicleWireAmber.TextColor3 = Color3.new(1, 1, 1)
IcicleWireAmber.Font = Enum.Font.SourceSans
IcicleWireAmber.FontSize = Enum.FontSize.Size14
IcicleWireAmber.Text = "Icicle Amber"
IcicleWireAmber.TextScaled = true
IcicleWireAmber.TextSize = 14
IcicleWireAmber.TextWrapped = true

IcicleWireAmberItems = Instance.new("TextLabel")
IcicleWireAmberItems.Name = "IcicleWireAmberItems"
IcicleWireAmberItems.Parent = wireobjframe
IcicleWireAmberItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireAmberItems.BackgroundTransparency = 0.1
IcicleWireAmberItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireAmberItems.BorderSizePixel = 0
IcicleWireAmberItems.Position = UDim2.new(0, 357, 0, 310)
IcicleWireAmberItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireAmberItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireAmberItems.Font = Enum.Font.SourceSans
IcicleWireAmberItems.FontSize = Enum.FontSize.Size14
IcicleWireAmberItems.Text = "0"
IcicleWireAmberItems.TextScaled = true
IcicleWireAmberItems.TextSize = 14
IcicleWireAmberItems.TextWrapped = true

IcicleWireRedInfo = Instance.new("ImageLabel")
IcicleWireRedInfo.BackgroundTransparency = 1
IcicleWireRedInfo.Name = "IcicleWireRedInfo"
IcicleWireRedInfo.Parent = wireobjframe
IcicleWireRedInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireRedInfo.Position = UDim2.new(0, 410, 0, 240)
IcicleWireRedInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireRedInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552404851"
IcicleWireRedInfo.Visible = true

IcicleWireRed = Instance.new("TextLabel")
IcicleWireRed.Name = "IcicleWireRed"
IcicleWireRed.Parent = wireobjframe
IcicleWireRed.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireRed.BackgroundTransparency = 0.1
IcicleWireRed.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireRed.BorderSizePixel = 0
IcicleWireRed.Position = UDim2.new(0, 390, 0, 310)
IcicleWireRed.Size = UDim2.new(0, 80, 0, 15)
IcicleWireRed.TextColor3 = Color3.new(1, 1, 1)
IcicleWireRed.Font = Enum.Font.SourceSans
IcicleWireRed.FontSize = Enum.FontSize.Size14
IcicleWireRed.Text = "Icicle Red"
IcicleWireRed.TextScaled = true
IcicleWireRed.TextSize = 14
IcicleWireRed.TextWrapped = true

IcicleWireRedItems = Instance.new("TextLabel")
IcicleWireRedItems.Name = "IcicleWireRedItems"
IcicleWireRedItems.Parent = wireobjframe
IcicleWireRedItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireRedItems.BackgroundTransparency = 0.1
IcicleWireRedItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireRedItems.BorderSizePixel = 0
IcicleWireRedItems.Position = UDim2.new(0, 472, 0, 310)
IcicleWireRedItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireRedItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireRedItems.Font = Enum.Font.SourceSans
IcicleWireRedItems.FontSize = Enum.FontSize.Size14
IcicleWireRedItems.Text = "0"
IcicleWireRedItems.TextScaled = true
IcicleWireRedItems.TextSize = 14
IcicleWireRedItems.TextWrapped = true

IcicleWireGreenInfo = Instance.new("ImageLabel")
IcicleWireGreenInfo.BackgroundTransparency = 1
IcicleWireGreenInfo.Name = "IcicleWireGreenInfo"
IcicleWireGreenInfo.Parent = wireobjframe
IcicleWireGreenInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireGreenInfo.Position = UDim2.new(0, 75, 0, 340)
IcicleWireGreenInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireGreenInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552405581"
IcicleWireGreenInfo.Visible = true

IcicleWireGreen = Instance.new("TextLabel")
IcicleWireGreen.Name = "IcicleWireGreen"
IcicleWireGreen.Parent = wireobjframe
IcicleWireGreen.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireGreen.BackgroundTransparency = 0.1
IcicleWireGreen.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireGreen.BorderSizePixel = 0
IcicleWireGreen.Position = UDim2.new(0, 45, 0, 410)
IcicleWireGreen.Size = UDim2.new(0, 80, 0, 15)
IcicleWireGreen.TextColor3 = Color3.new(1, 1, 1)
IcicleWireGreen.Font = Enum.Font.SourceSans
IcicleWireGreen.FontSize = Enum.FontSize.Size14
IcicleWireGreen.Text = "Icicle Green"
IcicleWireGreen.TextScaled = true
IcicleWireGreen.TextSize = 14
IcicleWireGreen.TextWrapped = true

IcicleWireGreenItems = Instance.new("TextLabel")
IcicleWireGreenItems.Name = "IcicleWireGreenItems"
IcicleWireGreenItems.Parent = wireobjframe
IcicleWireGreenItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireGreenItems.BackgroundTransparency = 0.1
IcicleWireGreenItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireGreenItems.BorderSizePixel = 0
IcicleWireGreenItems.Position = UDim2.new(0, 127, 0, 410)
IcicleWireGreenItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireGreenItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireGreenItems.Font = Enum.Font.SourceSans
IcicleWireGreenItems.FontSize = Enum.FontSize.Size14
IcicleWireGreenItems.Text = "0"
IcicleWireGreenItems.TextScaled = true
IcicleWireGreenItems.TextSize = 14
IcicleWireGreenItems.TextWrapped = true

IcicleWireBlueInfo = Instance.new("ImageLabel")
IcicleWireBlueInfo.BackgroundTransparency = 1
IcicleWireBlueInfo.Name = "IcicleWireBlueInfo"
IcicleWireBlueInfo.Parent = wireobjframe
IcicleWireBlueInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireBlueInfo.Position = UDim2.new(0, 190, 0, 340)
IcicleWireBlueInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireBlueInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552406261"
IcicleWireBlueInfo.Visible = true

IcicleWireBlue = Instance.new("TextLabel")
IcicleWireBlue.Name = "IcicleWireBlue"
IcicleWireBlue.Parent = wireobjframe
IcicleWireBlue.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireBlue.BackgroundTransparency = 0.1
IcicleWireBlue.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireBlue.BorderSizePixel = 0
IcicleWireBlue.Position = UDim2.new(0, 160, 0, 410)
IcicleWireBlue.Size = UDim2.new(0, 80, 0, 15)
IcicleWireBlue.TextColor3 = Color3.new(1, 1, 1)
IcicleWireBlue.Font = Enum.Font.SourceSans
IcicleWireBlue.FontSize = Enum.FontSize.Size14
IcicleWireBlue.Text = "Icicle Blue"
IcicleWireBlue.TextScaled = true
IcicleWireBlue.TextSize = 14
IcicleWireBlue.TextWrapped = true

IcicleWireBlueItems = Instance.new("TextLabel")
IcicleWireBlueItems.Name = "IcicleWireBlueItems"
IcicleWireBlueItems.Parent = wireobjframe
IcicleWireBlueItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireBlueItems.BackgroundTransparency = 0.1
IcicleWireBlueItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireBlueItems.BorderSizePixel = 0
IcicleWireBlueItems.Position = UDim2.new(0, 242, 0, 410)
IcicleWireBlueItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireBlueItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireBlueItems.Font = Enum.Font.SourceSans
IcicleWireBlueItems.FontSize = Enum.FontSize.Size14
IcicleWireBlueItems.Text = "0"
IcicleWireBlueItems.TextScaled = true
IcicleWireBlueItems.TextSize = 14
IcicleWireBlueItems.TextWrapped = true

IcicleWireMagentaInfo = Instance.new("ImageLabel")
IcicleWireMagentaInfo.BackgroundTransparency = 1
IcicleWireMagentaInfo.Name = "IcicleWireMagentaInfo"
IcicleWireMagentaInfo.Parent = wireobjframe
IcicleWireMagentaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireMagentaInfo.Position = UDim2.new(0, 300, 0, 340)
IcicleWireMagentaInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireMagentaInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552419715"
IcicleWireMagentaInfo.Visible = true

IcicleWireMagenta = Instance.new("TextLabel")
IcicleWireMagenta.Name = "IcicleWireMagenta"
IcicleWireMagenta.Parent = wireobjframe
IcicleWireMagenta.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireMagenta.BackgroundTransparency = 0.1
IcicleWireMagenta.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireMagenta.BorderSizePixel = 0
IcicleWireMagenta.Position = UDim2.new(0, 275, 0, 410)
IcicleWireMagenta.Size = UDim2.new(0, 80, 0, 15)
IcicleWireMagenta.TextColor3 = Color3.new(1, 1, 1)
IcicleWireMagenta.Font = Enum.Font.SourceSans
IcicleWireMagenta.FontSize = Enum.FontSize.Size14
IcicleWireMagenta.Text = "Icicle Magenta"
IcicleWireMagenta.TextScaled = true
IcicleWireMagenta.TextSize = 14
IcicleWireMagenta.TextWrapped = true

IcicleWireMagentaItems = Instance.new("TextLabel")
IcicleWireMagentaItems.Name = "IcicleWireMagentaItems"
IcicleWireMagentaItems.Parent = wireobjframe
IcicleWireMagentaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireMagentaItems.BackgroundTransparency = 0.1
IcicleWireMagentaItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireMagentaItems.BorderSizePixel = 0
IcicleWireMagentaItems.Position = UDim2.new(0, 357, 0, 410)
IcicleWireMagentaItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireMagentaItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireMagentaItems.Font = Enum.Font.SourceSans
IcicleWireMagentaItems.FontSize = Enum.FontSize.Size14
IcicleWireMagentaItems.Text = "0"
IcicleWireMagentaItems.TextScaled = true
IcicleWireMagentaItems.TextSize = 14
IcicleWireMagentaItems.TextWrapped = true

IcicleWireHalloweenInfo = Instance.new("ImageLabel")
IcicleWireHalloweenInfo.BackgroundTransparency = 1
IcicleWireHalloweenInfo.Name = "IcicleWireHalloweenInfo"
IcicleWireHalloweenInfo.Parent = wireobjframe
IcicleWireHalloweenInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IcicleWireHalloweenInfo.Position = UDim2.new(0, 410, 0, 340)
IcicleWireHalloweenInfo.Size = UDim2.new(0, 40, 0, 60)
IcicleWireHalloweenInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2361857880"
IcicleWireHalloweenInfo.Visible = true

IcicleWireHalloween = Instance.new("TextLabel")
IcicleWireHalloween.Name = "IcicleWireHalloween"
IcicleWireHalloween.Parent = wireobjframe
IcicleWireHalloween.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireHalloween.BackgroundTransparency = 0.1
IcicleWireHalloween.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireHalloween.BorderSizePixel = 0
IcicleWireHalloween.Position = UDim2.new(0, 390, 0, 410)
IcicleWireHalloween.Size = UDim2.new(0, 80, 0, 15)
IcicleWireHalloween.TextColor3 = Color3.new(1, 1, 1)
IcicleWireHalloween.Font = Enum.Font.SourceSans
IcicleWireHalloween.FontSize = Enum.FontSize.Size14
IcicleWireHalloween.Text = "Icicle Halloween"
IcicleWireHalloween.TextScaled = true
IcicleWireHalloween.TextSize = 14
IcicleWireHalloween.TextWrapped = true

IcicleWireHalloweenItems = Instance.new("TextLabel")
IcicleWireHalloweenItems.Name = "IcicleWireHalloweenItems"
IcicleWireHalloweenItems.Parent = wireobjframe
IcicleWireHalloweenItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IcicleWireHalloweenItems.BackgroundTransparency = 0.1
IcicleWireHalloweenItems.BorderColor3 = Color3.new(0, 0, 0)
IcicleWireHalloweenItems.BorderSizePixel = 0
IcicleWireHalloweenItems.Position = UDim2.new(0, 472, 0, 410)
IcicleWireHalloweenItems.Size = UDim2.new(0, 20, 0, 15)
IcicleWireHalloweenItems.TextColor3 = Color3.new(1, 1, 1)
IcicleWireHalloweenItems.Font = Enum.Font.SourceSans
IcicleWireHalloweenItems.FontSize = Enum.FontSize.Size14
IcicleWireHalloweenItems.Text = "0"
IcicleWireHalloweenItems.TextScaled = true
IcicleWireHalloweenItems.TextSize = 14
IcicleWireHalloweenItems.TextWrapped = true

Lever0Info = Instance.new("ImageLabel")
Lever0Info.BackgroundTransparency = 1
Lever0Info.Name = "Lever0Info"
Lever0Info.Parent = wireobjframe
Lever0Info.BackgroundColor3 = Color3.new(1, 1, 1)
Lever0Info.Position = UDim2.new(0, 75, 0, 440)
Lever0Info.Size = UDim2.new(0, 40, 0, 60)
Lever0Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=430894924"
Lever0Info.Visible = true

Lever0 = Instance.new("TextLabel")
Lever0.Name = "Lever0"
Lever0.Parent = wireobjframe
Lever0.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Lever0.BackgroundTransparency = 0.1
Lever0.BorderColor3 = Color3.new(0, 0, 0)
Lever0.BorderSizePixel = 0
Lever0.Position = UDim2.new(0, 45, 0, 510)
Lever0.Size = UDim2.new(0, 80, 0, 15)
Lever0.TextColor3 = Color3.new(1, 1, 1)
Lever0.Font = Enum.Font.SourceSans
Lever0.FontSize = Enum.FontSize.Size14
Lever0.Text = "Lever"
Lever0.TextScaled = true
Lever0.TextSize = 14
Lever0.TextWrapped = true

Lever0Items = Instance.new("TextLabel")
Lever0Items.Name = "Lever0Items"
Lever0Items.Parent = wireobjframe
Lever0Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Lever0Items.BackgroundTransparency = 0.1
Lever0Items.BorderColor3 = Color3.new(0, 0, 0)
Lever0Items.BorderSizePixel = 0
Lever0Items.Position = UDim2.new(0, 127, 0, 510)
Lever0Items.Size = UDim2.new(0, 20, 0, 15)
Lever0Items.TextColor3 = Color3.new(1, 1, 1)
Lever0Items.Font = Enum.Font.SourceSans
Lever0Items.FontSize = Enum.FontSize.Size14
Lever0Items.Text = "0"
Lever0Items.TextScaled = true
Lever0Items.TextSize = 14
Lever0Items.TextWrapped = true

Button0Info = Instance.new("ImageLabel")
Button0Info.BackgroundTransparency = 1
Button0Info.Name = "Button0Info"
Button0Info.Parent = wireobjframe
Button0Info.BackgroundColor3 = Color3.new(1, 1, 1)
Button0Info.Position = UDim2.new(0, 190, 0, 440)
Button0Info.Size = UDim2.new(0, 40, 0, 60)
Button0Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=431654758"
Button0Info.Visible = true

Button0 = Instance.new("TextLabel")
Button0.Name = "Button0"
Button0.Parent = wireobjframe
Button0.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Button0.BackgroundTransparency = 0.1
Button0.BorderColor3 = Color3.new(0, 0, 0)
Button0.BorderSizePixel = 0
Button0.Position = UDim2.new(0, 160, 0, 510)
Button0.Size = UDim2.new(0, 80, 0, 15)
Button0.TextColor3 = Color3.new(1, 1, 1)
Button0.Font = Enum.Font.SourceSans
Button0.FontSize = Enum.FontSize.Size14
Button0.Text = "Button"
Button0.TextScaled = true
Button0.TextSize = 14
Button0.TextWrapped = true

Button0Items = Instance.new("TextLabel")
Button0Items.Name = "Button0Items"
Button0Items.Parent = wireobjframe
Button0Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Button0Items.BackgroundTransparency = 0.1
Button0Items.BorderColor3 = Color3.new(0, 0, 0)
Button0Items.BorderSizePixel = 0
Button0Items.Position = UDim2.new(0, 242, 0, 510)
Button0Items.Size = UDim2.new(0, 20, 0, 15)
Button0Items.TextColor3 = Color3.new(1, 1, 1)
Button0Items.Font = Enum.Font.SourceSans
Button0Items.FontSize = Enum.FontSize.Size14
Button0Items.Text = "0"
Button0Items.TextScaled = true
Button0Items.TextSize = 14
Button0Items.TextWrapped = true

ChopSawInfo = Instance.new("ImageLabel")
ChopSawInfo.BackgroundTransparency = 1
ChopSawInfo.Name = "ChopSawInfo"
ChopSawInfo.Parent = wireobjframe
ChopSawInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ChopSawInfo.Position = UDim2.new(0, 300, 0, 440)
ChopSawInfo.Size = UDim2.new(0, 40, 0, 60)
ChopSawInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=432387149"
ChopSawInfo.Visible = true

ChopSaw = Instance.new("TextLabel")
ChopSaw.Name = "ChopSaw"
ChopSaw.Parent = wireobjframe
ChopSaw.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ChopSaw.BackgroundTransparency = 0.1
ChopSaw.BorderColor3 = Color3.new(0, 0, 0)
ChopSaw.BorderSizePixel = 0
ChopSaw.Position = UDim2.new(0, 275, 0, 510)
ChopSaw.Size = UDim2.new(0, 80, 0, 15)
ChopSaw.TextColor3 = Color3.new(1, 1, 1)
ChopSaw.Font = Enum.Font.SourceSans
ChopSaw.FontSize = Enum.FontSize.Size14
ChopSaw.Text = "ChopSaw"
ChopSaw.TextScaled = true
ChopSaw.TextSize = 14
ChopSaw.TextWrapped = true

ChopSawItems = Instance.new("TextLabel")
ChopSawItems.Name = "ChopSawItems"
ChopSawItems.Parent = wireobjframe
ChopSawItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ChopSawItems.BackgroundTransparency = 0.1
ChopSawItems.BorderColor3 = Color3.new(0, 0, 0)
ChopSawItems.BorderSizePixel = 0
ChopSawItems.Position = UDim2.new(0, 357, 0, 510)
ChopSawItems.Size = UDim2.new(0, 20, 0, 15)
ChopSawItems.TextColor3 = Color3.new(1, 1, 1)
ChopSawItems.Font = Enum.Font.SourceSans
ChopSawItems.FontSize = Enum.FontSize.Size14
ChopSawItems.Text = "0"
ChopSawItems.TextScaled = true
ChopSawItems.TextSize = 14
ChopSawItems.TextWrapped = true

PressurePlateInfo = Instance.new("ImageLabel")
PressurePlateInfo.BackgroundTransparency = 1
PressurePlateInfo.Name = "PressurePlateInfo"
PressurePlateInfo.Parent = wireobjframe
PressurePlateInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PressurePlateInfo.Position = UDim2.new(0, 410, 0, 440)
PressurePlateInfo.Size = UDim2.new(0, 40, 0, 60)
PressurePlateInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=432730885"
PressurePlateInfo.Visible = true

PressurePlate = Instance.new("TextLabel")
PressurePlate.Name = "PressurePlate"
PressurePlate.Parent = wireobjframe
PressurePlate.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PressurePlate.BackgroundTransparency = 0.1
PressurePlate.BorderColor3 = Color3.new(0, 0, 0)
PressurePlate.BorderSizePixel = 0
PressurePlate.Position = UDim2.new(0, 390, 0, 510)
PressurePlate.Size = UDim2.new(0, 80, 0, 15)
PressurePlate.TextColor3 = Color3.new(1, 1, 1)
PressurePlate.Font = Enum.Font.SourceSans
PressurePlate.FontSize = Enum.FontSize.Size14
PressurePlate.Text = "Pressure Plate"
PressurePlate.TextScaled = true
PressurePlate.TextSize = 14
PressurePlate.TextWrapped = true

PressurePlateItems = Instance.new("TextLabel")
PressurePlateItems.Name = "PressurePlateItems"
PressurePlateItems.Parent = wireobjframe
PressurePlateItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PressurePlateItems.BackgroundTransparency = 0.1
PressurePlateItems.BorderColor3 = Color3.new(0, 0, 0)
PressurePlateItems.BorderSizePixel = 0
PressurePlateItems.Position = UDim2.new(0, 472, 0, 510)
PressurePlateItems.Size = UDim2.new(0, 20, 0, 15)
PressurePlateItems.TextColor3 = Color3.new(1, 1, 1)
PressurePlateItems.Font = Enum.Font.SourceSans
PressurePlateItems.FontSize = Enum.FontSize.Size14
PressurePlateItems.Text = "0"
PressurePlateItems.TextScaled = true
PressurePlateItems.TextSize = 14
PressurePlateItems.TextWrapped = true

SignalSustainInfo = Instance.new("ImageLabel")
SignalSustainInfo.BackgroundTransparency = 1
SignalSustainInfo.Name = "SignalSustainInfo"
SignalSustainInfo.Parent = wireobjframe
SignalSustainInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SignalSustainInfo.Position = UDim2.new(0, 75, 0, 540)
SignalSustainInfo.Size = UDim2.new(0, 40, 0, 60)
SignalSustainInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=435865824"
SignalSustainInfo.Visible = true

SignalSustain = Instance.new("TextLabel")
SignalSustain.Name = "SignalSustain"
SignalSustain.Parent = wireobjframe
SignalSustain.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalSustain.BackgroundTransparency = 0.1
SignalSustain.BorderColor3 = Color3.new(0, 0, 0)
SignalSustain.BorderSizePixel = 0
SignalSustain.Position = UDim2.new(0, 45, 0, 610)
SignalSustain.Size = UDim2.new(0, 80, 0, 15)
SignalSustain.TextColor3 = Color3.new(1, 1, 1)
SignalSustain.Font = Enum.Font.SourceSans
SignalSustain.FontSize = Enum.FontSize.Size14
SignalSustain.Text = "Signal Sustain"
SignalSustain.TextScaled = true
SignalSustain.TextSize = 14
SignalSustain.TextWrapped = true

SignalSustainItems = Instance.new("TextLabel")
SignalSustainItems.Name = "SignalSustainItems"
SignalSustainItems.Parent = wireobjframe
SignalSustainItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalSustainItems.BackgroundTransparency = 0.1
SignalSustainItems.BorderColor3 = Color3.new(0, 0, 0)
SignalSustainItems.BorderSizePixel = 0
SignalSustainItems.Position = UDim2.new(0, 127, 0, 610)
SignalSustainItems.Size = UDim2.new(0, 20, 0, 15)
SignalSustainItems.TextColor3 = Color3.new(1, 1, 1)
SignalSustainItems.Font = Enum.Font.SourceSans
SignalSustainItems.FontSize = Enum.FontSize.Size14
SignalSustainItems.Text = "0"
SignalSustainItems.TextScaled = true
SignalSustainItems.TextSize = 14
SignalSustainItems.TextWrapped = true

LaserInfo = Instance.new("ImageLabel")
LaserInfo.BackgroundTransparency = 1
LaserInfo.Name = "LaserInfo"
LaserInfo.Parent = wireobjframe
LaserInfo.BackgroundColor3 = Color3.new(1, 1, 1)
LaserInfo.Position = UDim2.new(0, 190, 0, 540)
LaserInfo.Size = UDim2.new(0, 40, 0, 60)
LaserInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433364921"
LaserInfo.Visible = true

Laser = Instance.new("TextLabel")
Laser.Name = "Laser"
Laser.Parent = wireobjframe
Laser.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Laser.BackgroundTransparency = 0.1
Laser.BorderColor3 = Color3.new(0, 0, 0)
Laser.BorderSizePixel = 0
Laser.Position = UDim2.new(0, 160, 0, 610)
Laser.Size = UDim2.new(0, 80, 0, 15)
Laser.TextColor3 = Color3.new(1, 1, 1)
Laser.Font = Enum.Font.SourceSans
Laser.FontSize = Enum.FontSize.Size14
Laser.Text = "Laser"
Laser.TextScaled = true
Laser.TextSize = 14
Laser.TextWrapped = true

LaserItems = Instance.new("TextLabel")
LaserItems.Name = "LaserItems"
LaserItems.Parent = wireobjframe
LaserItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LaserItems.BackgroundTransparency = 0.1
LaserItems.BorderColor3 = Color3.new(0, 0, 0)
LaserItems.BorderSizePixel = 0
LaserItems.Position = UDim2.new(0, 242, 0, 610)
LaserItems.Size = UDim2.new(0, 20, 0, 15)
LaserItems.TextColor3 = Color3.new(1, 1, 1)
LaserItems.Font = Enum.Font.SourceSans
LaserItems.FontSize = Enum.FontSize.Size14
LaserItems.Text = "0"
LaserItems.TextScaled = true
LaserItems.TextSize = 14
LaserItems.TextWrapped = true

LaserReceiverInfo = Instance.new("ImageLabel")
LaserReceiverInfo.BackgroundTransparency = 1
LaserReceiverInfo.Name = "LaserReceiverInfo"
LaserReceiverInfo.Parent = wireobjframe
LaserReceiverInfo.BackgroundColor3 = Color3.new(1, 1, 1)
LaserReceiverInfo.Position = UDim2.new(0, 300, 0, 540)
LaserReceiverInfo.Size = UDim2.new(0, 40, 0, 60)
LaserReceiverInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433366184"
LaserReceiverInfo.Visible = true

LaserReceiver = Instance.new("TextLabel")
LaserReceiver.Name = "LaserReceiver"
LaserReceiver.Parent = wireobjframe
LaserReceiver.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LaserReceiver.BackgroundTransparency = 0.1
LaserReceiver.BorderColor3 = Color3.new(0, 0, 0)
LaserReceiver.BorderSizePixel = 0
LaserReceiver.Position = UDim2.new(0, 275, 0, 610)
LaserReceiver.Size = UDim2.new(0, 80, 0, 15)
LaserReceiver.TextColor3 = Color3.new(1, 1, 1)
LaserReceiver.Font = Enum.Font.SourceSans
LaserReceiver.FontSize = Enum.FontSize.Size14
LaserReceiver.Text = "Laser Receiver"
LaserReceiver.TextScaled = true
LaserReceiver.TextSize = 14
LaserReceiver.TextWrapped = true

LaserReceiverItems = Instance.new("TextLabel")
LaserReceiverItems.Name = "LaserReceiverItems"
LaserReceiverItems.Parent = wireobjframe
LaserReceiverItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LaserReceiverItems.BackgroundTransparency = 0.1
LaserReceiverItems.BorderColor3 = Color3.new(0, 0, 0)
LaserReceiverItems.BorderSizePixel = 0
LaserReceiverItems.Position = UDim2.new(0, 357, 0, 610)
LaserReceiverItems.Size = UDim2.new(0, 20, 0, 15)
LaserReceiverItems.TextColor3 = Color3.new(1, 1, 1)
LaserReceiverItems.Font = Enum.Font.SourceSans
LaserReceiverItems.FontSize = Enum.FontSize.Size14
LaserReceiverItems.Text = "0"
LaserReceiverItems.TextScaled = true
LaserReceiverItems.TextSize = 14
LaserReceiverItems.TextWrapped = true

HatchInfo = Instance.new("ImageLabel")
HatchInfo.BackgroundTransparency = 1
HatchInfo.Name = "HatchInfo"
HatchInfo.Parent = wireobjframe
HatchInfo.BackgroundColor3 = Color3.new(1, 1, 1)
HatchInfo.Position = UDim2.new(0, 410, 0, 540)
HatchInfo.Size = UDim2.new(0, 40, 0, 60)
HatchInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433406895"
HatchInfo.Visible = true

Hatch = Instance.new("TextLabel")
Hatch.Name = "Hatch"
Hatch.Parent = wireobjframe
Hatch.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Hatch.BackgroundTransparency = 0.1
Hatch.BorderColor3 = Color3.new(0, 0, 0)
Hatch.BorderSizePixel = 0
Hatch.Position = UDim2.new(0, 390, 0, 610)
Hatch.Size = UDim2.new(0, 80, 0, 15)
Hatch.TextColor3 = Color3.new(1, 1, 1)
Hatch.Font = Enum.Font.SourceSans
Hatch.FontSize = Enum.FontSize.Size14
Hatch.Text = "Hatch"
Hatch.TextScaled = true
Hatch.TextSize = 14
Hatch.TextWrapped = true

HatchItems = Instance.new("TextLabel")
HatchItems.Name = "HatchItems"
HatchItems.Parent = wireobjframe
HatchItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HatchItems.BackgroundTransparency = 0.1
HatchItems.BorderColor3 = Color3.new(0, 0, 0)
HatchItems.BorderSizePixel = 0
HatchItems.Position = UDim2.new(0, 472, 0, 610)
HatchItems.Size = UDim2.new(0, 20, 0, 15)
HatchItems.TextColor3 = Color3.new(1, 1, 1)
HatchItems.Font = Enum.Font.SourceSans
HatchItems.FontSize = Enum.FontSize.Size14
HatchItems.Text = "0"
HatchItems.TextScaled = true
HatchItems.TextSize = 14
HatchItems.TextWrapped = true

SignalInverterInfo = Instance.new("ImageLabel")
SignalInverterInfo.BackgroundTransparency = 1
SignalInverterInfo.Name = "Signal InverterInfo"
SignalInverterInfo.Parent = wireobjframe
SignalInverterInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SignalInverterInfo.Position = UDim2.new(0, 75, 0, 640)
SignalInverterInfo.Size = UDim2.new(0, 40, 0, 60)
SignalInverterInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433424230"
SignalInverterInfo.Visible = true

SignalInverter = Instance.new("TextLabel")
SignalInverter.Name = "SignalInverter"
SignalInverter.Parent = wireobjframe
SignalInverter.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalInverter.BackgroundTransparency = 0.1
SignalInverter.BorderColor3 = Color3.new(0, 0, 0)
SignalInverter.BorderSizePixel = 0
SignalInverter.Position = UDim2.new(0, 45, 0, 710)
SignalInverter.Size = UDim2.new(0, 80, 0, 15)
SignalInverter.TextColor3 = Color3.new(1, 1, 1)
SignalInverter.Font = Enum.Font.SourceSans
SignalInverter.FontSize = Enum.FontSize.Size14
SignalInverter.Text = "Signal Inverter"
SignalInverter.TextScaled = true
SignalInverter.TextSize = 14
SignalInverter.TextWrapped = true

SignalInverterItems = Instance.new("TextLabel")
SignalInverterItems.Name = "SignalInverterItems"
SignalInverterItems.Parent = wireobjframe
SignalInverterItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalInverterItems.BackgroundTransparency = 0.1
SignalInverterItems.BorderColor3 = Color3.new(0, 0, 0)
SignalInverterItems.BorderSizePixel = 0
SignalInverterItems.Position = UDim2.new(0, 127, 0, 710)
SignalInverterItems.Size = UDim2.new(0, 20, 0, 15)
SignalInverterItems.TextColor3 = Color3.new(1, 1, 1)
SignalInverterItems.Font = Enum.Font.SourceSans
SignalInverterItems.FontSize = Enum.FontSize.Size14
SignalInverterItems.Text = "0"
SignalInverterItems.TextScaled = true
SignalInverterItems.TextSize = 14
SignalInverterItems.TextWrapped = true

GateORInfo = Instance.new("ImageLabel")
GateORInfo.BackgroundTransparency = 1
GateORInfo.Name = "Signal InverterInfo"
GateORInfo.Parent = wireobjframe
GateORInfo.BackgroundColor3 = Color3.new(1, 1, 1)
GateORInfo.Position = UDim2.new(0, 190, 0, 640)
GateORInfo.Size = UDim2.new(0, 40, 0, 60)
GateORInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433439716"
GateORInfo.Visible = true

GateOR = Instance.new("TextLabel")
GateOR.Name = "GateOR"
GateOR.Parent = wireobjframe
GateOR.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateOR.BackgroundTransparency = 0.1
GateOR.BorderColor3 = Color3.new(0, 0, 0)
GateOR.BorderSizePixel = 0
GateOR.Position = UDim2.new(0, 160, 0, 710)
GateOR.Size = UDim2.new(0, 80, 0, 15)
GateOR.TextColor3 = Color3.new(1, 1, 1)
GateOR.Font = Enum.Font.SourceSans
GateOR.FontSize = Enum.FontSize.Size14
GateOR.Text = "OR Gate"
GateOR.TextScaled = true
GateOR.TextSize = 14
GateOR.TextWrapped = true

GateORItems = Instance.new("TextLabel")
GateORItems.Name = "GateORItems"
GateORItems.Parent = wireobjframe
GateORItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateORItems.BackgroundTransparency = 0.1
GateORItems.BorderColor3 = Color3.new(0, 0, 0)
GateORItems.BorderSizePixel = 0
GateORItems.Position = UDim2.new(0, 242, 0, 710)
GateORItems.Size = UDim2.new(0, 20, 0, 15)
GateORItems.TextColor3 = Color3.new(1, 1, 1)
GateORItems.Font = Enum.Font.SourceSans
GateORItems.FontSize = Enum.FontSize.Size14
GateORItems.Text = "0"
GateORItems.TextScaled = true
GateORItems.TextSize = 14
GateORItems.TextWrapped = true

GateANDInfo = Instance.new("ImageLabel")
GateANDInfo.BackgroundTransparency = 1
GateANDInfo.Name = "Signal InverterInfo"
GateANDInfo.Parent = wireobjframe
GateANDInfo.BackgroundColor3 = Color3.new(1, 1, 1)
GateANDInfo.Position = UDim2.new(0, 300, 0, 640)
GateANDInfo.Size = UDim2.new(0, 40, 0, 60)
GateANDInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433439887"
GateANDInfo.Visible = true

GateAND = Instance.new("TextLabel")
GateAND.Name = "GateAND"
GateAND.Parent = wireobjframe
GateAND.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateAND.BackgroundTransparency = 0.1
GateAND.BorderColor3 = Color3.new(0, 0, 0)
GateAND.BorderSizePixel = 0
GateAND.Position = UDim2.new(0, 275, 0, 710)
GateAND.Size = UDim2.new(0, 80, 0, 15)
GateAND.TextColor3 = Color3.new(1, 1, 1)
GateAND.Font = Enum.Font.SourceSans
GateAND.FontSize = Enum.FontSize.Size14
GateAND.Text = "AND Gate"
GateAND.TextScaled = true
GateAND.TextSize = 14
GateAND.TextWrapped = true

GateANDItems = Instance.new("TextLabel")
GateANDItems.Name = "GateANDItems"
GateANDItems.Parent = wireobjframe
GateANDItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateANDItems.BackgroundTransparency = 0.1
GateANDItems.BorderColor3 = Color3.new(0, 0, 0)
GateANDItems.BorderSizePixel = 0
GateANDItems.Position = UDim2.new(0, 357, 0, 710)
GateANDItems.Size = UDim2.new(0, 20, 0, 15)
GateANDItems.TextColor3 = Color3.new(1, 1, 1)
GateANDItems.Font = Enum.Font.SourceSans
GateANDItems.FontSize = Enum.FontSize.Size14
GateANDItems.Text = "0"
GateANDItems.TextScaled = true
GateANDItems.TextSize = 14
GateANDItems.TextWrapped = true

GateXORInfo = Instance.new("ImageLabel")
GateXORInfo.BackgroundTransparency = 1
GateXORInfo.Name = "Signal InverterInfo"
GateXORInfo.Parent = wireobjframe
GateXORInfo.BackgroundColor3 = Color3.new(1, 1, 1)
GateXORInfo.Position = UDim2.new(0, 410, 0, 640)
GateXORInfo.Size = UDim2.new(0, 40, 0, 60)
GateXORInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=433439991"
GateXORInfo.Visible = true

GateXOR = Instance.new("TextLabel")
GateXOR.Name = "GateXOR"
GateXOR.Parent = wireobjframe
GateXOR.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateXOR.BackgroundTransparency = 0.1
GateXOR.BorderColor3 = Color3.new(0, 0, 0)
GateXOR.BorderSizePixel = 0
GateXOR.Position = UDim2.new(0, 390, 0, 710)
GateXOR.Size = UDim2.new(0, 80, 0, 15)
GateXOR.TextColor3 = Color3.new(1, 1, 1)
GateXOR.Font = Enum.Font.SourceSans
GateXOR.FontSize = Enum.FontSize.Size14
GateXOR.Text = "XOR Gate"
GateXOR.TextScaled = true
GateXOR.TextSize = 14
GateXOR.TextWrapped = true

GateXORItems = Instance.new("TextLabel")
GateXORItems.Name = "GateXORItems"
GateXORItems.Parent = wireobjframe
GateXORItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GateXORItems.BackgroundTransparency = 0.1
GateXORItems.BorderColor3 = Color3.new(0, 0, 0)
GateXORItems.BorderSizePixel = 0
GateXORItems.Position = UDim2.new(0, 472, 0, 710)
GateXORItems.Size = UDim2.new(0, 20, 0, 15)
GateXORItems.TextColor3 = Color3.new(1, 1, 1)
GateXORItems.Font = Enum.Font.SourceSans
GateXORItems.FontSize = Enum.FontSize.Size14
GateXORItems.Text = "0"
GateXORItems.TextScaled = true
GateXORItems.TextSize = 14
GateXORItems.TextWrapped = true

WoodCheckerInfo = Instance.new("ImageLabel")
WoodCheckerInfo.BackgroundTransparency = 1
WoodCheckerInfo.Name = "WoodCheckerInfo"
WoodCheckerInfo.Parent = wireobjframe
WoodCheckerInfo.BackgroundColor3 = Color3.new(1, 1, 1)
WoodCheckerInfo.Position = UDim2.new(0, 75, 0, 740)
WoodCheckerInfo.Size = UDim2.new(0, 40, 0, 60)
WoodCheckerInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=434522846"
WoodCheckerInfo.Visible = true

WoodChecker = Instance.new("TextLabel")
WoodChecker.Name = "WoodChecker"
WoodChecker.Parent = wireobjframe
WoodChecker.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WoodChecker.BackgroundTransparency = 0.1
WoodChecker.BorderColor3 = Color3.new(0, 0, 0)
WoodChecker.BorderSizePixel = 0
WoodChecker.Position = UDim2.new(0, 45, 0, 810)
WoodChecker.Size = UDim2.new(0, 80, 0, 15)
WoodChecker.TextColor3 = Color3.new(1, 1, 1)
WoodChecker.Font = Enum.Font.SourceSans
WoodChecker.FontSize = Enum.FontSize.Size14
WoodChecker.Text = "Wood Checker"
WoodChecker.TextScaled = true
WoodChecker.TextSize = 14
WoodChecker.TextWrapped = true

WoodCheckerItems = Instance.new("TextLabel")
WoodCheckerItems.Name = "WoodCheckerItems"
WoodCheckerItems.Parent = wireobjframe
WoodCheckerItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WoodCheckerItems.BackgroundTransparency = 0.1
WoodCheckerItems.BorderColor3 = Color3.new(0, 0, 0)
WoodCheckerItems.BorderSizePixel = 0
WoodCheckerItems.Position = UDim2.new(0, 127, 0, 810)
WoodCheckerItems.Size = UDim2.new(0, 20, 0, 15)
WoodCheckerItems.TextColor3 = Color3.new(1, 1, 1)
WoodCheckerItems.Font = Enum.Font.SourceSans
WoodCheckerItems.FontSize = Enum.FontSize.Size14
WoodCheckerItems.Text = "0"
WoodCheckerItems.TextScaled = true
WoodCheckerItems.TextSize = 14
WoodCheckerItems.TextWrapped = true

SignalDelayInfo = Instance.new("ImageLabel")
SignalDelayInfo.BackgroundTransparency = 1
SignalDelayInfo.Name = "SignalDelayInfo"
SignalDelayInfo.Parent = wireobjframe
SignalDelayInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SignalDelayInfo.Position = UDim2.new(0, 190, 0, 740)
SignalDelayInfo.Size = UDim2.new(0, 40, 0, 60)
SignalDelayInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=432748422"
SignalDelayInfo.Visible = true

SignalDelay = Instance.new("TextLabel")
SignalDelay.Name = "SignalDelay"
SignalDelay.Parent = wireobjframe
SignalDelay.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalDelay.BackgroundTransparency = 0.1
SignalDelay.BorderColor3 = Color3.new(0, 0, 0)
SignalDelay.BorderSizePixel = 0
SignalDelay.Position = UDim2.new(0, 160, 0, 810)
SignalDelay.Size = UDim2.new(0, 80, 0, 15)
SignalDelay.TextColor3 = Color3.new(1, 1, 1)
SignalDelay.Font = Enum.Font.SourceSans
SignalDelay.FontSize = Enum.FontSize.Size14
SignalDelay.Text = "Signal Delay"
SignalDelay.TextScaled = true
SignalDelay.TextSize = 14
SignalDelay.TextWrapped = true

SignalDelayItems = Instance.new("TextLabel")
SignalDelayItems.Name = "SignalDelayItems"
SignalDelayItems.Parent = wireobjframe
SignalDelayItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SignalDelayItems.BackgroundTransparency = 0.1
SignalDelayItems.BorderColor3 = Color3.new(0, 0, 0)
SignalDelayItems.BorderSizePixel = 0
SignalDelayItems.Position = UDim2.new(0, 242, 0, 810)
SignalDelayItems.Size = UDim2.new(0, 20, 0, 15)
SignalDelayItems.TextColor3 = Color3.new(1, 1, 1)
SignalDelayItems.Font = Enum.Font.SourceSans
SignalDelayItems.FontSize = Enum.FontSize.Size14
SignalDelayItems.Text = "0"
SignalDelayItems.TextScaled = true
SignalDelayItems.TextSize = 14
SignalDelayItems.TextWrapped = true

FireworkLauncherInfo = Instance.new("ImageLabel")
FireworkLauncherInfo.BackgroundTransparency = 1
FireworkLauncherInfo.Name = "FireworkLauncherInfo"
FireworkLauncherInfo.Parent = wireobjframe
FireworkLauncherInfo.BackgroundColor3 = Color3.new(1, 1, 1)
FireworkLauncherInfo.Position = UDim2.new(0, 300, 0, 740)
FireworkLauncherInfo.Size = UDim2.new(0, 40, 0, 60)
FireworkLauncherInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=862317202"
FireworkLauncherInfo.Visible = true

FireworkLauncher = Instance.new("TextLabel")
FireworkLauncher.Name = "FireworkLauncher"
FireworkLauncher.Parent = wireobjframe
FireworkLauncher.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FireworkLauncher.BackgroundTransparency = 0.1
FireworkLauncher.BorderColor3 = Color3.new(0, 0, 0)
FireworkLauncher.BorderSizePixel = 0
FireworkLauncher.Position = UDim2.new(0, 275, 0, 810)
FireworkLauncher.Size = UDim2.new(0, 80, 0, 15)
FireworkLauncher.TextColor3 = Color3.new(1, 1, 1)
FireworkLauncher.Font = Enum.Font.SourceSans
FireworkLauncher.FontSize = Enum.FontSize.Size14
FireworkLauncher.Text = "Firework Launcher"
FireworkLauncher.TextScaled = true
FireworkLauncher.TextSize = 14
FireworkLauncher.TextWrapped = true

FireworkLauncherItems = Instance.new("TextLabel")
FireworkLauncherItems.Name = "FireworkLauncherItems"
FireworkLauncherItems.Parent = wireobjframe
FireworkLauncherItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
FireworkLauncherItems.BackgroundTransparency = 0.1
FireworkLauncherItems.BorderColor3 = Color3.new(0, 0, 0)
FireworkLauncherItems.BorderSizePixel = 0
FireworkLauncherItems.Position = UDim2.new(0, 357, 0, 810)
FireworkLauncherItems.Size = UDim2.new(0, 20, 0, 15)
FireworkLauncherItems.TextColor3 = Color3.new(1, 1, 1)
FireworkLauncherItems.Font = Enum.Font.SourceSans
FireworkLauncherItems.FontSize = Enum.FontSize.Size14
FireworkLauncherItems.Text = "0"
FireworkLauncherItems.TextScaled = true
FireworkLauncherItems.TextSize = 14
FireworkLauncherItems.TextWrapped = true

ClockSwitchInfo = Instance.new("ImageLabel")
ClockSwitchInfo.BackgroundTransparency = 1
ClockSwitchInfo.Name = "ClockSwitchInfo"
ClockSwitchInfo.Parent = wireobjframe
ClockSwitchInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ClockSwitchInfo.Position = UDim2.new(0, 410, 0, 740)
ClockSwitchInfo.Size = UDim2.new(0, 40, 0, 60)
ClockSwitchInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4915298750"
ClockSwitchInfo.Visible = true

ClockSwitch = Instance.new("TextLabel")
ClockSwitch.Name = "ClockSwitch"
ClockSwitch.Parent = wireobjframe
ClockSwitch.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ClockSwitch.BackgroundTransparency = 0.1
ClockSwitch.BorderColor3 = Color3.new(0, 0, 0)
ClockSwitch.BorderSizePixel = 0
ClockSwitch.Position = UDim2.new(0, 390, 0, 810)
ClockSwitch.Size = UDim2.new(0, 80, 0, 15)
ClockSwitch.TextColor3 = Color3.new(1, 1, 1)
ClockSwitch.Font = Enum.Font.SourceSans
ClockSwitch.FontSize = Enum.FontSize.Size14
ClockSwitch.Text = "Clock Switch"
ClockSwitch.TextScaled = true
ClockSwitch.TextSize = 14
ClockSwitch.TextWrapped = true

ClockSwitchItems = Instance.new("TextLabel")
ClockSwitchItems.Name = "ClockSwitchItems"
ClockSwitchItems.Parent = wireobjframe
ClockSwitchItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ClockSwitchItems.BackgroundTransparency = 0.1
ClockSwitchItems.BorderColor3 = Color3.new(0, 0, 0)
ClockSwitchItems.BorderSizePixel = 0
ClockSwitchItems.Position = UDim2.new(0, 472, 0, 810)
ClockSwitchItems.Size = UDim2.new(0, 20, 0, 15)
ClockSwitchItems.TextColor3 = Color3.new(1, 1, 1)
ClockSwitchItems.Font = Enum.Font.SourceSans
ClockSwitchItems.FontSize = Enum.FontSize.Size14
ClockSwitchItems.Text = "0"
ClockSwitchItems.TextScaled = true
ClockSwitchItems.TextSize = 14
ClockSwitchItems.TextWrapped = true

WorkLightInfo = Instance.new("ImageLabel")
WorkLightInfo.BackgroundTransparency = 1
WorkLightInfo.Name = "WorkLightInfo"
WorkLightInfo.Parent = otherframe
WorkLightInfo.BackgroundColor3 = Color3.new(1, 1, 1)
WorkLightInfo.Position = UDim2.new(0, 75, 0, 40)
WorkLightInfo.Size = UDim2.new(0, 40, 0, 60)
WorkLightInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=273200114"
WorkLightInfo.Visible = true

WorkLight = Instance.new("TextLabel")
WorkLight.Name = "WorkLight"
WorkLight.Parent = otherframe
WorkLight.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WorkLight.BackgroundTransparency = 0.1
WorkLight.BorderColor3 = Color3.new(0, 0, 0)
WorkLight.BorderSizePixel = 0
WorkLight.Position = UDim2.new(0, 45, 0, 110)
WorkLight.Size = UDim2.new(0, 80, 0, 15)
WorkLight.TextColor3 = Color3.new(1, 1, 1)
WorkLight.Font = Enum.Font.SourceSans
WorkLight.FontSize = Enum.FontSize.Size14
WorkLight.Text = "WorkLight"
WorkLight.TextScaled = true
WorkLight.TextSize = 14
WorkLight.TextWrapped = true

WorkLightItems = Instance.new("TextLabel")
WorkLightItems.Name = "WorkLightItems"
WorkLightItems.Parent = otherframe
WorkLightItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
WorkLightItems.BackgroundTransparency = 0.1
WorkLightItems.BorderColor3 = Color3.new(0, 0, 0)
WorkLightItems.BorderSizePixel = 0
WorkLightItems.Position = UDim2.new(0, 127, 0, 110)
WorkLightItems.Size = UDim2.new(0, 20, 0, 15)
WorkLightItems.TextColor3 = Color3.new(1, 1, 1)
WorkLightItems.Font = Enum.Font.SourceSans
WorkLightItems.FontSize = Enum.FontSize.Size14
WorkLightItems.Text = "0"
WorkLightItems.TextScaled = true
WorkLightItems.TextSize = 14
WorkLightItems.TextWrapped = true

BagOfSandInfo = Instance.new("ImageLabel")
BagOfSandInfo.BackgroundTransparency = 1
BagOfSandInfo.Name = "BagOfSandInfo"
BagOfSandInfo.Parent = otherframe
BagOfSandInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BagOfSandInfo.Position = UDim2.new(0, 190, 0, 40)
BagOfSandInfo.Size = UDim2.new(0, 40, 0, 60)
BagOfSandInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275546254"
BagOfSandInfo.Visible = true

BagOfSand = Instance.new("TextLabel")
BagOfSand.Name = "BagOfSand"
BagOfSand.Parent = otherframe
BagOfSand.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfSand.BackgroundTransparency = 0.1
BagOfSand.BorderColor3 = Color3.new(0, 0, 0)
BagOfSand.BorderSizePixel = 0
BagOfSand.Position = UDim2.new(0, 160, 0, 110)
BagOfSand.Size = UDim2.new(0, 80, 0, 15)
BagOfSand.TextColor3 = Color3.new(1, 1, 1)
BagOfSand.Font = Enum.Font.SourceSans
BagOfSand.FontSize = Enum.FontSize.Size14
BagOfSand.Text = "Bag Of Sand"
BagOfSand.TextScaled = true
BagOfSand.TextSize = 14
BagOfSand.TextWrapped = true

BagOfSandItems = Instance.new("TextLabel")
BagOfSandItems.Name = "BagOfSandItems"
BagOfSandItems.Parent = otherframe
BagOfSandItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfSandItems.BackgroundTransparency = 0.1
BagOfSandItems.BorderColor3 = Color3.new(0, 0, 0)
BagOfSandItems.BorderSizePixel = 0
BagOfSandItems.Position = UDim2.new(0, 242, 0, 110)
BagOfSandItems.Size = UDim2.new(0, 20, 0, 15)
BagOfSandItems.TextColor3 = Color3.new(1, 1, 1)
BagOfSandItems.Font = Enum.Font.SourceSans
BagOfSandItems.FontSize = Enum.FontSize.Size14
BagOfSandItems.Text = "0"
BagOfSandItems.TextScaled = true
BagOfSandItems.TextSize = 14
BagOfSandItems.TextWrapped = true

CanOfWormsInfo = Instance.new("ImageLabel")
CanOfWormsInfo.BackgroundTransparency = 1
CanOfWormsInfo.Name = "CanOfWormsInfo"
CanOfWormsInfo.Parent = otherframe
CanOfWormsInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CanOfWormsInfo.Position = UDim2.new(0, 300, 0, 40)
CanOfWormsInfo.Size = UDim2.new(0, 40, 0, 60)
CanOfWormsInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275546678"
CanOfWormsInfo.Visible = true

CanOfWorms = Instance.new("TextLabel")
CanOfWorms.Name = "CanOfWorms"
CanOfWorms.Parent = otherframe
CanOfWorms.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CanOfWorms.BackgroundTransparency = 0.1
CanOfWorms.BorderColor3 = Color3.new(0, 0, 0)
CanOfWorms.BorderSizePixel = 0
CanOfWorms.Position = UDim2.new(0, 275, 0, 110)
CanOfWorms.Size = UDim2.new(0, 80, 0, 15)
CanOfWorms.TextColor3 = Color3.new(1, 1, 1)
CanOfWorms.Font = Enum.Font.SourceSans
CanOfWorms.FontSize = Enum.FontSize.Size14
CanOfWorms.Text = "Can Of Worms"
CanOfWorms.TextScaled = true
CanOfWorms.TextSize = 14
CanOfWorms.TextWrapped = true

CanOfWormsItems = Instance.new("TextLabel")
CanOfWormsItems.Name = "CanOfWormsItems"
CanOfWormsItems.Parent = otherframe
CanOfWormsItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CanOfWormsItems.BackgroundTransparency = 0.1
CanOfWormsItems.BorderColor3 = Color3.new(0, 0, 0)
CanOfWormsItems.BorderSizePixel = 0
CanOfWormsItems.Position = UDim2.new(0, 357, 0, 110)
CanOfWormsItems.Size = UDim2.new(0, 20, 0, 15)
CanOfWormsItems.TextColor3 = Color3.new(1, 1, 1)
CanOfWormsItems.Font = Enum.Font.SourceSans
CanOfWormsItems.FontSize = Enum.FontSize.Size14
CanOfWormsItems.Text = "0"
CanOfWormsItems.TextScaled = true
CanOfWormsItems.TextSize = 14
CanOfWormsItems.TextWrapped = true

LightBulbInfo = Instance.new("ImageLabel")
LightBulbInfo.BackgroundTransparency = 1
LightBulbInfo.Name = "LightBulbInfo"
LightBulbInfo.Parent = otherframe
LightBulbInfo.BackgroundColor3 = Color3.new(1, 1, 1)
LightBulbInfo.Position = UDim2.new(0, 410, 0, 40)
LightBulbInfo.Size = UDim2.new(0, 40, 0, 60)
LightBulbInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=275547421"
LightBulbInfo.Visible = true

LightBulb = Instance.new("TextLabel")
LightBulb.Name = "LightBulb"
LightBulb.Parent = otherframe
LightBulb.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LightBulb.BackgroundTransparency = 0.1
LightBulb.BorderColor3 = Color3.new(0, 0, 0)
LightBulb.BorderSizePixel = 0
LightBulb.Position = UDim2.new(0, 390, 0, 110)
LightBulb.Size = UDim2.new(0, 80, 0, 15)
LightBulb.TextColor3 = Color3.new(1, 1, 1)
LightBulb.Font = Enum.Font.SourceSans
LightBulb.FontSize = Enum.FontSize.Size14
LightBulb.Text = "Light Bulb"
LightBulb.TextScaled = true
LightBulb.TextSize = 14
LightBulb.TextWrapped = true

LightBulbItems = Instance.new("TextLabel")
LightBulbItems.Name = "LightBulbItems"
LightBulbItems.Parent = otherframe
LightBulbItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LightBulbItems.BackgroundTransparency = 0.1
LightBulbItems.BorderColor3 = Color3.new(0, 0, 0)
LightBulbItems.BorderSizePixel = 0
LightBulbItems.Position = UDim2.new(0, 472, 0, 110)
LightBulbItems.Size = UDim2.new(0, 20, 0, 15)
LightBulbItems.TextColor3 = Color3.new(1, 1, 1)
LightBulbItems.Font = Enum.Font.SourceSans
LightBulbItems.FontSize = Enum.FontSize.Size14
LightBulbItems.Text = "0"
LightBulbItems.TextScaled = true
LightBulbItems.TextSize = 14
LightBulbItems.TextWrapped = true

DynamiteInfo = Instance.new("ImageLabel")
DynamiteInfo.BackgroundTransparency = 1
DynamiteInfo.Name = "DynamiteInfo"
DynamiteInfo.Parent = otherframe
DynamiteInfo.BackgroundColor3 = Color3.new(1, 1, 1)
DynamiteInfo.Position = UDim2.new(0, 75, 0, 140)
DynamiteInfo.Size = UDim2.new(0, 40, 0, 60)
DynamiteInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=280206081"
DynamiteInfo.Visible = true

Dynamite = Instance.new("TextLabel")
Dynamite.Name = "Dynamite"
Dynamite.Parent = otherframe
Dynamite.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Dynamite.BackgroundTransparency = 0.1
Dynamite.BorderColor3 = Color3.new(0, 0, 0)
Dynamite.BorderSizePixel = 0
Dynamite.Position = UDim2.new(0, 45, 0, 210)
Dynamite.Size = UDim2.new(0, 80, 0, 15)
Dynamite.TextColor3 = Color3.new(1, 1, 1)
Dynamite.Font = Enum.Font.SourceSans
Dynamite.FontSize = Enum.FontSize.Size14
Dynamite.Text = "Dynamite"
Dynamite.TextScaled = true
Dynamite.TextSize = 14
Dynamite.TextWrapped = true

DynamiteItems = Instance.new("TextLabel")
DynamiteItems.Name = "DynamiteItems"
DynamiteItems.Parent = otherframe
DynamiteItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
DynamiteItems.BackgroundTransparency = 0.1
DynamiteItems.BorderColor3 = Color3.new(0, 0, 0)
DynamiteItems.BorderSizePixel = 0
DynamiteItems.Position = UDim2.new(0, 127, 0, 210)
DynamiteItems.Size = UDim2.new(0, 20, 0, 15)
DynamiteItems.TextColor3 = Color3.new(1, 1, 1)
DynamiteItems.Font = Enum.Font.SourceSans
DynamiteItems.FontSize = Enum.FontSize.Size14
DynamiteItems.Text = "0"
DynamiteItems.TextScaled = true
DynamiteItems.TextSize = 14
DynamiteItems.TextWrapped = true

PumpkinClassicInfo = Instance.new("ImageLabel")
PumpkinClassicInfo.BackgroundTransparency = 1
PumpkinClassicInfo.Name = "PumpkinClassicInfo"
PumpkinClassicInfo.Parent = otherframe
PumpkinClassicInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinClassicInfo.Position = UDim2.new(0, 190, 0, 140)
PumpkinClassicInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinClassicInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=305594944"
PumpkinClassicInfo.Visible = true

PumpkinClassic = Instance.new("TextLabel")
PumpkinClassic.Name = "PumpkinClassic"
PumpkinClassic.Parent = otherframe
PumpkinClassic.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinClassic.BackgroundTransparency = 0.1
PumpkinClassic.BorderColor3 = Color3.new(0, 0, 0)
PumpkinClassic.BorderSizePixel = 0
PumpkinClassic.Position = UDim2.new(0, 160, 0, 210)
PumpkinClassic.Size = UDim2.new(0, 80, 0, 15)
PumpkinClassic.TextColor3 = Color3.new(1, 1, 1)
PumpkinClassic.Font = Enum.Font.SourceSans
PumpkinClassic.FontSize = Enum.FontSize.Size14
PumpkinClassic.Text = "Pumpkin Classic"
PumpkinClassic.TextScaled = true
PumpkinClassic.TextSize = 14
PumpkinClassic.TextWrapped = true

PumpkinClassicItems = Instance.new("TextLabel")
PumpkinClassicItems.Name = "PumpkinClassicItems"
PumpkinClassicItems.Parent = otherframe
PumpkinClassicItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinClassicItems.BackgroundTransparency = 0.1
PumpkinClassicItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinClassicItems.BorderSizePixel = 0
PumpkinClassicItems.Position = UDim2.new(0, 242, 0, 210)
PumpkinClassicItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinClassicItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinClassicItems.Font = Enum.Font.SourceSans
PumpkinClassicItems.FontSize = Enum.FontSize.Size14
PumpkinClassicItems.Text = "0"
PumpkinClassicItems.TextScaled = true
PumpkinClassicItems.TextSize = 14
PumpkinClassicItems.TextWrapped = true

BlueBaiiInfo = Instance.new("ImageLabel")
BlueBaiiInfo.BackgroundTransparency = 1
BlueBaiiInfo.Name = "BlueBaiiInfo"
BlueBaiiInfo.Parent = otherframe
BlueBaiiInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BlueBaiiInfo.Position = UDim2.new(0, 300, 0, 140)
BlueBaiiInfo.Size = UDim2.new(0, 40, 0, 60)
BlueBaiiInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566106275"
BlueBaiiInfo.Visible = true

BlueBaii = Instance.new("TextLabel")
BlueBaii.Name = "BlueBaii"
BlueBaii.Parent = otherframe
BlueBaii.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlueBaii.BackgroundTransparency = 0.1
BlueBaii.BorderColor3 = Color3.new(0, 0, 0)
BlueBaii.BorderSizePixel = 0
BlueBaii.Position = UDim2.new(0, 275, 0, 210)
BlueBaii.Size = UDim2.new(0, 80, 0, 15)
BlueBaii.TextColor3 = Color3.new(1, 1, 1)
BlueBaii.Font = Enum.Font.SourceSans
BlueBaii.FontSize = Enum.FontSize.Size14
BlueBaii.Text = "Blue Baii"
BlueBaii.TextScaled = true
BlueBaii.TextSize = 14
BlueBaii.TextWrapped = true

BlueBaiiItems = Instance.new("TextLabel")
BlueBaiiItems.Name = "BlueBaiiItems"
BlueBaiiItems.Parent = otherframe
BlueBaiiItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlueBaiiItems.BackgroundTransparency = 0.1
BlueBaiiItems.BorderColor3 = Color3.new(0, 0, 0)
BlueBaiiItems.BorderSizePixel = 0
BlueBaiiItems.Position = UDim2.new(0, 357, 0, 210)
BlueBaiiItems.Size = UDim2.new(0, 20, 0, 15)
BlueBaiiItems.TextColor3 = Color3.new(1, 1, 1)
BlueBaiiItems.Font = Enum.Font.SourceSans
BlueBaiiItems.FontSize = Enum.FontSize.Size14
BlueBaiiItems.Text = "0"
BlueBaiiItems.TextScaled = true
BlueBaiiItems.TextSize = 14
BlueBaiiItems.TextWrapped = true

BobbleheadInfo = Instance.new("ImageLabel")
BobbleheadInfo.BackgroundTransparency = 1
BobbleheadInfo.Name = "BobbleheadInfo"
BobbleheadInfo.Parent = otherframe
BobbleheadInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BobbleheadInfo.Position = UDim2.new(0, 410, 0, 140)
BobbleheadInfo.Size = UDim2.new(0, 40, 0, 60)
BobbleheadInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=331930695"
BobbleheadInfo.Visible = true

Bobblehead = Instance.new("TextLabel")
Bobblehead.Name = "Bobblehead"
Bobblehead.Parent = otherframe
Bobblehead.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead.BackgroundTransparency = 0.1
Bobblehead.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead.BorderSizePixel = 0
Bobblehead.Position = UDim2.new(0, 390, 0, 210)
Bobblehead.Size = UDim2.new(0, 80, 0, 15)
Bobblehead.TextColor3 = Color3.new(1, 1, 1)
Bobblehead.Font = Enum.Font.SourceSans
Bobblehead.FontSize = Enum.FontSize.Size14
Bobblehead.Text = "Bobble head"
Bobblehead.TextScaled = true
Bobblehead.TextSize = 14
Bobblehead.TextWrapped = true

BobbleheadItems = Instance.new("TextLabel")
BobbleheadItems.Name = "BobbleheadItems"
BobbleheadItems.Parent = otherframe
BobbleheadItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BobbleheadItems.BackgroundTransparency = 0.1
BobbleheadItems.BorderColor3 = Color3.new(0, 0, 0)
BobbleheadItems.BorderSizePixel = 0
BobbleheadItems.Position = UDim2.new(0, 472, 0, 210)
BobbleheadItems.Size = UDim2.new(0, 20, 0, 15)
BobbleheadItems.TextColor3 = Color3.new(1, 1, 1)
BobbleheadItems.Font = Enum.Font.SourceSans
BobbleheadItems.FontSize = Enum.FontSize.Size14
BobbleheadItems.Text = "0"
BobbleheadItems.TextScaled = true
BobbleheadItems.TextSize = 14
BobbleheadItems.TextWrapped = true

SporkInfo = Instance.new("ImageLabel")
SporkInfo.BackgroundTransparency = 1
SporkInfo.Name = "SporkInfo"
SporkInfo.Parent = otherframe
SporkInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SporkInfo.Position = UDim2.new(0, 75, 0, 240)
SporkInfo.Size = UDim2.new(0, 40, 0, 60)
SporkInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=333645984"
SporkInfo.Visible = true

Spork = Instance.new("TextLabel")
Spork.Name = "Spork"
Spork.Parent = otherframe
Spork.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Spork.BackgroundTransparency = 0.1
Spork.BorderColor3 = Color3.new(0, 0, 0)
Spork.BorderSizePixel = 0
Spork.Position = UDim2.new(0, 45, 0, 310)
Spork.Size = UDim2.new(0, 80, 0, 15)
Spork.TextColor3 = Color3.new(1, 1, 1)
Spork.Font = Enum.Font.SourceSans
Spork.FontSize = Enum.FontSize.Size14
Spork.Text = "Spork"
Spork.TextScaled = true
Spork.TextSize = 14
Spork.TextWrapped = true

SporkItems = Instance.new("TextLabel")
SporkItems.Name = "SporkItems"
SporkItems.Parent = otherframe
SporkItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SporkItems.BackgroundTransparency = 0.1
SporkItems.BorderColor3 = Color3.new(0, 0, 0)
SporkItems.BorderSizePixel = 0
SporkItems.Position = UDim2.new(0, 127, 0, 310)
SporkItems.Size = UDim2.new(0, 20, 0, 15)
SporkItems.TextColor3 = Color3.new(1, 1, 1)
SporkItems.Font = Enum.Font.SourceSans
SporkItems.FontSize = Enum.FontSize.Size14
SporkItems.Text = "0"
SporkItems.TextScaled = true
SporkItems.TextSize = 14
SporkItems.TextWrapped = true

CoalLumpInfo = Instance.new("ImageLabel")
CoalLumpInfo.BackgroundTransparency = 1
CoalLumpInfo.Name = "CoalLumpInfo"
CoalLumpInfo.Parent = otherframe
CoalLumpInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CoalLumpInfo.Position = UDim2.new(0, 190, 0, 240)
CoalLumpInfo.Size = UDim2.new(0, 40, 0, 60)
CoalLumpInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=333645984"
CoalLumpInfo.Visible = true

CoalLump = Instance.new("TextLabel")
CoalLump.Name = "CoalLump"
CoalLump.Parent = otherframe
CoalLump.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CoalLump.BackgroundTransparency = 0.1
CoalLump.BorderColor3 = Color3.new(0, 0, 0)
CoalLump.BorderSizePixel = 0
CoalLump.Position = UDim2.new(0, 160, 0, 310)
CoalLump.Size = UDim2.new(0, 80, 0, 15)
CoalLump.TextColor3 = Color3.new(1, 1, 1)
CoalLump.Font = Enum.Font.SourceSans
CoalLump.FontSize = Enum.FontSize.Size14
CoalLump.Text = "Coal Lump"
CoalLump.TextScaled = true
CoalLump.TextSize = 14
CoalLump.TextWrapped = true

CoalLumpItems = Instance.new("TextLabel")
CoalLumpItems.Name = "CoalLumpItems"
CoalLumpItems.Parent = otherframe
CoalLumpItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CoalLumpItems.BackgroundTransparency = 0.1
CoalLumpItems.BorderColor3 = Color3.new(0, 0, 0)
CoalLumpItems.BorderSizePixel = 0
CoalLumpItems.Position = UDim2.new(0, 242, 0, 310)
CoalLumpItems.Size = UDim2.new(0, 20, 0, 15)
CoalLumpItems.TextColor3 = Color3.new(1, 1, 1)
CoalLumpItems.Font = Enum.Font.SourceSans
CoalLumpItems.FontSize = Enum.FontSize.Size14
CoalLumpItems.Text = "0"
CoalLumpItems.TextScaled = true
CoalLumpItems.TextSize = 14
CoalLumpItems.TextWrapped = true

RedBallInfo = Instance.new("ImageLabel")
RedBallInfo.BackgroundTransparency = 1
RedBallInfo.Name = "RedBallInfo"
RedBallInfo.Parent = otherframe
RedBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
RedBallInfo.Position = UDim2.new(0, 300, 0, 240)
RedBallInfo.Size = UDim2.new(0, 40, 0, 60)
RedBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=335426163"
RedBallInfo.Visible = true

RedBall = Instance.new("TextLabel")
RedBall.Name = "RedBall"
RedBall.Parent = otherframe
RedBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RedBall.BackgroundTransparency = 0.1
RedBall.BorderColor3 = Color3.new(0, 0, 0)
RedBall.BorderSizePixel = 0
RedBall.Position = UDim2.new(0, 275, 0, 310)
RedBall.Size = UDim2.new(0, 80, 0, 15)
RedBall.TextColor3 = Color3.new(1, 1, 1)
RedBall.Font = Enum.Font.SourceSans
RedBall.FontSize = Enum.FontSize.Size14
RedBall.Text = "Red Ball"
RedBall.TextScaled = true
RedBall.TextSize = 14
RedBall.TextWrapped = true

RedBallItems = Instance.new("TextLabel")
RedBallItems.Name = "RedBallItems"
RedBallItems.Parent = otherframe
RedBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
RedBallItems.BackgroundTransparency = 0.1
RedBallItems.BorderColor3 = Color3.new(0, 0, 0)
RedBallItems.BorderSizePixel = 0
RedBallItems.Position = UDim2.new(0, 357, 0, 310)
RedBallItems.Size = UDim2.new(0, 20, 0, 15)
RedBallItems.TextColor3 = Color3.new(1, 1, 1)
RedBallItems.Font = Enum.Font.SourceSans
RedBallItems.FontSize = Enum.FontSize.Size14
RedBallItems.Text = "0"
RedBallItems.TextScaled = true
RedBallItems.TextSize = 14
RedBallItems.TextWrapped = true

PumpkinDarkInfo = Instance.new("ImageLabel")
PumpkinDarkInfo.BackgroundTransparency = 1
PumpkinDarkInfo.Name = "PumpkinDarkInfo"
PumpkinDarkInfo.Parent = otherframe
PumpkinDarkInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinDarkInfo.Position = UDim2.new(0, 410, 0, 240)
PumpkinDarkInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinDarkInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=508647156"
PumpkinDarkInfo.Visible = true

PumpkinDark = Instance.new("TextLabel")
PumpkinDark.Name = "PumpkinDark"
PumpkinDark.Parent = otherframe
PumpkinDark.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinDark.BackgroundTransparency = 0.1
PumpkinDark.BorderColor3 = Color3.new(0, 0, 0)
PumpkinDark.BorderSizePixel = 0
PumpkinDark.Position = UDim2.new(0, 390, 0, 310)
PumpkinDark.Size = UDim2.new(0, 80, 0, 15)
PumpkinDark.TextColor3 = Color3.new(1, 1, 1)
PumpkinDark.Font = Enum.Font.SourceSans
PumpkinDark.FontSize = Enum.FontSize.Size14
PumpkinDark.Text = "Pumpkin Dark"
PumpkinDark.TextScaled = true
PumpkinDark.TextSize = 14
PumpkinDark.TextWrapped = true

PumpkinDarkItems = Instance.new("TextLabel")
PumpkinDarkItems.Name = "PumpkinDarkItems"
PumpkinDarkItems.Parent = otherframe
PumpkinDarkItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinDarkItems.BackgroundTransparency = 0.1
PumpkinDarkItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinDarkItems.BorderSizePixel = 0
PumpkinDarkItems.Position = UDim2.new(0, 472, 0, 310)
PumpkinDarkItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinDarkItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinDarkItems.Font = Enum.Font.SourceSans
PumpkinDarkItems.FontSize = Enum.FontSize.Size14
PumpkinDarkItems.Text = "0"
PumpkinDarkItems.TextScaled = true
PumpkinDarkItems.TextSize = 14
PumpkinDarkItems.TextWrapped = true

Eye1Info = Instance.new("ImageLabel")
Eye1Info.BackgroundTransparency = 1
Eye1Info.Name = "Eye1Info"
Eye1Info.Parent = otherframe
Eye1Info.BackgroundColor3 = Color3.new(1, 1, 1)
Eye1Info.Position = UDim2.new(0, 75, 0, 340)
Eye1Info.Size = UDim2.new(0, 40, 0, 60)
Eye1Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=509057097"
Eye1Info.Visible = true

Eye1 = Instance.new("TextLabel")
Eye1.Name = "Eye1"
Eye1.Parent = otherframe
Eye1.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Eye1.BackgroundTransparency = 0.1
Eye1.BorderColor3 = Color3.new(0, 0, 0)
Eye1.BorderSizePixel = 0
Eye1.Position = UDim2.new(0, 45, 0, 410)
Eye1.Size = UDim2.new(0, 80, 0, 15)
Eye1.TextColor3 = Color3.new(1, 1, 1)
Eye1.Font = Enum.Font.SourceSans
Eye1.FontSize = Enum.FontSize.Size14
Eye1.Text = "Eye"
Eye1.TextScaled = true
Eye1.TextSize = 14
Eye1.TextWrapped = true

Eye1Items = Instance.new("TextLabel")
Eye1Items.Name = "Eye1Items"
Eye1Items.Parent = otherframe
Eye1Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Eye1Items.BackgroundTransparency = 0.1
Eye1Items.BorderColor3 = Color3.new(0, 0, 0)
Eye1Items.BorderSizePixel = 0
Eye1Items.Position = UDim2.new(0, 127, 0, 410)
Eye1Items.Size = UDim2.new(0, 20, 0, 15)
Eye1Items.TextColor3 = Color3.new(1, 1, 1)
Eye1Items.Font = Enum.Font.SourceSans
Eye1Items.FontSize = Enum.FontSize.Size14
Eye1Items.Text = "0"
Eye1Items.TextScaled = true
Eye1Items.TextSize = 14
Eye1Items.TextWrapped = true

TurkeyInfo = Instance.new("ImageLabel")
TurkeyInfo.BackgroundTransparency = 1
TurkeyInfo.Name = "TurkeyInfo"
TurkeyInfo.Parent = otherframe
TurkeyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TurkeyInfo.Position = UDim2.new(0, 190, 0, 340)
TurkeyInfo.Size = UDim2.new(0, 40, 0, 60)
TurkeyInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=552659668"
TurkeyInfo.Visible = true

Turkey = Instance.new("TextLabel")
Turkey.Name = "Turkey"
Turkey.Parent = otherframe
Turkey.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey.BackgroundTransparency = 0.1
Turkey.BorderColor3 = Color3.new(0, 0, 0)
Turkey.BorderSizePixel = 0
Turkey.Position = UDim2.new(0, 160, 0, 410)
Turkey.Size = UDim2.new(0, 80, 0, 15)
Turkey.TextColor3 = Color3.new(1, 1, 1)
Turkey.Font = Enum.Font.SourceSans
Turkey.FontSize = Enum.FontSize.Size14
Turkey.Text = "Turkey"
Turkey.TextScaled = true
Turkey.TextSize = 14
Turkey.TextWrapped = true

TurkeyItems = Instance.new("TextLabel")
TurkeyItems.Name = "TurkeyItems"
TurkeyItems.Parent = otherframe
TurkeyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TurkeyItems.BackgroundTransparency = 0.1
TurkeyItems.BorderColor3 = Color3.new(0, 0, 0)
TurkeyItems.BorderSizePixel = 0
TurkeyItems.Position = UDim2.new(0, 242, 0, 410)
TurkeyItems.Size = UDim2.new(0, 20, 0, 15)
TurkeyItems.TextColor3 = Color3.new(1, 1, 1)
TurkeyItems.Font = Enum.Font.SourceSans
TurkeyItems.FontSize = Enum.FontSize.Size14
TurkeyItems.Text = "0"
TurkeyItems.TextScaled = true
TurkeyItems.TextSize = 14
TurkeyItems.TextWrapped = true

Bobblehead2Info = Instance.new("ImageLabel")
Bobblehead2Info.BackgroundTransparency = 1
Bobblehead2Info.Name = "Bobblehead2Info"
Bobblehead2Info.Parent = otherframe
Bobblehead2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead2Info.Position = UDim2.new(0, 300, 0, 340)
Bobblehead2Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566085499"
Bobblehead2Info.Visible = true

Bobblehead2 = Instance.new("TextLabel")
Bobblehead2.Name = "Bobblehead2"
Bobblehead2.Parent = otherframe
Bobblehead2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead2.BackgroundTransparency = 0.1
Bobblehead2.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead2.BorderSizePixel = 0
Bobblehead2.Position = UDim2.new(0, 275, 0, 410)
Bobblehead2.Size = UDim2.new(0, 80, 0, 15)
Bobblehead2.TextColor3 = Color3.new(1, 1, 1)
Bobblehead2.Font = Enum.Font.SourceSans
Bobblehead2.FontSize = Enum.FontSize.Size14
Bobblehead2.Text = "Wobblierbobblier"
Bobblehead2.TextScaled = true
Bobblehead2.TextSize = 14
Bobblehead2.TextWrapped = true

Bobblehead2Items = Instance.new("TextLabel")
Bobblehead2Items.Name = "Bobblehead2Items"
Bobblehead2Items.Parent = otherframe
Bobblehead2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead2Items.BackgroundTransparency = 0.1
Bobblehead2Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead2Items.BorderSizePixel = 0
Bobblehead2Items.Position = UDim2.new(0, 357, 0, 410)
Bobblehead2Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead2Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead2Items.Font = Enum.Font.SourceSans
Bobblehead2Items.FontSize = Enum.FontSize.Size14
Bobblehead2Items.Text = "0"
Bobblehead2Items.TextScaled = true
Bobblehead2Items.TextSize = 14
Bobblehead2Items.TextWrapped = true

BlueBallInfo = Instance.new("ImageLabel")
BlueBallInfo.BackgroundTransparency = 1
BlueBallInfo.Name = "BlueBallInfo"
BlueBallInfo.Parent = otherframe
BlueBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BlueBallInfo.Position = UDim2.new(0, 410, 0, 340)
BlueBallInfo.Size = UDim2.new(0, 40, 0, 60)
BlueBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=566106275"
BlueBallInfo.Visible = true

BlueBall = Instance.new("TextLabel")
BlueBall.Name = "BlueBall"
BlueBall.Parent = otherframe
BlueBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlueBall.BackgroundTransparency = 0.1
BlueBall.BorderColor3 = Color3.new(0, 0, 0)
BlueBall.BorderSizePixel = 0
BlueBall.Position = UDim2.new(0, 390, 0, 410)
BlueBall.Size = UDim2.new(0, 80, 0, 15)
BlueBall.TextColor3 = Color3.new(1, 1, 1)
BlueBall.Font = Enum.Font.SourceSans
BlueBall.FontSize = Enum.FontSize.Size14
BlueBall.Text = "Blue Ball"
BlueBall.TextScaled = true
BlueBall.TextSize = 14
BlueBall.TextWrapped = true

BlueBallItems = Instance.new("TextLabel")
BlueBallItems.Name = "BlueBallItems"
BlueBallItems.Parent = otherframe
BlueBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlueBallItems.BackgroundTransparency = 0.1
BlueBallItems.BorderColor3 = Color3.new(0, 0, 0)
BlueBallItems.BorderSizePixel = 0
BlueBallItems.Position = UDim2.new(0, 472, 0, 410)
BlueBallItems.Size = UDim2.new(0, 20, 0, 15)
BlueBallItems.TextColor3 = Color3.new(1, 1, 1)
BlueBallItems.Font = Enum.Font.SourceSans
BlueBallItems.FontSize = Enum.FontSize.Size14
BlueBallItems.Text = "0"
BlueBallItems.TextScaled = true
BlueBallItems.TextSize = 14
BlueBallItems.TextWrapped = true

PumpkinGreenInfo = Instance.new("ImageLabel")
PumpkinGreenInfo.BackgroundTransparency = 1
PumpkinGreenInfo.Name = "PumpkinGreenInfo"
PumpkinGreenInfo.Parent = otherframe
PumpkinGreenInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinGreenInfo.Position = UDim2.new(0, 75, 0, 440)
PumpkinGreenInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinGreenInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1065892926"
PumpkinGreenInfo.Visible = true

PumpkinGreen = Instance.new("TextLabel")
PumpkinGreen.Name = "PumpkinGreen"
PumpkinGreen.Parent = otherframe
PumpkinGreen.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinGreen.BackgroundTransparency = 0.1
PumpkinGreen.BorderColor3 = Color3.new(0, 0, 0)
PumpkinGreen.BorderSizePixel = 0
PumpkinGreen.Position = UDim2.new(0, 45, 0, 510)
PumpkinGreen.Size = UDim2.new(0, 80, 0, 15)
PumpkinGreen.TextColor3 = Color3.new(1, 1, 1)
PumpkinGreen.Font = Enum.Font.SourceSans
PumpkinGreen.FontSize = Enum.FontSize.Size14
PumpkinGreen.Text = "Pumpkin Green"
PumpkinGreen.TextScaled = true
PumpkinGreen.TextSize = 14
PumpkinGreen.TextWrapped = true

PumpkinGreenItems = Instance.new("TextLabel")
PumpkinGreenItems.Name = "PumpkinGreenItems"
PumpkinGreenItems.Parent = otherframe
PumpkinGreenItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinGreenItems.BackgroundTransparency = 0.1
PumpkinGreenItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinGreenItems.BorderSizePixel = 0
PumpkinGreenItems.Position = UDim2.new(0, 127, 0, 510)
PumpkinGreenItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinGreenItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinGreenItems.Font = Enum.Font.SourceSans
PumpkinGreenItems.FontSize = Enum.FontSize.Size14
PumpkinGreenItems.Text = "0"
PumpkinGreenItems.TextScaled = true
PumpkinGreenItems.TextSize = 14
PumpkinGreenItems.TextWrapped = true

Turkey2Info = Instance.new("ImageLabel")
Turkey2Info.BackgroundTransparency = 1
Turkey2Info.Name = "Turkey2Info"
Turkey2Info.Parent = otherframe
Turkey2Info.BackgroundColor3 = Color3.new(1, 1, 1)
Turkey2Info.Position = UDim2.new(0, 190, 0, 440)
Turkey2Info.Size = UDim2.new(0, 40, 0, 60)
Turkey2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1185714682"
Turkey2Info.Visible = true

Turkey2 = Instance.new("TextLabel")
Turkey2.Name = "Turkey2"
Turkey2.Parent = otherframe
Turkey2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey2.BackgroundTransparency = 0.1
Turkey2.BorderColor3 = Color3.new(0, 0, 0)
Turkey2.BorderSizePixel = 0
Turkey2.Position = UDim2.new(0, 160, 0, 510)
Turkey2.Size = UDim2.new(0, 80, 0, 15)
Turkey2.TextColor3 = Color3.new(1, 1, 1)
Turkey2.Font = Enum.Font.SourceSans
Turkey2.FontSize = Enum.FontSize.Size14
Turkey2.Text = "Blue Bone Turkey"
Turkey2.TextScaled = true
Turkey2.TextSize = 14
Turkey2.TextWrapped = true

Turkey2Items = Instance.new("TextLabel")
Turkey2Items.Name = "Turkey2Items"
Turkey2Items.Parent = otherframe
Turkey2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey2Items.BackgroundTransparency = 0.1
Turkey2Items.BorderColor3 = Color3.new(0, 0, 0)
Turkey2Items.BorderSizePixel = 0
Turkey2Items.Position = UDim2.new(0, 242, 0, 510)
Turkey2Items.Size = UDim2.new(0, 20, 0, 15)
Turkey2Items.TextColor3 = Color3.new(1, 1, 1)
Turkey2Items.Font = Enum.Font.SourceSans
Turkey2Items.FontSize = Enum.FontSize.Size14
Turkey2Items.Text = "0"
Turkey2Items.TextScaled = true
Turkey2Items.TextSize = 14
Turkey2Items.TextWrapped = true

Bobblehead3Info = Instance.new("ImageLabel")
Bobblehead3Info.BackgroundTransparency = 1
Bobblehead3Info.Name = "Bobblehead3Info"
Bobblehead3Info.Parent = otherframe
Bobblehead3Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead3Info.Position = UDim2.new(0, 300, 0, 440)
Bobblehead3Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211512937"
Bobblehead3Info.Visible = true

Bobblehead3 = Instance.new("TextLabel")
Bobblehead3.Name = "Bobblehead3"
Bobblehead3.Parent = otherframe
Bobblehead3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead3.BackgroundTransparency = 0.1
Bobblehead3.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead3.BorderSizePixel = 0
Bobblehead3.Position = UDim2.new(0, 275, 0, 510)
Bobblehead3.Size = UDim2.new(0, 80, 0, 15)
Bobblehead3.TextColor3 = Color3.new(1, 1, 1)
Bobblehead3.Font = Enum.Font.SourceSans
Bobblehead3.FontSize = Enum.FontSize.Size14
Bobblehead3.Text = "Bobbily Wobbily"
Bobblehead3.TextScaled = true
Bobblehead3.TextSize = 14
Bobblehead3.TextWrapped = true

Bobblehead3Items = Instance.new("TextLabel")
Bobblehead3Items.Name = "Bobblehead3Items"
Bobblehead3Items.Parent = otherframe
Bobblehead3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead3Items.BackgroundTransparency = 0.1
Bobblehead3Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead3Items.BorderSizePixel = 0
Bobblehead3Items.Position = UDim2.new(0, 357, 0, 510)
Bobblehead3Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead3Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead3Items.Font = Enum.Font.SourceSans
Bobblehead3Items.FontSize = Enum.FontSize.Size14
Bobblehead3Items.Text = "0"
Bobblehead3Items.TextScaled = true
Bobblehead3Items.TextSize = 14
Bobblehead3Items.TextWrapped = true

GreenBallInfo = Instance.new("ImageLabel")
GreenBallInfo.BackgroundTransparency = 1
GreenBallInfo.Name = "GreenBallInfo"
GreenBallInfo.Parent = otherframe
GreenBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
GreenBallInfo.Position = UDim2.new(0, 410, 0, 440)
GreenBallInfo.Size = UDim2.new(0, 40, 0, 60)
GreenBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211509291"
GreenBallInfo.Visible = true

GreenBall = Instance.new("TextLabel")
GreenBall.Name = "GreenBall"
GreenBall.Parent = otherframe
GreenBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GreenBall.BackgroundTransparency = 0.1
GreenBall.BorderColor3 = Color3.new(0, 0, 0)
GreenBall.BorderSizePixel = 0
GreenBall.Position = UDim2.new(0, 390, 0, 510)
GreenBall.Size = UDim2.new(0, 80, 0, 15)
GreenBall.TextColor3 = Color3.new(1, 1, 1)
GreenBall.Font = Enum.Font.SourceSans
GreenBall.FontSize = Enum.FontSize.Size14
GreenBall.Text = "Green Ball"
GreenBall.TextScaled = true
GreenBall.TextSize = 14
GreenBall.TextWrapped = true

GreenBallItems = Instance.new("TextLabel")
GreenBallItems.Name = "GreenBallItems"
GreenBallItems.Parent = otherframe
GreenBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
GreenBallItems.BackgroundTransparency = 0.1
GreenBallItems.BorderColor3 = Color3.new(0, 0, 0)
GreenBallItems.BorderSizePixel = 0
GreenBallItems.Position = UDim2.new(0, 472, 0, 510)
GreenBallItems.Size = UDim2.new(0, 20, 0, 15)
GreenBallItems.TextColor3 = Color3.new(1, 1, 1)
GreenBallItems.Font = Enum.Font.SourceSans
GreenBallItems.FontSize = Enum.FontSize.Size14
GreenBallItems.Text = "0"
GreenBallItems.TextScaled = true
GreenBallItems.TextSize = 14
GreenBallItems.TextWrapped = true

Bobblehead4Info = Instance.new("ImageLabel")
Bobblehead4Info.BackgroundTransparency = 1
Bobblehead4Info.Name = "Bobblehead4Info"
Bobblehead4Info.Parent = otherframe
Bobblehead4Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead4Info.Position = UDim2.new(0, 75, 0, 540)
Bobblehead4Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead4Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1211511782"
Bobblehead4Info.Visible = true

Bobblehead4 = Instance.new("TextLabel")
Bobblehead4.Name = "Bobblehead4"
Bobblehead4.Parent = otherframe
Bobblehead4.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead4.BackgroundTransparency = 0.1
Bobblehead4.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead4.BorderSizePixel = 0
Bobblehead4.Position = UDim2.new(0, 45, 0, 610)
Bobblehead4.Size = UDim2.new(0, 80, 0, 15)
Bobblehead4.TextColor3 = Color3.new(1, 1, 1)
Bobblehead4.Font = Enum.Font.SourceSans
Bobblehead4.FontSize = Enum.FontSize.Size14
Bobblehead4.Text = "Wobilee Bobilee"
Bobblehead4.TextScaled = true
Bobblehead4.TextSize = 14
Bobblehead4.TextWrapped = true

Bobblehead4Items = Instance.new("TextLabel")
Bobblehead4Items.Name = "Bobblehead4Items"
Bobblehead4Items.Parent = otherframe
Bobblehead4Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead4Items.BackgroundTransparency = 0.1
Bobblehead4Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead4Items.BorderSizePixel = 0
Bobblehead4Items.Position = UDim2.new(0, 127, 0, 610)
Bobblehead4Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead4Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead4Items.Font = Enum.Font.SourceSans
Bobblehead4Items.FontSize = Enum.FontSize.Size14
Bobblehead4Items.Text = "0"
Bobblehead4Items.TextScaled = true
Bobblehead4Items.TextSize = 14
Bobblehead4Items.TextWrapped = true

Bobblehead5Info = Instance.new("ImageLabel")
Bobblehead5Info.BackgroundTransparency = 1
Bobblehead5Info.Name = "Bobblehead5Info"
Bobblehead5Info.Parent = otherframe
Bobblehead5Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead5Info.Position = UDim2.new(0, 190, 0, 540)
Bobblehead5Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead5Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479132707"
Bobblehead5Info.Visible = true

Bobblehead5 = Instance.new("TextLabel")
Bobblehead5.Name = "Bobblehead5"
Bobblehead5.Parent = otherframe
Bobblehead5.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead5.BackgroundTransparency = 0.1
Bobblehead5.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead5.BorderSizePixel = 0
Bobblehead5.Position = UDim2.new(0, 160, 0, 610)
Bobblehead5.Size = UDim2.new(0, 80, 0, 15)
Bobblehead5.TextColor3 = Color3.new(1, 1, 1)
Bobblehead5.Font = Enum.Font.SourceSans
Bobblehead5.FontSize = Enum.FontSize.Size14
Bobblehead5.Text = "Wolliby Bolliwy"
Bobblehead5.TextScaled = true
Bobblehead5.TextSize = 14
Bobblehead5.TextWrapped = true

Bobblehead5Items = Instance.new("TextLabel")
Bobblehead5Items.Name = "Bobblehead5Items"
Bobblehead5Items.Parent = otherframe
Bobblehead5Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead5Items.BackgroundTransparency = 0.1
Bobblehead5Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead5Items.BorderSizePixel = 0
Bobblehead5Items.Position = UDim2.new(0, 242, 0, 610)
Bobblehead5Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead5Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead5Items.Font = Enum.Font.SourceSans
Bobblehead5Items.FontSize = Enum.FontSize.Size14
Bobblehead5Items.Text = "0"
Bobblehead5Items.TextScaled = true
Bobblehead5Items.TextSize = 14
Bobblehead5Items.TextWrapped = true

PumpkinCursedInfo = Instance.new("ImageLabel")
PumpkinCursedInfo.BackgroundTransparency = 1
PumpkinCursedInfo.Name = "PumpkinCursedInfo"
PumpkinCursedInfo.Parent = otherframe
PumpkinCursedInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinCursedInfo.Position = UDim2.new(0, 300, 0, 540)
PumpkinCursedInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinCursedInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2360849036"
PumpkinCursedInfo.Visible = true

PumpkinCursed = Instance.new("TextLabel")
PumpkinCursed.Name = "PumpkinCursed"
PumpkinCursed.Parent = otherframe
PumpkinCursed.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinCursed.BackgroundTransparency = 0.1
PumpkinCursed.BorderColor3 = Color3.new(0, 0, 0)
PumpkinCursed.BorderSizePixel = 0
PumpkinCursed.Position = UDim2.new(0, 275, 0, 610)
PumpkinCursed.Size = UDim2.new(0, 80, 0, 15)
PumpkinCursed.TextColor3 = Color3.new(1, 1, 1)
PumpkinCursed.Font = Enum.Font.SourceSans
PumpkinCursed.FontSize = Enum.FontSize.Size14
PumpkinCursed.Text = "Pumpkin Cursed"
PumpkinCursed.TextScaled = true
PumpkinCursed.TextSize = 14
PumpkinCursed.TextWrapped = true

PumpkinCursedItems = Instance.new("TextLabel")
PumpkinCursedItems.Name = "PumpkinCursedItems"
PumpkinCursedItems.Parent = otherframe
PumpkinCursedItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinCursedItems.BackgroundTransparency = 0.1
PumpkinCursedItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinCursedItems.BorderSizePixel = 0
PumpkinCursedItems.Position = UDim2.new(0, 357, 0, 610)
PumpkinCursedItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinCursedItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinCursedItems.Font = Enum.Font.SourceSans
PumpkinCursedItems.FontSize = Enum.FontSize.Size14
PumpkinCursedItems.Text = "0"
PumpkinCursedItems.TextScaled = true
PumpkinCursedItems.TextSize = 14
PumpkinCursedItems.TextWrapped = true

CanOfCranberryInfo = Instance.new("ImageLabel")
CanOfCranberryInfo.BackgroundTransparency = 1
CanOfCranberryInfo.Name = "CanOfCranberryInfo"
CanOfCranberryInfo.Parent = otherframe
CanOfCranberryInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CanOfCranberryInfo.Position = UDim2.new(0, 410, 0, 540)
CanOfCranberryInfo.Size = UDim2.new(0, 40, 0, 60)
CanOfCranberryInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2360875570"
CanOfCranberryInfo.Visible = true

CanOfCranberry = Instance.new("TextLabel")
CanOfCranberry.Name = "CanOfCranberry"
CanOfCranberry.Parent = otherframe
CanOfCranberry.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CanOfCranberry.BackgroundTransparency = 0.1
CanOfCranberry.BorderColor3 = Color3.new(0, 0, 0)
CanOfCranberry.BorderSizePixel = 0
CanOfCranberry.Position = UDim2.new(0, 390, 0, 610)
CanOfCranberry.Size = UDim2.new(0, 80, 0, 15)
CanOfCranberry.TextColor3 = Color3.new(1, 1, 1)
CanOfCranberry.Font = Enum.Font.SourceSans
CanOfCranberry.FontSize = Enum.FontSize.Size14
CanOfCranberry.Text = "Can Of Cranberry"
CanOfCranberry.TextScaled = true
CanOfCranberry.TextSize = 14
CanOfCranberry.TextWrapped = true

CanOfCranberryItems = Instance.new("TextLabel")
CanOfCranberryItems.Name = "CanOfCranberryItems"
CanOfCranberryItems.Parent = otherframe
CanOfCranberryItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CanOfCranberryItems.BackgroundTransparency = 0.1
CanOfCranberryItems.BorderColor3 = Color3.new(0, 0, 0)
CanOfCranberryItems.BorderSizePixel = 0
CanOfCranberryItems.Position = UDim2.new(0, 472, 0, 610)
CanOfCranberryItems.Size = UDim2.new(0, 20, 0, 15)
CanOfCranberryItems.TextColor3 = Color3.new(1, 1, 1)
CanOfCranberryItems.Font = Enum.Font.SourceSans
CanOfCranberryItems.FontSize = Enum.FontSize.Size14
CanOfCranberryItems.Text = "0"
CanOfCranberryItems.TextScaled = true
CanOfCranberryItems.TextSize = 14
CanOfCranberryItems.TextWrapped = true

BagOfCandyInfo = Instance.new("ImageLabel")
BagOfCandyInfo.BackgroundTransparency = 1
BagOfCandyInfo.Name = "BagOfCandyInfo"
BagOfCandyInfo.Parent = otherframe
BagOfCandyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BagOfCandyInfo.Position = UDim2.new(0, 75, 0, 640)
BagOfCandyInfo.Size = UDim2.new(0, 40, 0, 60)
BagOfCandyInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2361051075"
BagOfCandyInfo.Visible = true

BagOfCandy = Instance.new("TextLabel")
BagOfCandy.Name = "BagOfCandy"
BagOfCandy.Parent = otherframe
BagOfCandy.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandy.BackgroundTransparency = 0.1
BagOfCandy.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandy.BorderSizePixel = 0
BagOfCandy.Position = UDim2.new(0, 45, 0, 710)
BagOfCandy.Size = UDim2.new(0, 80, 0, 15)
BagOfCandy.TextColor3 = Color3.new(1, 1, 1)
BagOfCandy.Font = Enum.Font.SourceSans
BagOfCandy.FontSize = Enum.FontSize.Size14
BagOfCandy.Text = "Bag Of Candy"
BagOfCandy.TextScaled = true
BagOfCandy.TextSize = 14
BagOfCandy.TextWrapped = true

BagOfCandyItems = Instance.new("TextLabel")
BagOfCandyItems.Name = "BagOfCandyItems"
BagOfCandyItems.Parent = otherframe
BagOfCandyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandyItems.BackgroundTransparency = 0.1
BagOfCandyItems.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandyItems.BorderSizePixel = 0
BagOfCandyItems.Position = UDim2.new(0, 127, 0, 710)
BagOfCandyItems.Size = UDim2.new(0, 20, 0, 15)
BagOfCandyItems.TextColor3 = Color3.new(1, 1, 1)
BagOfCandyItems.Font = Enum.Font.SourceSans
BagOfCandyItems.FontSize = Enum.FontSize.Size14
BagOfCandyItems.Text = "0"
BagOfCandyItems.TextScaled = true
BagOfCandyItems.TextSize = 14
BagOfCandyItems.TextWrapped = true

CandyInfo = Instance.new("ImageLabel")
CandyInfo.BackgroundTransparency = 1
CandyInfo.Name = "CandyInfo"
CandyInfo.Parent = otherframe
CandyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CandyInfo.Position = UDim2.new(0, 190, 0, 640)
CandyInfo.Size = UDim2.new(0, 40, 0, 60)
CandyInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2361141178"
CandyInfo.Visible = true

Candy = Instance.new("TextLabel")
Candy.Name = "Candy"
Candy.Parent = otherframe
Candy.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Candy.BackgroundTransparency = 0.1
Candy.BorderColor3 = Color3.new(0, 0, 0)
Candy.BorderSizePixel = 0
Candy.Position = UDim2.new(0, 160, 0, 710)
Candy.Size = UDim2.new(0, 80, 0, 15)
Candy.TextColor3 = Color3.new(1, 1, 1)
Candy.Font = Enum.Font.SourceSans
Candy.FontSize = Enum.FontSize.Size14
Candy.Text = "Candy"
Candy.TextScaled = true
Candy.TextSize = 14
Candy.TextWrapped = true

CandyItems = Instance.new("TextLabel")
CandyItems.Name = "CandyItems"
CandyItems.Parent = otherframe
CandyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyItems.BackgroundTransparency = 0.1
CandyItems.BorderColor3 = Color3.new(0, 0, 0)
CandyItems.BorderSizePixel = 0
CandyItems.Position = UDim2.new(0, 242, 0, 710)
CandyItems.Size = UDim2.new(0, 20, 0, 15)
CandyItems.TextColor3 = Color3.new(1, 1, 1)
CandyItems.Font = Enum.Font.SourceSans
CandyItems.FontSize = Enum.FontSize.Size14
CandyItems.Text = "0"
CandyItems.TextScaled = true
CandyItems.TextSize = 14
CandyItems.TextWrapped = true

Turkey4Info = Instance.new("ImageLabel")
Turkey4Info.BackgroundTransparency = 1
Turkey4Info.Name = "Turkey4Info"
Turkey4Info.Parent = otherframe
Turkey4Info.BackgroundColor3 = Color3.new(1, 1, 1)
Turkey4Info.Position = UDim2.new(0, 300, 0, 640)
Turkey4Info.Size = UDim2.new(0, 40, 0, 60)
Turkey4Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4464553089"
Turkey4Info.Visible = true

Turkey4 = Instance.new("TextLabel")
Turkey4.Name = "Turkey4"
Turkey4.Parent = otherframe
Turkey4.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey4.BackgroundTransparency = 0.1
Turkey4.BorderColor3 = Color3.new(0, 0, 0)
Turkey4.BorderSizePixel = 0
Turkey4.Position = UDim2.new(0, 275, 0, 710)
Turkey4.Size = UDim2.new(0, 80, 0, 15)
Turkey4.TextColor3 = Color3.new(1, 1, 1)
Turkey4.Font = Enum.Font.SourceSans
Turkey4.FontSize = Enum.FontSize.Size14
Turkey4.Text = "Pink Bone Turkey"
Turkey4.TextScaled = true
Turkey4.TextSize = 14
Turkey4.TextWrapped = true

Turkey4Items = Instance.new("TextLabel")
Turkey4Items.Name = "Turkey4Items"
Turkey4Items.Parent = otherframe
Turkey4Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey4Items.BackgroundTransparency = 0.1
Turkey4Items.BorderColor3 = Color3.new(0, 0, 0)
Turkey4Items.BorderSizePixel = 0
Turkey4Items.Position = UDim2.new(0, 357, 0, 710)
Turkey4Items.Size = UDim2.new(0, 20, 0, 15)
Turkey4Items.TextColor3 = Color3.new(1, 1, 1)
Turkey4Items.Font = Enum.Font.SourceSans
Turkey4Items.FontSize = Enum.FontSize.Size14
Turkey4Items.Text = "0"
Turkey4Items.TextScaled = true
Turkey4Items.TextSize = 14
Turkey4Items.TextWrapped = true

SnowballInfo = Instance.new("ImageLabel")
SnowballInfo.BackgroundTransparency = 1
SnowballInfo.Name = "SnowballInfo"
SnowballInfo.Parent = otherframe
SnowballInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SnowballInfo.Position = UDim2.new(0, 410, 0, 640)
SnowballInfo.Size = UDim2.new(0, 40, 0, 60)
SnowballInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2617933017"
SnowballInfo.Visible = true

Snowball = Instance.new("TextLabel")
Snowball.Name = "Snowball"
Snowball.Parent = otherframe
Snowball.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Snowball.BackgroundTransparency = 0.1
Snowball.BorderColor3 = Color3.new(0, 0, 0)
Snowball.BorderSizePixel = 0
Snowball.Position = UDim2.new(0, 390, 0, 710)
Snowball.Size = UDim2.new(0, 80, 0, 15)
Snowball.TextColor3 = Color3.new(1, 1, 1)
Snowball.Font = Enum.Font.SourceSans
Snowball.FontSize = Enum.FontSize.Size14
Snowball.Text = "Snowball"
Snowball.TextScaled = true
Snowball.TextSize = 14
Snowball.TextWrapped = true

SnowballItems = Instance.new("TextLabel")
SnowballItems.Name = "SnowballItems"
SnowballItems.Parent = otherframe
SnowballItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SnowballItems.BackgroundTransparency = 0.1
SnowballItems.BorderColor3 = Color3.new(0, 0, 0)
SnowballItems.BorderSizePixel = 0
SnowballItems.Position = UDim2.new(0, 472, 0, 710)
SnowballItems.Size = UDim2.new(0, 20, 0, 15)
SnowballItems.TextColor3 = Color3.new(1, 1, 1)
SnowballItems.Font = Enum.Font.SourceSans
SnowballItems.FontSize = Enum.FontSize.Size14
SnowballItems.Text = "0"
SnowballItems.TextScaled = true
SnowballItems.TextSize = 14
SnowballItems.TextWrapped = true

PlateInfo = Instance.new("ImageLabel")
PlateInfo.BackgroundTransparency = 1
PlateInfo.Name = "PlateInfo"
PlateInfo.Parent = otherframe
PlateInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PlateInfo.Position = UDim2.new(0, 75, 0, 740)
PlateInfo.Size = UDim2.new(0, 40, 0, 60)
PlateInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2617982652"
PlateInfo.Visible = true

Plate = Instance.new("TextLabel")
Plate.Name = "Plate"
Plate.Parent = otherframe
Plate.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Plate.BackgroundTransparency = 0.1
Plate.BorderColor3 = Color3.new(0, 0, 0)
Plate.BorderSizePixel = 0
Plate.Position = UDim2.new(0, 45, 0, 810)
Plate.Size = UDim2.new(0, 80, 0, 15)
Plate.TextColor3 = Color3.new(1, 1, 1)
Plate.Font = Enum.Font.SourceSans
Plate.FontSize = Enum.FontSize.Size14
Plate.Text = "Plate"
Plate.TextScaled = true
Plate.TextSize = 14
Plate.TextWrapped = true

PlateItems = Instance.new("TextLabel")
PlateItems.Name = "PlateItems"
PlateItems.Parent = otherframe
PlateItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PlateItems.BackgroundTransparency = 0.1
PlateItems.BorderColor3 = Color3.new(0, 0, 0)
PlateItems.BorderSizePixel = 0
PlateItems.Position = UDim2.new(0, 127, 0, 810)
PlateItems.Size = UDim2.new(0, 20, 0, 15)
PlateItems.TextColor3 = Color3.new(1, 1, 1)
PlateItems.Font = Enum.Font.SourceSans
PlateItems.FontSize = Enum.FontSize.Size14
PlateItems.Text = "0"
PlateItems.TextScaled = true
PlateItems.TextSize = 14
PlateItems.TextWrapped = true

CocoaInfo = Instance.new("ImageLabel")
CocoaInfo.BackgroundTransparency = 1
CocoaInfo.Name = "CocoaInfo"
CocoaInfo.Parent = otherframe
CocoaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CocoaInfo.Position = UDim2.new(0, 190, 0, 740)
CocoaInfo.Size = UDim2.new(0, 40, 0, 60)
CocoaInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618088732"
CocoaInfo.Visible = true

Cocoa = Instance.new("TextLabel")
Cocoa.Name = "Cocoa"
Cocoa.Parent = otherframe
Cocoa.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Cocoa.BackgroundTransparency = 0.1
Cocoa.BorderColor3 = Color3.new(0, 0, 0)
Cocoa.BorderSizePixel = 0
Cocoa.Position = UDim2.new(0, 160, 0, 810)
Cocoa.Size = UDim2.new(0, 80, 0, 15)
Cocoa.TextColor3 = Color3.new(1, 1, 1)
Cocoa.Font = Enum.Font.SourceSans
Cocoa.FontSize = Enum.FontSize.Size14
Cocoa.Text = "Cocoa"
Cocoa.TextScaled = true
Cocoa.TextSize = 14
Cocoa.TextWrapped = true

CocoaItems = Instance.new("TextLabel")
CocoaItems.Name = "CocoaItems"
CocoaItems.Parent = otherframe
CocoaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CocoaItems.BackgroundTransparency = 0.1
CocoaItems.BorderColor3 = Color3.new(0, 0, 0)
CocoaItems.BorderSizePixel = 0
CocoaItems.Position = UDim2.new(0, 242, 0, 810)
CocoaItems.Size = UDim2.new(0, 20, 0, 15)
CocoaItems.TextColor3 = Color3.new(1, 1, 1)
CocoaItems.Font = Enum.Font.SourceSans
CocoaItems.FontSize = Enum.FontSize.Size14
CocoaItems.Text = "0"
CocoaItems.TextScaled = true
CocoaItems.TextSize = 14
CocoaItems.TextWrapped = true

CandyCaneInfo = Instance.new("ImageLabel")
CandyCaneInfo.BackgroundTransparency = 1
CandyCaneInfo.Name = "CandyCaneInfo"
CandyCaneInfo.Parent = otherframe
CandyCaneInfo.BackgroundColor3 = Color3.new(1, 1, 1)
CandyCaneInfo.Position = UDim2.new(0, 300, 0, 740)
CandyCaneInfo.Size = UDim2.new(0, 40, 0, 60)
CandyCaneInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618091312"
CandyCaneInfo.Visible = true

CandyCane = Instance.new("TextLabel")
CandyCane.Name = "CandyCane"
CandyCane.Parent = otherframe
CandyCane.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCane.BackgroundTransparency = 0.1
CandyCane.BorderColor3 = Color3.new(0, 0, 0)
CandyCane.BorderSizePixel = 0
CandyCane.Position = UDim2.new(0, 275, 0, 810)
CandyCane.Size = UDim2.new(0, 80, 0, 15)
CandyCane.TextColor3 = Color3.new(1, 1, 1)
CandyCane.Font = Enum.Font.SourceSans
CandyCane.FontSize = Enum.FontSize.Size14
CandyCane.Text = "Candy Cane"
CandyCane.TextScaled = true
CandyCane.TextSize = 14
CandyCane.TextWrapped = true

CandyCaneItems = Instance.new("TextLabel")
CandyCaneItems.Name = "CandyCaneItems"
CandyCaneItems.Parent = otherframe
CandyCaneItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCaneItems.BackgroundTransparency = 0.1
CandyCaneItems.BorderColor3 = Color3.new(0, 0, 0)
CandyCaneItems.BorderSizePixel = 0
CandyCaneItems.Position = UDim2.new(0, 357, 0, 810)
CandyCaneItems.Size = UDim2.new(0, 20, 0, 15)
CandyCaneItems.TextColor3 = Color3.new(1, 1, 1)
CandyCaneItems.Font = Enum.Font.SourceSans
CandyCaneItems.FontSize = Enum.FontSize.Size14
CandyCaneItems.Text = "0"
CandyCaneItems.TextScaled = true
CandyCaneItems.TextSize = 14
CandyCaneItems.TextWrapped = true

DuckInfo = Instance.new("ImageLabel")
DuckInfo.BackgroundTransparency = 1
DuckInfo.Name = "DuckInfo"
DuckInfo.Parent = otherframe
DuckInfo.BackgroundColor3 = Color3.new(1, 1, 1)
DuckInfo.Position = UDim2.new(0, 410, 0, 740)
DuckInfo.Size = UDim2.new(0, 40, 0, 60)
DuckInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618093067"
DuckInfo.Visible = true

Duck = Instance.new("TextLabel")
Duck.Name = "Duck"
Duck.Parent = otherframe
Duck.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Duck.BackgroundTransparency = 0.1
Duck.BorderColor3 = Color3.new(0, 0, 0)
Duck.BorderSizePixel = 0
Duck.Position = UDim2.new(0, 390, 0, 810)
Duck.Size = UDim2.new(0, 80, 0, 15)
Duck.TextColor3 = Color3.new(1, 1, 1)
Duck.Font = Enum.Font.SourceSans
Duck.FontSize = Enum.FontSize.Size14
Duck.Text = "Duck"
Duck.TextScaled = true
Duck.TextSize = 14
Duck.TextWrapped = true

DuckItems = Instance.new("TextLabel")
DuckItems.Name = "DuckItems"
DuckItems.Parent = otherframe
DuckItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
DuckItems.BackgroundTransparency = 0.1
DuckItems.BorderColor3 = Color3.new(0, 0, 0)
DuckItems.BorderSizePixel = 0
DuckItems.Position = UDim2.new(0, 472, 0, 810)
DuckItems.Size = UDim2.new(0, 20, 0, 15)
DuckItems.TextColor3 = Color3.new(1, 1, 1)
DuckItems.Font = Enum.Font.SourceSans
DuckItems.FontSize = Enum.FontSize.Size14
DuckItems.Text = "0"
DuckItems.TextScaled = true
DuckItems.TextSize = 14
DuckItems.TextWrapped = true

ConeInfo = Instance.new("ImageLabel")
ConeInfo.BackgroundTransparency = 1
ConeInfo.Name = "ConeInfo"
ConeInfo.Parent = otherframe
ConeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ConeInfo.Position = UDim2.new(0, 75, 0, 840)
ConeInfo.Size = UDim2.new(0, 40, 0, 60)
ConeInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618094148"
ConeInfo.Visible = true

Cone = Instance.new("TextLabel")
Cone.Name = "Cone"
Cone.Parent = otherframe
Cone.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Cone.BackgroundTransparency = 0.1
Cone.BorderColor3 = Color3.new(0, 0, 0)
Cone.BorderSizePixel = 0
Cone.Position = UDim2.new(0, 45, 0, 910)
Cone.Size = UDim2.new(0, 80, 0, 15)
Cone.TextColor3 = Color3.new(1, 1, 1)
Cone.Font = Enum.Font.SourceSans
Cone.FontSize = Enum.FontSize.Size14
Cone.Text = "Cone"
Cone.TextScaled = true
Cone.TextSize = 14
Cone.TextWrapped = true

ConeItems = Instance.new("TextLabel")
ConeItems.Name = "ConeItems"
ConeItems.Parent = otherframe
ConeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ConeItems.BackgroundTransparency = 0.1
ConeItems.BorderColor3 = Color3.new(0, 0, 0)
ConeItems.BorderSizePixel = 0
ConeItems.Position = UDim2.new(0, 127, 0, 910)
ConeItems.Size = UDim2.new(0, 20, 0, 15)
ConeItems.TextColor3 = Color3.new(1, 1, 1)
ConeItems.Font = Enum.Font.SourceSans
ConeItems.FontSize = Enum.FontSize.Size14
ConeItems.Text = "0"
ConeItems.TextScaled = true
ConeItems.TextSize = 14
ConeItems.TextWrapped = true

TobogganInfo = Instance.new("ImageLabel")
TobogganInfo.BackgroundTransparency = 1
TobogganInfo.Name = "TobogganInfo"
TobogganInfo.Parent = otherframe
TobogganInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TobogganInfo.Position = UDim2.new(0, 190, 0, 840)
TobogganInfo.Size = UDim2.new(0, 40, 0, 60)
TobogganInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2618096457"
TobogganInfo.Visible = true

Toboggan = Instance.new("TextLabel")
Toboggan.Name = "Toboggan"
Toboggan.Parent = otherframe
Toboggan.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Toboggan.BackgroundTransparency = 0.1
Toboggan.BorderColor3 = Color3.new(0, 0, 0)
Toboggan.BorderSizePixel = 0
Toboggan.Position = UDim2.new(0, 160, 0, 910)
Toboggan.Size = UDim2.new(0, 80, 0, 15)
Toboggan.TextColor3 = Color3.new(1, 1, 1)
Toboggan.Font = Enum.Font.SourceSans
Toboggan.FontSize = Enum.FontSize.Size14
Toboggan.Text = "Toboggan"
Toboggan.TextScaled = true
Toboggan.TextSize = 14
Toboggan.TextWrapped = true

TobogganItems = Instance.new("TextLabel")
TobogganItems.Name = "TobogganItems"
TobogganItems.Parent = otherframe
TobogganItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TobogganItems.BackgroundTransparency = 0.1
TobogganItems.BorderColor3 = Color3.new(0, 0, 0)
TobogganItems.BorderSizePixel = 0
TobogganItems.Position = UDim2.new(0, 242, 0, 910)
TobogganItems.Size = UDim2.new(0, 20, 0, 15)
TobogganItems.TextColor3 = Color3.new(1, 1, 1)
TobogganItems.Font = Enum.Font.SourceSans
TobogganItems.FontSize = Enum.FontSize.Size14
TobogganItems.Text = "0"
TobogganItems.TextScaled = true
TobogganItems.TextSize = 14
TobogganItems.TextWrapped = true

ScoobisInfo = Instance.new("ImageLabel")
ScoobisInfo.BackgroundTransparency = 1
ScoobisInfo.Name = "ScoobisInfo"
ScoobisInfo.Parent = otherframe
ScoobisInfo.BackgroundColor3 = Color3.new(1, 1, 1)
ScoobisInfo.Position = UDim2.new(0, 300, 0, 840)
ScoobisInfo.Size = UDim2.new(0, 40, 0, 60)
ScoobisInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=1107996734"
ScoobisInfo.Visible = true

Scoobis = Instance.new("TextLabel")
Scoobis.Name = "Scoobis"
Scoobis.Parent = otherframe
Scoobis.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Scoobis.BackgroundTransparency = 0.1
Scoobis.BorderColor3 = Color3.new(0, 0, 0)
Scoobis.BorderSizePixel = 0
Scoobis.Position = UDim2.new(0, 275, 0, 910)
Scoobis.Size = UDim2.new(0, 80, 0, 15)
Scoobis.TextColor3 = Color3.new(1, 1, 1)
Scoobis.Font = Enum.Font.SourceSans
Scoobis.FontSize = Enum.FontSize.Size14
Scoobis.Text = "Scoobis"
Scoobis.TextScaled = true
Scoobis.TextSize = 14
Scoobis.TextWrapped = true

ScoobisItems = Instance.new("TextLabel")
ScoobisItems.Name = "ScoobisItems"
ScoobisItems.Parent = otherframe
ScoobisItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
ScoobisItems.BackgroundTransparency = 0.1
ScoobisItems.BorderColor3 = Color3.new(0, 0, 0)
ScoobisItems.BorderSizePixel = 0
ScoobisItems.Position = UDim2.new(0, 357, 0, 910)
ScoobisItems.Size = UDim2.new(0, 20, 0, 15)
ScoobisItems.TextColor3 = Color3.new(1, 1, 1)
ScoobisItems.Font = Enum.Font.SourceSans
ScoobisItems.FontSize = Enum.FontSize.Size14
ScoobisItems.Text = "0"
ScoobisItems.TextScaled = true
ScoobisItems.TextSize = 14
ScoobisItems.TextWrapped = true

PlumBallInfo = Instance.new("ImageLabel")
PlumBallInfo.BackgroundTransparency = 1
PlumBallInfo.Name = "PlumBallInfo"
PlumBallInfo.Parent = otherframe
PlumBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PlumBallInfo.Position = UDim2.new(0, 410, 0, 840)
PlumBallInfo.Size = UDim2.new(0, 40, 0, 60)
PlumBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2653674624"
PlumBallInfo.Visible = true

PlumBall = Instance.new("TextLabel")
PlumBall.Name = "PlumBall"
PlumBall.Parent = otherframe
PlumBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PlumBall.BackgroundTransparency = 0.1
PlumBall.BorderColor3 = Color3.new(0, 0, 0)
PlumBall.BorderSizePixel = 0
PlumBall.Position = UDim2.new(0, 390, 0, 910)
PlumBall.Size = UDim2.new(0, 80, 0, 15)
PlumBall.TextColor3 = Color3.new(1, 1, 1)
PlumBall.Font = Enum.Font.SourceSans
PlumBall.FontSize = Enum.FontSize.Size14
PlumBall.Text = "Plum Ball"
PlumBall.TextScaled = true
PlumBall.TextSize = 14
PlumBall.TextWrapped = true

PlumBallItems = Instance.new("TextLabel")
PlumBallItems.Name = "PlumBallItems"
PlumBallItems.Parent = otherframe
PlumBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PlumBallItems.BackgroundTransparency = 0.1
PlumBallItems.BorderColor3 = Color3.new(0, 0, 0)
PlumBallItems.BorderSizePixel = 0
PlumBallItems.Position = UDim2.new(0, 472, 0, 910)
PlumBallItems.Size = UDim2.new(0, 20, 0, 15)
PlumBallItems.TextColor3 = Color3.new(1, 1, 1)
PlumBallItems.Font = Enum.Font.SourceSans
PlumBallItems.FontSize = Enum.FontSize.Size14
PlumBallItems.Text = "0"
PlumBallItems.TextScaled = true
PlumBallItems.TextSize = 14
PlumBallItems.TextWrapped = true

YellowBallInfo = Instance.new("ImageLabel")
YellowBallInfo.BackgroundTransparency = 1
YellowBallInfo.Name = "YellowBallInfo"
YellowBallInfo.Parent = otherframe
YellowBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
YellowBallInfo.Position = UDim2.new(0, 75, 0, 940)
YellowBallInfo.Size = UDim2.new(0, 40, 0, 60)
YellowBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2655523729"
YellowBallInfo.Visible = true

YellowBall = Instance.new("TextLabel")
YellowBall.Name = "YellowBall"
YellowBall.Parent = otherframe
YellowBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
YellowBall.BackgroundTransparency = 0.1
YellowBall.BorderColor3 = Color3.new(0, 0, 0)
YellowBall.BorderSizePixel = 0
YellowBall.Position = UDim2.new(0, 45, 0, 1010)
YellowBall.Size = UDim2.new(0, 80, 0, 15)
YellowBall.TextColor3 = Color3.new(1, 1, 1)
YellowBall.Font = Enum.Font.SourceSans
YellowBall.FontSize = Enum.FontSize.Size14
YellowBall.Text = "Yellow Ball"
YellowBall.TextScaled = true
YellowBall.TextSize = 14
YellowBall.TextWrapped = true

YellowBallItems = Instance.new("TextLabel")
YellowBallItems.Name = "YellowBallItems"
YellowBallItems.Parent = otherframe
YellowBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
YellowBallItems.BackgroundTransparency = 0.1
YellowBallItems.BorderColor3 = Color3.new(0, 0, 0)
YellowBallItems.BorderSizePixel = 0
YellowBallItems.Position = UDim2.new(0, 127, 0, 1010)
YellowBallItems.Size = UDim2.new(0, 20, 0, 15)
YellowBallItems.TextColor3 = Color3.new(1, 1, 1)
YellowBallItems.Font = Enum.Font.SourceSans
YellowBallItems.FontSize = Enum.FontSize.Size14
YellowBallItems.Text = "0"
YellowBallItems.TextScaled = true
YellowBallItems.TextSize = 14
YellowBallItems.TextWrapped = true

PumpkinGhastlyInfo = Instance.new("ImageLabel")
PumpkinGhastlyInfo.BackgroundTransparency = 1
PumpkinGhastlyInfo.Name = "PumpkinGhastlyInfo"
PumpkinGhastlyInfo.Parent = otherframe
PumpkinGhastlyInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinGhastlyInfo.Position = UDim2.new(0, 190, 0, 940)
PumpkinGhastlyInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinGhastlyInfo.Image = "http://www.roblox.com/asset/?id=3724399002"
PumpkinGhastlyInfo.Visible = true

PumpkinGhastly = Instance.new("TextLabel")
PumpkinGhastly.Name = "PumpkinGhastly"
PumpkinGhastly.Parent = otherframe
PumpkinGhastly.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinGhastly.BackgroundTransparency = 0.1
PumpkinGhastly.BorderColor3 = Color3.new(0, 0, 0)
PumpkinGhastly.BorderSizePixel = 0
PumpkinGhastly.Position = UDim2.new(0, 160, 0, 1010)
PumpkinGhastly.Size = UDim2.new(0, 80, 0, 15)
PumpkinGhastly.TextColor3 = Color3.new(1, 1, 1)
PumpkinGhastly.Font = Enum.Font.SourceSans
PumpkinGhastly.FontSize = Enum.FontSize.Size14
PumpkinGhastly.Text = "Pumpkin Ghastly"
PumpkinGhastly.TextScaled = true
PumpkinGhastly.TextSize = 14
PumpkinGhastly.TextWrapped = true

PumpkinGhastlyItems = Instance.new("TextLabel")
PumpkinGhastlyItems.Name = "PumpkinGhastlyItems"
PumpkinGhastlyItems.Parent = otherframe
PumpkinGhastlyItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinGhastlyItems.BackgroundTransparency = 0.1
PumpkinGhastlyItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinGhastlyItems.BorderSizePixel = 0
PumpkinGhastlyItems.Position = UDim2.new(0, 242, 0, 1010)
PumpkinGhastlyItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinGhastlyItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinGhastlyItems.Font = Enum.Font.SourceSans
PumpkinGhastlyItems.FontSize = Enum.FontSize.Size14
PumpkinGhastlyItems.Text = "0"
PumpkinGhastlyItems.TextScaled = true
PumpkinGhastlyItems.TextSize = 14
PumpkinGhastlyItems.TextWrapped = true

PumpkinLumbkinInfo = Instance.new("ImageLabel")
PumpkinLumbkinInfo.BackgroundTransparency = 1
PumpkinLumbkinInfo.Name = "PumpkinLumbkinInfo"
PumpkinLumbkinInfo.Parent = otherframe
PumpkinLumbkinInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinLumbkinInfo.Position = UDim2.new(0, 300, 0, 940)
PumpkinLumbkinInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinLumbkinInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=3695812992"
PumpkinLumbkinInfo.Visible = true

PumpkinLumbkin = Instance.new("TextLabel")
PumpkinLumbkin.Name = "PumpkinLumbkin"
PumpkinLumbkin.Parent = otherframe
PumpkinLumbkin.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinLumbkin.BackgroundTransparency = 0.1
PumpkinLumbkin.BorderColor3 = Color3.new(0, 0, 0)
PumpkinLumbkin.BorderSizePixel = 0
PumpkinLumbkin.Position = UDim2.new(0, 275, 0, 1010)
PumpkinLumbkin.Size = UDim2.new(0, 80, 0, 15)
PumpkinLumbkin.TextColor3 = Color3.new(1, 1, 1)
PumpkinLumbkin.Font = Enum.Font.SourceSans
PumpkinLumbkin.FontSize = Enum.FontSize.Size14
PumpkinLumbkin.Text = "Pumpkin Lumbkin"
PumpkinLumbkin.TextScaled = true
PumpkinLumbkin.TextSize = 14
PumpkinLumbkin.TextWrapped = true

PumpkinLumbkinItems = Instance.new("TextLabel")
PumpkinLumbkinItems.Name = "PumpkinLumbkinItems"
PumpkinLumbkinItems.Parent = otherframe
PumpkinLumbkinItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinLumbkinItems.BackgroundTransparency = 0.1
PumpkinLumbkinItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinLumbkinItems.BorderSizePixel = 0
PumpkinLumbkinItems.Position = UDim2.new(0, 357, 0, 1010)
PumpkinLumbkinItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinLumbkinItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinLumbkinItems.Font = Enum.Font.SourceSans
PumpkinLumbkinItems.FontSize = Enum.FontSize.Size14
PumpkinLumbkinItems.Text = "0"
PumpkinLumbkinItems.TextScaled = true
PumpkinLumbkinItems.TextSize = 14
PumpkinLumbkinItems.TextWrapped = true

Turkey3Info = Instance.new("ImageLabel")
Turkey3Info.BackgroundTransparency = 1
Turkey3Info.Name = "Turkey3Info"
Turkey3Info.Parent = otherframe
Turkey3Info.BackgroundColor3 = Color3.new(1, 1, 1)
Turkey3Info.Position = UDim2.new(0, 410, 0, 940)
Turkey3Info.Size = UDim2.new(0, 40, 0, 60)
Turkey3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=2551605913"
Turkey3Info.Visible = true

Turkey3 = Instance.new("TextLabel")
Turkey3.Name = "Turkey3"
Turkey3.Parent = otherframe
Turkey3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey3.BackgroundTransparency = 0.1
Turkey3.BorderColor3 = Color3.new(0, 0, 0)
Turkey3.BorderSizePixel = 0
Turkey3.Position = UDim2.new(0, 390, 0, 1010)
Turkey3.Size = UDim2.new(0, 80, 0, 15)
Turkey3.TextColor3 = Color3.new(1, 1, 1)
Turkey3.Font = Enum.Font.SourceSans
Turkey3.FontSize = Enum.FontSize.Size14
Turkey3.Text = "Green Bone Turkey"
Turkey3.TextScaled = true
Turkey3.TextSize = 14
Turkey3.TextWrapped = true

Turkey3Items = Instance.new("TextLabel")
Turkey3Items.Name = "Turkey3Items"
Turkey3Items.Parent = otherframe
Turkey3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey3Items.BackgroundTransparency = 0.1
Turkey3Items.BorderColor3 = Color3.new(0, 0, 0)
Turkey3Items.BorderSizePixel = 0
Turkey3Items.Position = UDim2.new(0, 472, 0, 1010)
Turkey3Items.Size = UDim2.new(0, 20, 0, 15)
Turkey3Items.TextColor3 = Color3.new(1, 1, 1)
Turkey3Items.Font = Enum.Font.SourceSans
Turkey3Items.FontSize = Enum.FontSize.Size14
Turkey3Items.Text = "0"
Turkey3Items.TextScaled = true
Turkey3Items.TextSize = 14
Turkey3Items.TextWrapped = true

Bobblehead6Info = Instance.new("ImageLabel")
Bobblehead6Info.BackgroundTransparency = 1
Bobblehead6Info.Name = "Bobblehead6Info"
Bobblehead6Info.Parent = otherframe
Bobblehead6Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead6Info.Position = UDim2.new(0, 75, 0, 1040)
Bobblehead6Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead6Info.Image = "rbxassetid://4479125868"
Bobblehead6Info.Visible = true

Bobblehead6 = Instance.new("TextLabel")
Bobblehead6.Name = "Bobblehead6"
Bobblehead6.Parent = otherframe
Bobblehead6.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead6.BackgroundTransparency = 0.1
Bobblehead6.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead6.BorderSizePixel = 0
Bobblehead6.Position = UDim2.new(0, 45, 0, 1110)
Bobblehead6.Size = UDim2.new(0, 80, 0, 15)
Bobblehead6.TextColor3 = Color3.new(1, 1, 1)
Bobblehead6.Font = Enum.Font.SourceSans
Bobblehead6.FontSize = Enum.FontSize.Size14
Bobblehead6.Text = "Bollily Wollolily"
Bobblehead6.TextScaled = true
Bobblehead6.TextSize = 14
Bobblehead6.TextWrapped = true

Bobblehead6Items = Instance.new("TextLabel")
Bobblehead6Items.Name = "Bobblehead6Items"
Bobblehead6Items.Parent = otherframe
Bobblehead6Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead6Items.BackgroundTransparency = 0.1
Bobblehead6Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead6Items.BorderSizePixel = 0
Bobblehead6Items.Position = UDim2.new(0, 127, 0, 1110)
Bobblehead6Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead6Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead6Items.Font = Enum.Font.SourceSans
Bobblehead6Items.FontSize = Enum.FontSize.Size14
Bobblehead6Items.Text = "0"
Bobblehead6Items.TextScaled = true
Bobblehead6Items.TextSize = 14
Bobblehead6Items.TextWrapped = true

TealBallInfo = Instance.new("ImageLabel")
TealBallInfo.BackgroundTransparency = 1
TealBallInfo.Name = "TealBallInfo"
TealBallInfo.Parent = otherframe
TealBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TealBallInfo.Position = UDim2.new(0, 190, 0, 1040)
TealBallInfo.Size = UDim2.new(0, 40, 0, 60)
TealBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479136661"
TealBallInfo.Visible = true

TealBall = Instance.new("TextLabel")
TealBall.Name = "TealBall"
TealBall.Parent = otherframe
TealBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TealBall.BackgroundTransparency = 0.1
TealBall.BorderColor3 = Color3.new(0, 0, 0)
TealBall.BorderSizePixel = 0
TealBall.Position = UDim2.new(0, 160, 0, 1110)
TealBall.Size = UDim2.new(0, 80, 0, 15)
TealBall.TextColor3 = Color3.new(1, 1, 1)
TealBall.Font = Enum.Font.SourceSans
TealBall.FontSize = Enum.FontSize.Size14
TealBall.Text = "Teal Ball"
TealBall.TextScaled = true
TealBall.TextSize = 14
TealBall.TextWrapped = true

TealBallItems = Instance.new("TextLabel")
TealBallItems.Name = "TealBallItems"
TealBallItems.Parent = otherframe
TealBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TealBallItems.BackgroundTransparency = 0.1
TealBallItems.BorderColor3 = Color3.new(0, 0, 0)
TealBallItems.BorderSizePixel = 0
TealBallItems.Position = UDim2.new(0, 242, 0, 1110)
TealBallItems.Size = UDim2.new(0, 20, 0, 15)
TealBallItems.TextColor3 = Color3.new(1, 1, 1)
TealBallItems.Font = Enum.Font.SourceSans
TealBallItems.FontSize = Enum.FontSize.Size14
TealBallItems.Text = "0"
TealBallItems.TextScaled = true
TealBallItems.TextSize = 14
TealBallItems.TextWrapped = true

Bobblehead7Info = Instance.new("ImageLabel")
Bobblehead7Info.BackgroundTransparency = 1
Bobblehead7Info.Name = "Bobblehead7Info"
Bobblehead7Info.Parent = otherframe
Bobblehead7Info.BackgroundColor3 = Color3.new(1, 1, 1)
Bobblehead7Info.Position = UDim2.new(0, 300, 0, 1040)
Bobblehead7Info.Size = UDim2.new(0, 40, 0, 60)
Bobblehead7Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479142903"
Bobblehead7Info.Visible = true

Bobblehead7 = Instance.new("TextLabel")
Bobblehead7.Name = "Bobblehead7"
Bobblehead7.Parent = otherframe
Bobblehead7.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead7.BackgroundTransparency = 0.1
Bobblehead7.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead7.BorderSizePixel = 0
Bobblehead7.Position = UDim2.new(0, 275, 0, 1110)
Bobblehead7.Size = UDim2.new(0, 80, 0, 15)
Bobblehead7.TextColor3 = Color3.new(1, 1, 1)
Bobblehead7.Font = Enum.Font.SourceSans
Bobblehead7.FontSize = Enum.FontSize.Size14
Bobblehead7.Text = "Wabble Babble"
Bobblehead7.TextScaled = true
Bobblehead7.TextSize = 14
Bobblehead7.TextWrapped = true

Bobblehead7Items = Instance.new("TextLabel")
Bobblehead7Items.Name = "Bobblehead7Items"
Bobblehead7Items.Parent = otherframe
Bobblehead7Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bobblehead7Items.BackgroundTransparency = 0.1
Bobblehead7Items.BorderColor3 = Color3.new(0, 0, 0)
Bobblehead7Items.BorderSizePixel = 0
Bobblehead7Items.Position = UDim2.new(0, 357, 0, 1110)
Bobblehead7Items.Size = UDim2.new(0, 20, 0, 15)
Bobblehead7Items.TextColor3 = Color3.new(1, 1, 1)
Bobblehead7Items.Font = Enum.Font.SourceSans
Bobblehead7Items.FontSize = Enum.FontSize.Size14
Bobblehead7Items.Text = "0"
Bobblehead7Items.TextScaled = true
Bobblehead7Items.TextSize = 14
Bobblehead7Items.TextWrapped = true

BlackBallInfo = Instance.new("ImageLabel")
BlackBallInfo.BackgroundTransparency = 1
BlackBallInfo.Name = "BlackBallInfo"
BlackBallInfo.Parent = otherframe
BlackBallInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BlackBallInfo.Position = UDim2.new(0, 410, 0, 1040)
BlackBallInfo.Size = UDim2.new(0, 40, 0, 60)
BlackBallInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479146533"
BlackBallInfo.Visible = true

BlackBall = Instance.new("TextLabel")
BlackBall.Name = "BlackBall"
BlackBall.Parent = otherframe
BlackBall.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlackBall.BackgroundTransparency = 0.1
BlackBall.BorderColor3 = Color3.new(0, 0, 0)
BlackBall.BorderSizePixel = 0
BlackBall.Position = UDim2.new(0, 390, 0, 1110)
BlackBall.Size = UDim2.new(0, 80, 0, 15)
BlackBall.TextColor3 = Color3.new(1, 1, 1)
BlackBall.Font = Enum.Font.SourceSans
BlackBall.FontSize = Enum.FontSize.Size14
BlackBall.Text = "Black Ball"
BlackBall.TextScaled = true
BlackBall.TextSize = 14
BlackBall.TextWrapped = true

BlackBallItems = Instance.new("TextLabel")
BlackBallItems.Name = "BlackBallItems"
BlackBallItems.Parent = otherframe
BlackBallItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BlackBallItems.BackgroundTransparency = 0.1
BlackBallItems.BorderColor3 = Color3.new(0, 0, 0)
BlackBallItems.BorderSizePixel = 0
BlackBallItems.Position = UDim2.new(0, 472, 0, 1110)
BlackBallItems.Size = UDim2.new(0, 20, 0, 15)
BlackBallItems.TextColor3 = Color3.new(1, 1, 1)
BlackBallItems.Font = Enum.Font.SourceSans
BlackBallItems.FontSize = Enum.FontSize.Size14
BlackBallItems.Text = "0"
BlackBallItems.TextScaled = true
BlackBallItems.TextSize = 14
BlackBallItems.TextWrapped = true

BurgerColaInfo = Instance.new("ImageLabel")
BurgerColaInfo.BackgroundTransparency = 1
BurgerColaInfo.Name = "BurgerColaInfo"
BurgerColaInfo.Parent = otherframe
BurgerColaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BurgerColaInfo.Position = UDim2.new(0, 75, 0, 1140)
BurgerColaInfo.Size = UDim2.new(0, 40, 0, 60)
BurgerColaInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479250686"
BurgerColaInfo.Visible = true

BurgerCola = Instance.new("TextLabel")
BurgerCola.Name = "BurgerCola"
BurgerCola.Parent = otherframe
BurgerCola.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BurgerCola.BackgroundTransparency = 0.1
BurgerCola.BorderColor3 = Color3.new(0, 0, 0)
BurgerCola.BorderSizePixel = 0
BurgerCola.Position = UDim2.new(0, 45, 0, 1210)
BurgerCola.Size = UDim2.new(0, 80, 0, 15)
BurgerCola.TextColor3 = Color3.new(1, 1, 1)
BurgerCola.Font = Enum.Font.SourceSans
BurgerCola.FontSize = Enum.FontSize.Size14
BurgerCola.Text = "Burger Cola"
BurgerCola.TextScaled = true
BurgerCola.TextSize = 14
BurgerCola.TextWrapped = true

BurgerColaItems = Instance.new("TextLabel")
BurgerColaItems.Name = "BurgerColaItems"
BurgerColaItems.Parent = otherframe
BurgerColaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BurgerColaItems.BackgroundTransparency = 0.1
BurgerColaItems.BorderColor3 = Color3.new(0, 0, 0)
BurgerColaItems.BorderSizePixel = 0
BurgerColaItems.Position = UDim2.new(0, 127, 0, 1210)
BurgerColaItems.Size = UDim2.new(0, 20, 0, 15)
BurgerColaItems.TextColor3 = Color3.new(1, 1, 1)
BurgerColaItems.Font = Enum.Font.SourceSans
BurgerColaItems.FontSize = Enum.FontSize.Size14
BurgerColaItems.Text = "0"
BurgerColaItems.TextScaled = true
BurgerColaItems.TextSize = 14
BurgerColaItems.TextWrapped = true

BowlInfo = Instance.new("ImageLabel")
BowlInfo.BackgroundTransparency = 1
BowlInfo.Name = "BowlInfo"
BowlInfo.Parent = otherframe
BowlInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BowlInfo.Position = UDim2.new(0, 190, 0, 1140)
BowlInfo.Size = UDim2.new(0, 40, 0, 60)
BowlInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4479433038"
BowlInfo.Visible = true

Bowl = Instance.new("TextLabel")
Bowl.Name = "Bowl"
Bowl.Parent = otherframe
Bowl.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Bowl.BackgroundTransparency = 0.1
Bowl.BorderColor3 = Color3.new(0, 0, 0)
Bowl.BorderSizePixel = 0
Bowl.Position = UDim2.new(0, 160, 0, 1210)
Bowl.Size = UDim2.new(0, 80, 0, 15)
Bowl.TextColor3 = Color3.new(1, 1, 1)
Bowl.Font = Enum.Font.SourceSans
Bowl.FontSize = Enum.FontSize.Size14
Bowl.Text = "Bowl"
Bowl.TextScaled = true
Bowl.TextSize = 14
Bowl.TextWrapped = true

BowlItems = Instance.new("TextLabel")
BowlItems.Name = "BowlItems"
BowlItems.Parent = otherframe
BowlItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BowlItems.BackgroundTransparency = 0.1
BowlItems.BorderColor3 = Color3.new(0, 0, 0)
BowlItems.BorderSizePixel = 0
BowlItems.Position = UDim2.new(0, 242, 0, 1210)
BowlItems.Size = UDim2.new(0, 20, 0, 15)
BowlItems.TextColor3 = Color3.new(1, 1, 1)
BowlItems.Font = Enum.Font.SourceSans
BowlItems.FontSize = Enum.FontSize.Size14
BowlItems.Text = "0"
BowlItems.TextScaled = true
BowlItems.TextSize = 14
BowlItems.TextWrapped = true

Turkey5Info = Instance.new("ImageLabel")
Turkey5Info.BackgroundTransparency = 1
Turkey5Info.Name = "Turkey5Info"
Turkey5Info.Parent = otherframe
Turkey5Info.BackgroundColor3 = Color3.new(1, 1, 1)
Turkey5Info.Position = UDim2.new(0, 300, 0, 1140)
Turkey5Info.Size = UDim2.new(0, 40, 0, 60)
Turkey5Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=4472999307"
Turkey5Info.Visible = true

Turkey5 = Instance.new("TextLabel")
Turkey5.Name = "Turkey5"
Turkey5.Parent = otherframe
Turkey5.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey5.BackgroundTransparency = 0.1
Turkey5.BorderColor3 = Color3.new(0, 0, 0)
Turkey5.BorderSizePixel = 0
Turkey5.Position = UDim2.new(0, 275, 0, 1210)
Turkey5.Size = UDim2.new(0, 80, 0, 15)
Turkey5.TextColor3 = Color3.new(1, 1, 1)
Turkey5.Font = Enum.Font.SourceSans
Turkey5.FontSize = Enum.FontSize.Size14
Turkey5.Text = "Spicy Turkey"
Turkey5.TextScaled = true
Turkey5.TextSize = 14
Turkey5.TextWrapped = true

Turkey5Items = Instance.new("TextLabel")
Turkey5Items.Name = "Turkey5Items"
Turkey5Items.Parent = otherframe
Turkey5Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
Turkey5Items.BackgroundTransparency = 0.1
Turkey5Items.BorderColor3 = Color3.new(0, 0, 0)
Turkey5Items.BorderSizePixel = 0
Turkey5Items.Position = UDim2.new(0, 357, 0, 1210)
Turkey5Items.Size = UDim2.new(0, 20, 0, 15)
Turkey5Items.TextColor3 = Color3.new(1, 1, 1)
Turkey5Items.Font = Enum.Font.SourceSans
Turkey5Items.FontSize = Enum.FontSize.Size14
Turkey5Items.Text = "0"
Turkey5Items.TextScaled = true
Turkey5Items.TextSize = 14
Turkey5Items.TextWrapped = true

BagOfCandy2Info = Instance.new("ImageLabel")
BagOfCandy2Info.BackgroundTransparency = 1
BagOfCandy2Info.Name = "BagOfCandy2Info"
BagOfCandy2Info.Parent = otherframe
BagOfCandy2Info.BackgroundColor3 = Color3.new(1, 1, 1)
BagOfCandy2Info.Position = UDim2.new(0, 410, 0, 1140)
BagOfCandy2Info.Size = UDim2.new(0, 40, 0, 60)
BagOfCandy2Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=5680453518"
BagOfCandy2Info.Visible = true

BagOfCandy2 = Instance.new("TextLabel")
BagOfCandy2.Name = "BagOfCandy2"
BagOfCandy2.Parent = otherframe
BagOfCandy2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandy2.BackgroundTransparency = 0.1
BagOfCandy2.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandy2.BorderSizePixel = 0
BagOfCandy2.Position = UDim2.new(0, 390, 0, 1210)
BagOfCandy2.Size = UDim2.new(0, 80, 0, 15)
BagOfCandy2.TextColor3 = Color3.new(1, 1, 1)
BagOfCandy2.Font = Enum.Font.SourceSans
BagOfCandy2.FontSize = Enum.FontSize.Size14
BagOfCandy2.Text = "Bag Of Candy2"
BagOfCandy2.TextScaled = true
BagOfCandy2.TextSize = 14
BagOfCandy2.TextWrapped = true

BagOfCandy2Items = Instance.new("TextLabel")
BagOfCandy2Items.Name = "BagOfCandy2Items"
BagOfCandy2Items.Parent = otherframe
BagOfCandy2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandy2Items.BackgroundTransparency = 0.1
BagOfCandy2Items.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandy2Items.BorderSizePixel = 0
BagOfCandy2Items.Position = UDim2.new(0, 472, 0, 1210)
BagOfCandy2Items.Size = UDim2.new(0, 20, 0, 15)
BagOfCandy2Items.TextColor3 = Color3.new(1, 1, 1)
BagOfCandy2Items.Font = Enum.Font.SourceSans
BagOfCandy2Items.FontSize = Enum.FontSize.Size14
BagOfCandy2Items.Text = "0"
BagOfCandy2Items.TextScaled = true
BagOfCandy2Items.TextSize = 14
BagOfCandy2Items.TextWrapped = true

TurkeyLegInfo = Instance.new("ImageLabel")
TurkeyLegInfo.BackgroundTransparency = 1
TurkeyLegInfo.Name = "TurkeyLegInfo"
TurkeyLegInfo.Parent = otherframe
TurkeyLegInfo.BackgroundColor3 = Color3.new(1, 1, 1)
TurkeyLegInfo.Position = UDim2.new(0, 75, 0, 1240)
TurkeyLegInfo.Size = UDim2.new(0, 40, 0, 60)
TurkeyLegInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=13745494"
TurkeyLegInfo.Visible = true

TurkeyLeg = Instance.new("TextLabel")
TurkeyLeg.Name = "TurkeyLeg"
TurkeyLeg.Parent = otherframe
TurkeyLeg.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TurkeyLeg.BackgroundTransparency = 0.1
TurkeyLeg.BorderColor3 = Color3.new(0, 0, 0)
TurkeyLeg.BorderSizePixel = 0
TurkeyLeg.Position = UDim2.new(0, 45, 0, 1310)
TurkeyLeg.Size = UDim2.new(0, 80, 0, 15)
TurkeyLeg.TextColor3 = Color3.new(1, 1, 1)
TurkeyLeg.Font = Enum.Font.SourceSans
TurkeyLeg.FontSize = Enum.FontSize.Size14
TurkeyLeg.Text = "Turkey Leg"
TurkeyLeg.TextScaled = true
TurkeyLeg.TextSize = 14
TurkeyLeg.TextWrapped = true

TurkeyLegItems = Instance.new("TextLabel")
TurkeyLegItems.Name = "TurkeyLegItems"
TurkeyLegItems.Parent = otherframe
TurkeyLegItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
TurkeyLegItems.BackgroundTransparency = 0.1
TurkeyLegItems.BorderColor3 = Color3.new(0, 0, 0)
TurkeyLegItems.BorderSizePixel = 0
TurkeyLegItems.Position = UDim2.new(0, 127, 0, 1310)
TurkeyLegItems.Size = UDim2.new(0, 20, 0, 15)
TurkeyLegItems.TextColor3 = Color3.new(1, 1, 1)
TurkeyLegItems.Font = Enum.Font.SourceSans
TurkeyLegItems.FontSize = Enum.FontSize.Size14
TurkeyLegItems.Text = "0"
TurkeyLegItems.TextScaled = true
TurkeyLegItems.TextSize = 14
TurkeyLegItems.TextWrapped = true

CandyCane2Info = Instance.new("ImageLabel")
CandyCane2Info.BackgroundTransparency = 1
CandyCane2Info.Name = "CandyCane2Info"
CandyCane2Info.Parent = otherframe
CandyCane2Info.BackgroundColor3 = Color3.new(1, 1, 1)
CandyCane2Info.Position = UDim2.new(0, 190, 0, 1240)
CandyCane2Info.Size = UDim2.new(0, 40, 0, 60)
CandyCane2Info.Image = "http://www.roblox.com/asset/?id=5819013637"
CandyCane2Info.Visible = true

CandyCane2 = Instance.new("TextLabel")
CandyCane2.Name = "CandyCane2"
CandyCane2.Parent = otherframe
CandyCane2.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCane2.BackgroundTransparency = 0.1
CandyCane2.BorderColor3 = Color3.new(0, 0, 0)
CandyCane2.BorderSizePixel = 0
CandyCane2.Position = UDim2.new(0, 160, 0, 1310)
CandyCane2.Size = UDim2.new(0, 80, 0, 15)
CandyCane2.TextColor3 = Color3.new(1, 1, 1)
CandyCane2.Font = Enum.Font.SourceSans
CandyCane2.FontSize = Enum.FontSize.Size14
CandyCane2.Text = "Candy Cane2"
CandyCane2.TextScaled = true
CandyCane2.TextSize = 14
CandyCane2.TextWrapped = true

CandyCane2Items = Instance.new("TextLabel")
CandyCane2Items.Name = "CandyCane2Items"
CandyCane2Items.Parent = otherframe
CandyCane2Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCane2Items.BackgroundTransparency = 0.1
CandyCane2Items.BorderColor3 = Color3.new(0, 0, 0)
CandyCane2Items.BorderSizePixel = 0
CandyCane2Items.Position = UDim2.new(0, 242, 0, 1310)
CandyCane2Items.Size = UDim2.new(0, 20, 0, 15)
CandyCane2Items.TextColor3 = Color3.new(1, 1, 1)
CandyCane2Items.Font = Enum.Font.SourceSans
CandyCane2Items.FontSize = Enum.FontSize.Size14
CandyCane2Items.Text = "0"
CandyCane2Items.TextScaled = true
CandyCane2Items.TextSize = 14
CandyCane2Items.TextWrapped = true

HatchetBookInfo = Instance.new("ImageLabel")
HatchetBookInfo.BackgroundTransparency = 1
HatchetBookInfo.Name = "HatchetBookInfo"
HatchetBookInfo.Parent = otherframe
HatchetBookInfo.BackgroundColor3 = Color3.new(1, 1, 1)
HatchetBookInfo.Position = UDim2.new(0, 300, 0, 1240)
HatchetBookInfo.Size = UDim2.new(0, 40, 0, 60)
HatchetBookInfo.Image = "http://www.roblox.com/asset/?id=5825352442"
HatchetBookInfo.Visible = true

HatchetBook = Instance.new("TextLabel")
HatchetBook.Name = "HatchetBook"
HatchetBook.Parent = otherframe
HatchetBook.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HatchetBook.BackgroundTransparency = 0.1
HatchetBook.BorderColor3 = Color3.new(0, 0, 0)
HatchetBook.BorderSizePixel = 0
HatchetBook.Position = UDim2.new(0, 275, 0, 1310)
HatchetBook.Size = UDim2.new(0, 80, 0, 15)
HatchetBook.TextColor3 = Color3.new(1, 1, 1)
HatchetBook.Font = Enum.Font.SourceSans
HatchetBook.FontSize = Enum.FontSize.Size14
HatchetBook.Text = "Hatchet Book"
HatchetBook.TextScaled = true
HatchetBook.TextSize = 14
HatchetBook.TextWrapped = true

HatchetBookItems = Instance.new("TextLabel")
HatchetBookItems.Name = "HatchetBookItems"
HatchetBookItems.Parent = otherframe
HatchetBookItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HatchetBookItems.BackgroundTransparency = 0.1
HatchetBookItems.BorderColor3 = Color3.new(0, 0, 0)
HatchetBookItems.BorderSizePixel = 0
HatchetBookItems.Position = UDim2.new(0, 357, 0, 1310)
HatchetBookItems.Size = UDim2.new(0, 20, 0, 15)
HatchetBookItems.TextColor3 = Color3.new(1, 1, 1)
HatchetBookItems.Font = Enum.Font.SourceSans
HatchetBookItems.FontSize = Enum.FontSize.Size14
HatchetBookItems.Text = "0"
HatchetBookItems.TextScaled = true
HatchetBookItems.TextSize = 14
HatchetBookItems.TextWrapped = true

SpareTireInfo = Instance.new("ImageLabel")
SpareTireInfo.BackgroundTransparency = 1
SpareTireInfo.Name = "SpareTireInfo"
SpareTireInfo.Parent = otherframe
SpareTireInfo.BackgroundColor3 = Color3.new(1, 1, 1)
SpareTireInfo.Position = UDim2.new(0, 410, 0, 1240)
SpareTireInfo.Size = UDim2.new(0, 40, 0, 60)
SpareTireInfo.Image = "http://www.roblox.com/asset/?id=4472949280"
SpareTireInfo.Visible = true

SpareTire = Instance.new("TextLabel")
SpareTire.Name = "SpareTire"
SpareTire.Parent = otherframe
SpareTire.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SpareTire.BackgroundTransparency = 0.1
SpareTire.BorderColor3 = Color3.new(0, 0, 0)
SpareTire.BorderSizePixel = 0
SpareTire.Position = UDim2.new(0, 390, 0, 1310)
SpareTire.Size = UDim2.new(0, 80, 0, 15)
SpareTire.TextColor3 = Color3.new(1, 1, 1)
SpareTire.Font = Enum.Font.SourceSans
SpareTire.FontSize = Enum.FontSize.Size14
SpareTire.Text = "Spare Tire"
SpareTire.TextScaled = true
SpareTire.TextSize = 14
SpareTire.TextWrapped = true

SpareTireItems = Instance.new("TextLabel")
SpareTireItems.Name = "SpareTireItems"
SpareTireItems.Parent = otherframe
SpareTireItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
SpareTireItems.BackgroundTransparency = 0.1
SpareTireItems.BorderColor3 = Color3.new(0, 0, 0)
SpareTireItems.BorderSizePixel = 0
SpareTireItems.Position = UDim2.new(0, 472, 0, 1310)
SpareTireItems.Size = UDim2.new(0, 20, 0, 15)
SpareTireItems.TextColor3 = Color3.new(1, 1, 1)
SpareTireItems.Font = Enum.Font.SourceSans
SpareTireItems.FontSize = Enum.FontSize.Size14
SpareTireItems.Text = "0"
SpareTireItems.TextScaled = true
SpareTireItems.TextSize = 14
SpareTireItems.TextWrapped = true

PumpkinFlammaInfo = Instance.new("ImageLabel")
PumpkinFlammaInfo.BackgroundTransparency = 1
PumpkinFlammaInfo.Name = "PumpkinFlammaInfo"
PumpkinFlammaInfo.Parent = otherframe
PumpkinFlammaInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinFlammaInfo.Position = UDim2.new(0, 75, 0, 1330)
PumpkinFlammaInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinFlammaInfo.Image = "rbxassetid://1026962380"
PumpkinFlammaInfo.Visible = true

PumpkinFlamma = Instance.new("TextLabel")
PumpkinFlamma.Name = "PumpkinFlamma"
PumpkinFlamma.Parent = otherframe
PumpkinFlamma.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinFlamma.BackgroundTransparency = 0.1
PumpkinFlamma.BorderColor3 = Color3.new(0, 0, 0)
PumpkinFlamma.BorderSizePixel = 0
PumpkinFlamma.Position = UDim2.new(0, 45, 0, 1400)
PumpkinFlamma.Size = UDim2.new(0, 80, 0, 15)
PumpkinFlamma.TextColor3 = Color3.new(1, 1, 1)
PumpkinFlamma.Font = Enum.Font.SourceSans
PumpkinFlamma.FontSize = Enum.FontSize.Size14
PumpkinFlamma.Text = "Pumpkin Flamma"
PumpkinFlamma.TextScaled = true
PumpkinFlamma.TextSize = 14
PumpkinFlamma.TextWrapped = true

PumpkinFlammaItems = Instance.new("TextLabel")
PumpkinFlammaItems.Name = "PumpkinFlammaItems"
PumpkinFlammaItems.Parent = otherframe
PumpkinFlammaItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinFlammaItems.BackgroundTransparency = 0.1
PumpkinFlammaItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinFlammaItems.BorderSizePixel = 0
PumpkinFlammaItems.Position = UDim2.new(0, 127, 0, 1400)
PumpkinFlammaItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinFlammaItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinFlammaItems.Font = Enum.Font.SourceSans
PumpkinFlammaItems.FontSize = Enum.FontSize.Size14
PumpkinFlammaItems.Text = "0"
PumpkinFlammaItems.TextScaled = true
PumpkinFlammaItems.TextSize = 14
PumpkinFlammaItems.TextWrapped = true

BagOfCandy3Info = Instance.new("ImageLabel")
BagOfCandy3Info.BackgroundTransparency = 1
BagOfCandy3Info.Name = "BagOfCandy3Info"
BagOfCandy3Info.Parent = otherframe
BagOfCandy3Info.BackgroundColor3 = Color3.new(1, 1, 1)
BagOfCandy3Info.Position = UDim2.new(0, 190, 0, 1330)
BagOfCandy3Info.Size = UDim2.new(0, 40, 0, 60)
BagOfCandy3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=7566193639"
BagOfCandy3Info.Visible = true

BagOfCandy3 = Instance.new("TextLabel")
BagOfCandy3.Name = "BagOfCandy3"
BagOfCandy3.Parent = otherframe
BagOfCandy3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandy3.BackgroundTransparency = 0.1
BagOfCandy3.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandy3.BorderSizePixel = 0
BagOfCandy3.Position = UDim2.new(0, 160, 0, 1400)
BagOfCandy3.Size = UDim2.new(0, 80, 0, 15)
BagOfCandy3.TextColor3 = Color3.new(1, 1, 1)
BagOfCandy3.Font = Enum.Font.SourceSans
BagOfCandy3.FontSize = Enum.FontSize.Size14
BagOfCandy3.Text = "Bag Of Candy 3"
BagOfCandy3.TextScaled = true
BagOfCandy3.TextSize = 14
BagOfCandy3.TextWrapped = true

BagOfCandy3Items = Instance.new("TextLabel")
BagOfCandy3Items.Name = "BagOfCandy3Items"
BagOfCandy3Items.Parent = otherframe
BagOfCandy3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BagOfCandy3Items.BackgroundTransparency = 0.1
BagOfCandy3Items.BorderColor3 = Color3.new(0, 0, 0)
BagOfCandy3Items.BorderSizePixel = 0
BagOfCandy3Items.Position = UDim2.new(0, 242, 0, 1400)
BagOfCandy3Items.Size = UDim2.new(0, 20, 0, 15)
BagOfCandy3Items.TextColor3 = Color3.new(1, 1, 1)
BagOfCandy3Items.Font = Enum.Font.SourceSans
BagOfCandy3Items.FontSize = Enum.FontSize.Size14
BagOfCandy3Items.Text = "0"
BagOfCandy3Items.TextScaled = true
BagOfCandy3Items.TextSize = 14
BagOfCandy3Items.TextWrapped = true

PumpkinBorealInfo = Instance.new("ImageLabel")
PumpkinBorealInfo.BackgroundTransparency = 1
PumpkinBorealInfo.Name = "PumpkinBorealInfo"
PumpkinBorealInfo.Parent = otherframe
PumpkinBorealInfo.BackgroundColor3 = Color3.new(1, 1, 1)
PumpkinBorealInfo.Position = UDim2.new(0, 300, 0, 1330)
PumpkinBorealInfo.Size = UDim2.new(0, 40, 0, 60)
PumpkinBorealInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=5770319446"
PumpkinBorealInfo.Visible = true

PumpkinBoreal = Instance.new("TextLabel")
PumpkinBoreal.Name = "PumpkinBoreal"
PumpkinBoreal.Parent = otherframe
PumpkinBoreal.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinBoreal.BackgroundTransparency = 0.1
PumpkinBoreal.BorderColor3 = Color3.new(0, 0, 0)
PumpkinBoreal.BorderSizePixel = 0
PumpkinBoreal.Position = UDim2.new(0, 275, 0, 1400)
PumpkinBoreal.Size = UDim2.new(0, 80, 0, 15)
PumpkinBoreal.TextColor3 = Color3.new(1, 1, 1)
PumpkinBoreal.Font = Enum.Font.SourceSans
PumpkinBoreal.FontSize = Enum.FontSize.Size14
PumpkinBoreal.Text = "Pumpkin Boreal"
PumpkinBoreal.TextScaled = true
PumpkinBoreal.TextSize = 14
PumpkinBoreal.TextWrapped = true

PumpkinBorealItems = Instance.new("TextLabel")
PumpkinBorealItems.Name = "PumpkinBorealItems"
PumpkinBorealItems.Parent = otherframe
PumpkinBorealItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
PumpkinBorealItems.BackgroundTransparency = 0.1
PumpkinBorealItems.BorderColor3 = Color3.new(0, 0, 0)
PumpkinBorealItems.BorderSizePixel = 0
PumpkinBorealItems.Position = UDim2.new(0, 357, 0, 1400)
PumpkinBorealItems.Size = UDim2.new(0, 20, 0, 15)
PumpkinBorealItems.TextColor3 = Color3.new(1, 1, 1)
PumpkinBorealItems.Font = Enum.Font.SourceSans
PumpkinBorealItems.FontSize = Enum.FontSize.Size14
PumpkinBorealItems.Text = "0"
PumpkinBorealItems.TextScaled = true
PumpkinBorealItems.TextSize = 14
PumpkinBorealItems.TextWrapped = true

LumberBookInfo = Instance.new("ImageLabel")
LumberBookInfo.BackgroundTransparency = 1
LumberBookInfo.Name = "LumberBookInfo"
LumberBookInfo.Parent = otherframe
LumberBookInfo.BackgroundColor3 = Color3.new(1, 1, 1)
LumberBookInfo.Position = UDim2.new(0, 410, 0, 1330)
LumberBookInfo.Size = UDim2.new(0, 40, 0, 60)
LumberBookInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8212073524"
LumberBookInfo.Visible = true

LumberBook = Instance.new("TextLabel")
LumberBook.Name = "LumberBook"
LumberBook.Parent = otherframe
LumberBook.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LumberBook.BackgroundTransparency = 0.1
LumberBook.BorderColor3 = Color3.new(0, 0, 0)
LumberBook.BorderSizePixel = 0
LumberBook.Position = UDim2.new(0, 390, 0, 1400)
LumberBook.Size = UDim2.new(0, 80, 0, 15)
LumberBook.TextColor3 = Color3.new(1, 1, 1)
LumberBook.Font = Enum.Font.SourceSans
LumberBook.FontSize = Enum.FontSize.Size14
LumberBook.Text = "Lumber Book"
LumberBook.TextScaled = true
LumberBook.TextSize = 14
LumberBook.TextWrapped = true

LumberBookItems = Instance.new("TextLabel")
LumberBookItems.Name = "LumberBookItems"
LumberBookItems.Parent = otherframe
LumberBookItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
LumberBookItems.BackgroundTransparency = 0.1
LumberBookItems.BorderColor3 = Color3.new(0, 0, 0)
LumberBookItems.BorderSizePixel = 0
LumberBookItems.Position = UDim2.new(0, 472, 0, 1400)
LumberBookItems.Size = UDim2.new(0, 20, 0, 15)
LumberBookItems.TextColor3 = Color3.new(1, 1, 1)
LumberBookItems.Font = Enum.Font.SourceSans
LumberBookItems.FontSize = Enum.FontSize.Size14
LumberBookItems.Text = "0"
LumberBookItems.TextScaled = true
LumberBookItems.TextSize = 14
LumberBookItems.TextWrapped = true

IceCubeInfo = Instance.new("ImageLabel")
IceCubeInfo.BackgroundTransparency = 1
IceCubeInfo.Name = "IceCubeInfo"
IceCubeInfo.Parent = otherframe
IceCubeInfo.BackgroundColor3 = Color3.new(1, 1, 1)
IceCubeInfo.Position = UDim2.new(0, 75, 0, 1430)
IceCubeInfo.Size = UDim2.new(0, 40, 0, 60)
IceCubeInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8212090331"
IceCubeInfo.Visible = true

IceCube = Instance.new("TextLabel")
IceCube.Name = "IceCube"
IceCube.Parent = otherframe
IceCube.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IceCube.BackgroundTransparency = 0.1
IceCube.BorderColor3 = Color3.new(0, 0, 0)
IceCube.BorderSizePixel = 0
IceCube.Position = UDim2.new(0, 45, 0, 1500)
IceCube.Size = UDim2.new(0, 80, 0, 15)
IceCube.TextColor3 = Color3.new(1, 1, 1)
IceCube.Font = Enum.Font.SourceSans
IceCube.FontSize = Enum.FontSize.Size14
IceCube.Text = "Ice Cube"
IceCube.TextScaled = true
IceCube.TextSize = 14
IceCube.TextWrapped = true

IceCubeItems = Instance.new("TextLabel")
IceCubeItems.Name = "IceCubeItems"
IceCubeItems.Parent = otherframe
IceCubeItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
IceCubeItems.BackgroundTransparency = 0.1
IceCubeItems.BorderColor3 = Color3.new(0, 0, 0)
IceCubeItems.BorderSizePixel = 0
IceCubeItems.Position = UDim2.new(0, 127, 0, 1500)
IceCubeItems.Size = UDim2.new(0, 20, 0, 15)
IceCubeItems.TextColor3 = Color3.new(1, 1, 1)
IceCubeItems.Font = Enum.Font.SourceSans
IceCubeItems.FontSize = Enum.FontSize.Size14
IceCubeItems.Text = "0"
IceCubeItems.TextScaled = true
IceCubeItems.TextSize = 14
IceCubeItems.TextWrapped = true

HamLegInfo = Instance.new("ImageLabel")
HamLegInfo.BackgroundTransparency = 1
HamLegInfo.Name = "HamLegInfo"
HamLegInfo.Parent = otherframe
HamLegInfo.BackgroundColor3 = Color3.new(1, 1, 1)
HamLegInfo.Position = UDim2.new(0, 190, 0, 1430)
HamLegInfo.Size = UDim2.new(0, 40, 0, 60)
HamLegInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8212086025"
HamLegInfo.Visible = true

HamLeg = Instance.new("TextLabel")
HamLeg.Name = "HamLeg"
HamLeg.Parent = otherframe
HamLeg.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HamLeg.BackgroundTransparency = 0.1
HamLeg.BorderColor3 = Color3.new(0, 0, 0)
HamLeg.BorderSizePixel = 0
HamLeg.Position = UDim2.new(0, 160, 0, 1500)
HamLeg.Size = UDim2.new(0, 80, 0, 15)
HamLeg.TextColor3 = Color3.new(1, 1, 1)
HamLeg.Font = Enum.Font.SourceSans
HamLeg.FontSize = Enum.FontSize.Size14
HamLeg.Text = "Ham Leg"
HamLeg.TextScaled = true
HamLeg.TextSize = 14
HamLeg.TextWrapped = true

HamLegItems = Instance.new("TextLabel")
HamLegItems.Name = "HamLegItems"
HamLegItems.Parent = otherframe
HamLegItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
HamLegItems.BackgroundTransparency = 0.1
HamLegItems.BorderColor3 = Color3.new(0, 0, 0)
HamLegItems.BorderSizePixel = 0
HamLegItems.Position = UDim2.new(0, 242, 0, 1500)
HamLegItems.Size = UDim2.new(0, 20, 0, 15)
HamLegItems.TextColor3 = Color3.new(1, 1, 1)
HamLegItems.Font = Enum.Font.SourceSans
HamLegItems.FontSize = Enum.FontSize.Size14
HamLegItems.Text = "0"
HamLegItems.TextScaled = true
HamLegItems.TextSize = 14
HamLegItems.TextWrapped = true


BowlingPinInfo = Instance.new("ImageLabel")
BowlingPinInfo.BackgroundTransparency = 1
BowlingPinInfo.Name = "BowlingPinInfo"
BowlingPinInfo.Parent = otherframe
BowlingPinInfo.BackgroundColor3 = Color3.new(1, 1, 1)
BowlingPinInfo.Position = UDim2.new(0, 300, 0, 1430)
BowlingPinInfo.Size = UDim2.new(0, 40, 0, 60)
BowlingPinInfo.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8255922743"
BowlingPinInfo.Visible = true

BowlingPin = Instance.new("TextLabel")
BowlingPin.Name = "BowlingPin"
BowlingPin.Parent = otherframe
BowlingPin.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BowlingPin.BackgroundTransparency = 0.1
BowlingPin.BorderColor3 = Color3.new(0, 0, 0)
BowlingPin.BorderSizePixel = 0
BowlingPin.Position = UDim2.new(0, 275, 0, 1500)
BowlingPin.Size = UDim2.new(0, 80, 0, 15)
BowlingPin.TextColor3 = Color3.new(1, 1, 1)
BowlingPin.Font = Enum.Font.SourceSans
BowlingPin.FontSize = Enum.FontSize.Size14
BowlingPin.Text = "Bowling Pin"
BowlingPin.TextScaled = true
BowlingPin.TextSize = 14
BowlingPin.TextWrapped = true

BowlingPinItems = Instance.new("TextLabel")
BowlingPinItems.Name = "BowlingPinItems"
BowlingPinItems.Parent = otherframe
BowlingPinItems.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
BowlingPinItems.BackgroundTransparency = 0.1
BowlingPinItems.BorderColor3 = Color3.new(0, 0, 0)
BowlingPinItems.BorderSizePixel = 0
BowlingPinItems.Position = UDim2.new(0, 357, 0, 1500)
BowlingPinItems.Size = UDim2.new(0, 20, 0, 15)
BowlingPinItems.TextColor3 = Color3.new(1, 1, 1)
BowlingPinItems.Font = Enum.Font.SourceSans
BowlingPinItems.FontSize = Enum.FontSize.Size14
BowlingPinItems.Text = "0"
BowlingPinItems.TextScaled = true
BowlingPinItems.TextSize = 14
BowlingPinItems.TextWrapped = true

CandyCane3Info = Instance.new("ImageLabel")
CandyCane3Info.BackgroundTransparency = 1
CandyCane3Info.Name = "CandyCane3Info"
CandyCane3Info.Parent = otherframe
CandyCane3Info.BackgroundColor3 = Color3.new(1, 1, 1)
CandyCane3Info.Position = UDim2.new(0, 410, 0, 1430)
CandyCane3Info.Size = UDim2.new(0, 40, 0, 60)
CandyCane3Info.Image = "http://www.roblox.com/Game/Tools/ThumbnailAsset.ashx?fmt=png&wd=420&ht=420&aid=8212080976"
CandyCane3Info.Visible = true

CandyCane3 = Instance.new("TextLabel")
CandyCane3.Name = "CandyCane3"
CandyCane3.Parent = otherframe
CandyCane3.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCane3.BackgroundTransparency = 0.1
CandyCane3.BorderColor3 = Color3.new(0, 0, 0)
CandyCane3.BorderSizePixel = 0
CandyCane3.Position = UDim2.new(0, 390, 0, 1500)
CandyCane3.Size = UDim2.new(0, 80, 0, 15)
CandyCane3.TextColor3 = Color3.new(1, 1, 1)
CandyCane3.Font = Enum.Font.SourceSans
CandyCane3.FontSize = Enum.FontSize.Size14
CandyCane3.Text = "Candy Cane 3"
CandyCane3.TextScaled = true
CandyCane3.TextSize = 14
CandyCane3.TextWrapped = true

CandyCane3Items = Instance.new("TextLabel")
CandyCane3Items.Name = "CandyCane3Items"
CandyCane3Items.Parent = otherframe
CandyCane3Items.BackgroundColor3 = Color3.new(0.160784, 0.501961, 0.72549)
CandyCane3Items.BackgroundTransparency = 0.1
CandyCane3Items.BorderColor3 = Color3.new(0, 0, 0)
CandyCane3Items.BorderSizePixel = 0
CandyCane3Items.Position = UDim2.new(0, 472, 0, 1500)
CandyCane3Items.Size = UDim2.new(0, 20, 0, 15)
CandyCane3Items.TextColor3 = Color3.new(1, 1, 1)
CandyCane3Items.Font = Enum.Font.SourceSans
CandyCane3Items.FontSize = Enum.FontSize.Size14
CandyCane3Items.Text = "0"
CandyCane3Items.TextScaled = true
CandyCane3Items.TextSize = 14
CandyCane3Items.TextWrapped = true

--------------------------------------------------------------------------------------------------------------------------------------------
ItemLists = {}

function CreateTableOfPath(Path)
	for a,b in pairs(Path:GetChildren()) do 
		ItemLists[b.name] = {}
	end
end

Extras = {"UtilityTruck_Vehicle", "UtilityTruck2_Vehicle", "SmallTrailer_Vehicle", "Pickup1_Vehicle", "Trailer2_Vehicle", "Sleigh_Vehicle", "Birch", "CaveCrawler", "Cherry", "Oak", "Fir", "Frost", "Generic", "GoldSwampy", "Koa", "Volcano", "Palm", "LoneCave", "Pine", "SpookyNeon", "SnowGlow", "Spooky", "Walnut", "GreenSwampy"}

for a,b in pairs(Extras) do 
	ItemLists[b] = {}
end

CreateTableOfPath(game.ReplicatedStorage.ClientItemInfo)

for a,b in pairs(workspace.PlayerModels:GetChildren()) do 
	if b:FindFirstChild("ItemName") then 
		if b:FindFirstChildOfClass("Part") or b:FindFirstChild("Main") then 
			table.insert(ItemLists[b.ItemName.Value], b)
		end
	elseif b:FindFirstChild("ToolName") then
		if b:FindFirstChildOfClass("Part") or b:FindFirstChild("Main") then
			table.insert(ItemLists[b.ToolName.Value], b)
		end
	elseif b:FindFirstChild("TreeClass") then 
		if b:FindFirstChildOfClass("Part") or b:FindFirstChild("WoodSection") then
			table.insert(ItemLists[b.TreeClass.Value], b)
		end
	elseif b:FindFirstChild("PurchasedBoxItemName") then 
		if b:FindFirstChildOfClass("Part") or b:FindFirstChild("Main") then 
			table.insert(ItemLists[b.PurchasedBoxItemName.Value], b)
		end
	end
end

workspace.PlayerModels.ChildAdded:Connect(function(Added)
	wait(.5)
	if Added:FindFirstChild("ItemName") then 
		table.insert(ItemLists[Added.ItemName.Value], Added)
	elseif Added:FindFirstChild("ToolName") then 
		table.insert(ItemLists[Added.ToolName.Value], Added)
	elseif Added:FindFirstChild("TreeClass") then 
		table.insert(ItemLists[Added.TreeClass.Value], Added)
	elseif Added:FindFirstChild("PurchasedBoxItemName") then 
		table.insert(ItemLists[Added.PurchasedBoxItemName.Value], Added)
	end
end)

function CountItemsF(ItemName, Owner)
	Count = 0
	for a,b in pairs(ItemLists[ItemName]) do 
		if b.Parent ~= nil and b:FindFirstChild("Owner") and tostring(b.Owner.Value) == tostring(Owner) then 
			Count = Count + 1
		elseif b.Parent == nil then 
			table.remove(ItemLists[ItemName], a)
		end
	end
	return Count
end

spawn(function()
    while wait(.02) do
        BasicHatchetItems.Text = CountItemsF("BasicHatchet", _G.PlayerAName)
        wait(.02)
        Axe1Items.Text = CountItemsF("Axe1", _G.PlayerAName)
        wait(.02)
        Axe2Items.Text = CountItemsF("Axe2", _G.PlayerAName) 
        wait(.02)
        Axe3Items.Text = CountItemsF("Axe3", _G.PlayerAName) 
        wait(.02)
        AxeAlphaItems.Text = CountItemsF("AxeAlphaTesters", _G.PlayerAName) 
        wait(.02)
        RukiryItems.Text = CountItemsF("Rukiryaxe", _G.PlayerAName) 
        wait(.02)
        AxeBetaItems.Text = CountItemsF("AxeBetaTesters", _G.PlayerAName)
        wait(.02)
        FireAxeItems.Text = CountItemsF("FireAxe", _G.PlayerAName) 
        wait(.02)
        SilverAxeItems.Text = CountItemsF("SilverAxe", _G.PlayerAName) 
        wait(.02)
        EndTimesAxeItems.Text = CountItemsF("EndTimesAxe", _G.PlayerAName)
        wait(.02)
        AxeChickenItems.Text = CountItemsF("AxeChicken", _G.PlayerAName)
        wait(.02)
        CandyCaneAxeItems.Text = CountItemsF("CandyCaneAxe", _G.PlayerAName)
        wait(.02)
        BeesaxeItems.Text = CountItemsF("Beesaxe", _G.PlayerAName)
        wait(.02)
        AxeAmberItems.Text = CountItemsF("AxeAmber", _G.PlayerAName)
        wait(.02)
        GingerbreadAxeItems.Text = CountItemsF("GingerbreadAxe", _G.PlayerAName)
        wait(.02)
        ManyAxeItems.Text = CountItemsF("ManyAxe", _G.PlayerAName)
        wait(.02)
        AxeTwitterItems.Text = CountItemsF("AxeTwitter", _G.PlayerAName)
        wait(.02)
        RustyAxeItems.Text = CountItemsF("RustyAxe", _G.PlayerAName)
        wait(.02)
        CaveAxeItems.Text = CountItemsF("CaveAxe", _G.PlayerAName)
        wait(.02)
        CandyCornAxeItems.Text = CountItemsF("CandyCornAxe", _G.PlayerAName)
        wait(.02)
        AxeSwampItems.Text = CountItemsF("AxeSwamp", _G.PlayerAName)
        wait(.02)		
        UtilityTruckItems.Text = CountItemsF("UtilityTruck", _G.PlayerAName)
        wait(.02)
        UtilityTruck2kItems.Text = CountItemsF("UtilityTruck2", _G.PlayerAName)
        wait(.02)
        Pickup1Items.Text = CountItemsF("Pickup1", _G.PlayerAName)
        wait(.02)
        SmallTrailerItems.Text = CountItemsF("SmallTrailer", _G.PlayerAName)
        wait(.02)
        Trailer2Items.Text = CountItemsF("Trailer2", _G.PlayerAName)
        wait(.02)
        SleighItems.Text = CountItemsF("Sleigh", _G.PlayerAName)
        wait(.02)
        BoxedSpork2016Items.Text = CountItemsF("2016CGift_Ut", _G.PlayerAName)
        wait(.02)
        PoorlyWrapped2015Items.Text = CountItemsF("2015CGift_Coal", _G.PlayerAName)
        wait(.02)
        HappyRed2015Items.Text = CountItemsF("2015CGift_Red", _G.PlayerAName)
        wait(.02)
        CGift_Volcano2015Items.Text = CountItemsF("2015CGift_Volcano", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2015Items.Text = CountItemsF("2015CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Blue2016Items.Text = CountItemsF("2016CGift_Blue", _G.PlayerAName)
        wait(.02)
        CGift_Big2016Items.Text = CountItemsF("2016CGift_Big", _G.PlayerAName)
        wait(.02)
        CGift_Jingle2016Items.Text = CountItemsF("2016CGift_Jingle", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2016Items.Text = CountItemsF("2016CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2018Items.Text = CountItemsF("2018CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Green2017Items.Text = CountItemsF("2017CGift_Green", _G.PlayerAName)
        wait(.02)
        CGift_GreatTimes2017Items.Text = CountItemsF("2017CGift_GreatTimes", _G.PlayerAName)
        wait(.02)
        CGift_Modern2017Items.Text = CountItemsF("2017CGift_Modern", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2017Items.Text = CountItemsF("2017CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2019Items.Text = CountItemsF("2019CGift_Wobble_", _G.PlayerAName)
        wait(.02)
        CGift_Gold2017Items.Text = CountItemsF("2017CGift_Gold", _G.PlayerAName)
        wait(.02)
        CGift_Snow2018Items.Text = CountItemsF("2018CGift_Snow", _G.PlayerAName)
        wait(.02)
        CGift_Plate2018Items.Text = CountItemsF("2018CGift_Plate", _G.PlayerAName)
        wait(.02)
        CGift_Cocoa2018Items.Text = CountItemsF("2018CGift_Cocoa", _G.PlayerAName)
        wait(.02)
        CGift_Candy2018Items.Text = CountItemsF("2018CGift_Candy", _G.PlayerAName)
        wait(.02)
        CGift_Duck2018Items.Text = CountItemsF("2018CGift_Duck", _G.PlayerAName)
        wait(.02)
        CGift_Cone2018Items.Text = CountItemsF("2018CGift_Cone", _G.PlayerAName)
        wait(.02)
        CGift_Sled2018Items.Text = CountItemsF("2018CGift_Sled", _G.PlayerAName)
        wait(.02)
        CGift_GingerAxe2018Items.Text = CountItemsF("2018CGift_GingerAxe", _G.PlayerAName)
        wait(.02)
        CGift_Plum2018Items.Text = CountItemsF("2018CGift_Plum", _G.PlayerAName)
        wait(.02)
        CGift_Yellow2019Items.Text = CountItemsF("2019CGift_Yellow_", _G.PlayerAName)
        wait(.02)
        CGift_Wobble2020Items.Text = CountItemsF("2020CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Teal2020Items.Text = CountItemsF("2020CGift_Teal", _G.PlayerAName)
        wait(.02)
        CGift_Wobblel2021Items.Text = CountItemsF("2021CGift_Wobble", _G.PlayerAName)
        wait(.02)
        CGift_Black2021Items.Text = CountItemsF("2021CGift_Black", _G.PlayerAName)
        wait(.02)
        CGift_Cola2019Items.Text = CountItemsF("2019CGift_Cola", _G.PlayerAName)
        wait(.02)
        CGift_Burnt2019Items.Text = CountItemsF("2019CGift_Burnt", _G.PlayerAName)
        wait(.02)
        CGift_Rusty2019Items.Text = CountItemsF("2019CGift_Rusty", _G.PlayerAName)
        wait(.02)
        CGift_Bowl2019Items.Text = CountItemsF("2019CGift_Bowl", _G.PlayerAName)
        wait(.02)
        CGift_2021CGift_TallItems.Text = CountItemsF("2021CGift_Tall", _G.PlayerAName)
        wait(.02)
        C2021CGift_PlumpItems.Text = CountItemsF("2021CGift_Plump", _G.PlayerAName)
        wait(.02)
        C2021CGift_CandyItems.Text = CountItemsF("2021CGift_Candy", _G.PlayerAName)
        wait(.02)		
        C2021CGift_LumberItems.Text = CountItemsF("2021CGift_Lumber", _G.PlayerAName)
        wait(.02)
		C2021GGift_GooItems.Text = CountItemsF("2021GGift_Goo", _G.PlayerAName)
        wait(.02)
		C2021GGift_ColdItems.Text = CountItemsF("2021GGift_Cold", _G.PlayerAName)
        wait(.02)		
        CGift_Candy2020Items.Text = CountItemsF("2020CGift_Candy", _G.PlayerAName)
        wait(.02)
        CGift_Cave2020Items.Text = CountItemsF("2020CGift_Cave", _G.PlayerAName)
        wait(.02)
        CGift_Hatchet2020Items.Text = CountItemsF("2020CGift_Hatchet", _G.PlayerAName)
        wait(.02)
        CGift_Car2020Items.Text = CountItemsF("2020CGift_Car", _G.PlayerAName)
		wait(.02)
        C2021GGift_WeightedItems.Text = CountItemsF("2021GGift_Weighted", _G.PlayerAName)
        wait(.02)
        Painting1Items.Text = CountItemsF("Painting1", _G.PlayerAName)
        wait(.02)
        Painting2Items.Text = CountItemsF("Painting2", _G.PlayerAName)
        wait(.02)
        Painting3Items.Text = CountItemsF("Painting3", _G.PlayerAName)
        wait(.02)
        Painting4Items.Text = CountItemsF("Painting4", _G.PlayerAName)
        wait(.02)
        Painting5Items.Text = CountItemsF("Painting5", _G.PlayerAName)
        wait(.02)
        Painting6Items.Text = CountItemsF("Painting6", _G.PlayerAName)
        wait(.02)
        Painting7Items.Text = CountItemsF("Painting7", _G.PlayerAName)
        wait(.02)
        Painting8Items.Text = CountItemsF("Painting8", _G.PlayerAName)
        wait(.02)
        Painting9Items.Text = CountItemsF("Painting9", _G.PlayerAName)
        wait(.02)
        Painting10Items.Text = CountItemsF("Painting10", _G.PlayerAName)
        wait(.02)
        FloorLamp1Items.Text = CountItemsF("FloorLamp1", _G.PlayerAName)
        wait(.02)
        WallLight1Items.Text = CountItemsF("WallLight1", _G.PlayerAName)
        wait(.02)
        WallLight2Items.Text = CountItemsF("WallLight2", _G.PlayerAName)
        wait(.02)
        Seat_CouchItems.Text = CountItemsF("Seat_Couch", _G.PlayerAName)
        wait(.02)
        Seat_LoveseatItems.Text = CountItemsF("Seat_Loveseat", _G.PlayerAName)
        wait(.02)
        Seat_ArmchairItems.Text = CountItemsF("Seat_Armchair", _G.PlayerAName)
        wait(.02)
        RefridgeratorItems.Text = CountItemsF("Refridgerator", _G.PlayerAName)
        wait(.02)
        StoveItems.Text = CountItemsF("Stove", _G.PlayerAName)
        wait(.02)
        DishwasherItems.Text = CountItemsF("Dishwasher", _G.PlayerAName)
        wait(.02)
        ToiletItems.Text = CountItemsF("Toilet", _G.PlayerAName)
        wait(.02)
        Bed1Items.Text = CountItemsF("Bed1", _G.PlayerAName)
        wait(.02)
        Bed2Items.Text = CountItemsF("Bed2", _G.PlayerAName)
        wait(.02)
        Lamp1Items.Text = CountItemsF("Lamp1", _G.PlayerAName)
        wait(.02)
        ToiletGoldItems.Text = CountItemsF("ToiletGold", _G.PlayerAName)
        wait(.02)
        GlassPane1Items.Text = CountItemsF("GlassPane1", _G.PlayerAName)
        wait(.02)
        GlassPane2Items.Text = CountItemsF("GlassPane2", _G.PlayerAName)
        wait(.02)
        GlassPane3Items.Text = CountItemsF("GlassPane3", _G.PlayerAName)
        wait(.02)
        GlassPane4Items.Text = CountItemsF("GlassPane4", _G.PlayerAName)
        wait(.02)
        GlassDoor1Items.Text = CountItemsF("GlassDoor1", _G.PlayerAName)
        wait(.02)
        SawmillItems.Text = CountItemsF("Sawmill", _G.PlayerAName)
        wait(.02)
        Sawmill1Items.Text = CountItemsF("Sawmill2", _G.PlayerAName)
        wait(.02)
        Sawmill3Items.Text = CountItemsF("Sawmill3", _G.PlayerAName)
        wait(.02)
        Sawmill4Items.Text = CountItemsF("Sawmill4", _G.PlayerAName)
        wait(.02)
        Sawmill4LItems.Text = CountItemsF("Sawmill4L", _G.PlayerAName)
        wait(.02)
        StraightConveyorItems.Text = CountItemsF("StraightConveyor", _G.PlayerAName)
        wait(.02)
        TightTurnConveyorItems.Text = CountItemsF("TightTurnConveyor", _G.PlayerAName)
        wait(.02)
        TiltConveyorItems.Text = CountItemsF("TiltConveyor", _G.PlayerAName)
        wait(.02)
        LogSweeperItems.Text = CountItemsF("LogSweeper", _G.PlayerAName)
        wait(.02)
        ConveyorFunnelItems.Text = CountItemsF("ConveyorFunnel", _G.PlayerAName)
        wait(.02)
        ConveyorSupportsItems.Text = CountItemsF("ConveyorSupports", _G.PlayerAName)
        wait(.02)
        ConveyorSwitchItems.Text = CountItemsF("ConveyorSwitch", _G.PlayerAName)
        wait(.02)
        TightTurnConveyorSupportsItems.Text = CountItemsF("TightTurnConveyorSupports", _G.PlayerAName)
        wait(.02)
        StraightSwitchConveyorRightItems.Text = CountItemsF("StraightSwitchConveyorRight", _G.PlayerAName)
        wait(.02)
        StraightSwitchConveyorLeftItems.Text = CountItemsF("StraightSwitchConveyorLeft", _G.PlayerAName)
        wait(.02)
        WireItems.Text = CountItemsF("Wire", _G.PlayerAName)
        wait(.02)
        NeonWireRedItems.Text = CountItemsF("NeonWireRed", _G.PlayerAName)
        wait(.02)
        NeonWireOrangeItems.Text = CountItemsF("NeonWireOrange", _G.PlayerAName)
        wait(.02)
        NeonWireYellowItems.Text = CountItemsF("NeonWireYellow", _G.PlayerAName)
        wait(.02)
        NeonWireGreenItems.Text = CountItemsF("NeonWireGreen", _G.PlayerAName)
        wait(.02)
        NeonWireCyanItems.Text = CountItemsF("NeonWireCyan", _G.PlayerAName)
        wait(.02)
        NeonWireBlueItems.Text = CountItemsF("NeonWireBlue", _G.PlayerAName)
        wait(.02)
        NeonWireVioletItems.Text = CountItemsF("NeonWireViolet", _G.PlayerAName)
        wait(.02)
        NeonWireWhiteItems.Text = CountItemsF("NeonWireWhite", _G.PlayerAName)
        wait(.02)
        NeonWirePinkyItems.Text = CountItemsF("NeonWirePinky", _G.PlayerAName)
        wait(.02)
        IcicleWireAmberItems.Text = CountItemsF("IcicleWireAmber", _G.PlayerAName)
        wait(.02)
        IcicleWireRedItems.Text = CountItemsF("IcicleWireRed", _G.PlayerAName)
        wait(.02)
        IcicleWireGreenItems.Text = CountItemsF("IcicleWireGreen", _G.PlayerAName)
        wait(.02)
        IcicleWireBlueItems.Text = CountItemsF("IcicleWireBlue", _G.PlayerAName)
        wait(.02)
        IcicleWireMagentaItems.Text = CountItemsF("IcicleWireMagenta", _G.PlayerAName)
        wait(.02)
        IcicleWireHalloweenItems.Text = CountItemsF("IcicleWireHalloween", _G.PlayerAName)
        wait(.02)
        Lever0Items.Text = CountItemsF("Lever0", _G.PlayerAName)
        wait(.02)
        Button0Items.Text = CountItemsF("Button0", _G.PlayerAName)
        wait(.02)
        ChopSawItems.Text = CountItemsF("ChopSaw", _G.PlayerAName)
        wait(.02)
        PressurePlateItems.Text = CountItemsF("PressurePlate", _G.PlayerAName)
        wait(.02)
        SignalSustainItems.Text = CountItemsF("SignalSustain", _G.PlayerAName)
        wait(.02)
        LaserItems.Text = CountItemsF("Laser", _G.PlayerAName)
        wait(.02)
        LaserReceiverItems.Text = CountItemsF("LaserReceiver", _G.PlayerAName)
        wait(.02)
        HatchItems.Text = CountItemsF("Hatch", _G.PlayerAName)
        wait(.02)
        SignalInverterItems.Text = CountItemsF("GateNOT", _G.PlayerAName)
        wait(.02)
        GateORItems.Text = CountItemsF("GateOR", _G.PlayerAName)
        wait(.02)
        GateANDItems.Text = CountItemsF("GateAND", _G.PlayerAName)
        wait(.02)
        GateXORItems.Text = CountItemsF("GateXOR", _G.PlayerAName)
        wait(.02)
        WoodCheckerItems.Text = CountItemsF("WoodChecker", _G.PlayerAName)
        wait(.02)
        SignalDelayItems.Text = CountItemsF("SignalDelay", _G.PlayerAName)
        wait(.02)
        FireworkLauncherItems.Text = CountItemsF("FireworkLauncher", _G.PlayerAName)
        wait(.02)
        ClockSwitchItems.Text = CountItemsF("ClockSwitch", _G.PlayerAName)
        wait(.02)
        WorkLightItems.Text = CountItemsF("WorkLight", _G.PlayerAName)
        wait(.02)
        BagOfSandItems.Text = CountItemsF("BagOfSand", _G.PlayerAName)
        wait(.02)
        CanOfWormsItems.Text = CountItemsF("CanOfWorms", _G.PlayerAName)
        wait(.02)
        LightBulbItems.Text = CountItemsF("LightBulb", _G.PlayerAName)
        wait(.02)
        DynamiteItems.Text = CountItemsF("Dynamite", _G.PlayerAName)
        wait(.02)
        PumpkinClassicItems.Text = CountItemsF("PumpkinClassic", _G.PlayerAName)
        wait(.02)
        BlueBaiiItems.Text = CountItemsF("BlueBaii", _G.PlayerAName)
        wait(.02)
        BobbleheadItems.Text = CountItemsF("Bobblehead", _G.PlayerAName)
        wait(.02)
        SporkItems.Text = CountItemsF("Spork", _G.PlayerAName)
        wait(.02)
        CoalLumpItems.Text = CountItemsF("CoalLump", _G.PlayerAName)
        wait(.02)
        RedBallItems.Text = CountItemsF("RedBall", _G.PlayerAName)
        wait(.02)
        PumpkinDarkItems.Text = CountItemsF("PumpkinDark", _G.PlayerAName)
        wait(.02)
        Eye1Items.Text = CountItemsF("Eye1", _G.PlayerAName)
        wait(.02)
        TurkeyItems.Text = CountItemsF("Turkey", _G.PlayerAName)
        wait(.02)
        Bobblehead2Items.Text = CountItemsF("Bobblehead2", _G.PlayerAName)
        wait(.02)
        BlueBallItems.Text = CountItemsF("BlueBall", _G.PlayerAName)
        wait(.02)
        PumpkinGreenItems.Text = CountItemsF("PumpkinGreen", _G.PlayerAName)
        wait(.02)
        Turkey2Items.Text = CountItemsF("Turkey2", _G.PlayerAName)
        wait(.02)
        Bobblehead3Items.Text = CountItemsF("Bobblehead3", _G.PlayerAName)
        wait(.02)
        GreenBallItems.Text = CountItemsF("GreenBall", _G.PlayerAName)
        wait(.02)
        Bobblehead4Items.Text = CountItemsF("Bobblehead4", _G.PlayerAName)
        wait(.02)
        Bobblehead5Items.Text = CountItemsF("Bobblehead5", _G.PlayerAName)
        wait(.02)
        PumpkinCursedItems.Text = CountItemsF("PumpkinCursed", _G.PlayerAName)
        wait(.02)
        CanOfCranberryItems.Text = CountItemsF("CanOfCranberry", _G.PlayerAName)
        wait(.02)
        BagOfCandyItems.Text = CountItemsF("BagOfCandy", _G.PlayerAName)
        wait(.02)
        CandyItems.Text = CountItemsF("Candy", _G.PlayerAName)
        wait(.02)
        Turkey4Items.Text = CountItemsF("Turkey4", _G.PlayerAName)
        wait(.02)
        SnowballItems.Text = CountItemsF("Snowball", _G.PlayerAName)
        wait(.02)
        PlateItems.Text = CountItemsF("Plate", _G.PlayerAName)
        wait(.02)
        CocoaItems.Text = CountItemsF("Cocoa", _G.PlayerAName)
        wait(.02)
        CandyCaneItems.Text = CountItemsF("CandyCane", _G.PlayerAName)
        wait(.02)
        DuckItems.Text = CountItemsF("Duck", _G.PlayerAName)
        wait(.02)
        ConeItems.Text = CountItemsF("Cone", _G.PlayerAName)
        wait(.02)
        TobogganItems.Text = CountItemsF("Toboggan", _G.PlayerAName)
        wait(.02)
        ScoobisItems.Text = CountItemsF("Scoobis", _G.PlayerAName)
        wait(.02)
        PlumBallItems.Text = CountItemsF("PlumBall", _G.PlayerAName)
        wait(.02)
        YellowBallItems.Text = CountItemsF("YellowBall", _G.PlayerAName)
        wait(.02)
        PumpkinGhastlyItems.Text = CountItemsF("PumpkinGhastly", _G.PlayerAName)
        wait(.02)
        PumpkinLumbkinItems.Text = CountItemsF("PumpkinLumbkin", _G.PlayerAName)
        wait(.02)
        Turkey3Items.Text = CountItemsF("Turkey3", _G.PlayerAName)
        wait(.02)
        Bobblehead6Items.Text = CountItemsF("Bobblehead6", _G.PlayerAName)
        wait(.02)
        TealBallItems.Text = CountItemsF("TealBall", _G.PlayerAName)
        wait(.02)
        Bobblehead7Items.Text = CountItemsF("Bobblehead7", _G.PlayerAName)
        wait(.02)
        BlackBallItems.Text = CountItemsF("BlackBall", _G.PlayerAName)
        wait(.02)
        BurgerColaItems.Text = CountItemsF("BurgerCola", _G.PlayerAName)
        wait(.02)
        BowlItems.Text = CountItemsF("Bowl", _G.PlayerAName)
        wait(.02)
        Turkey5Items.Text = CountItemsF("Turkey5", _G.PlayerAName)
        wait(.02)
        BagOfCandy2Items.Text = CountItemsF("BagOfCandy2", _G.PlayerAName)
        wait(.02)
        TurkeyLegItems.Text = CountItemsF("TurkeyLeg", _G.PlayerAName)
        wait(.02)
        CandyCane2Items.Text = CountItemsF("CandyCane2", _G.PlayerAName)
        wait(.02)
        HatchetBookItems.Text = CountItemsF("HatchetBook", _G.PlayerAName)
        wait(.02)
        SpareTireItems.Text = CountItemsF("SpareTire", _G.PlayerAName)
        wait(.02)
        LumberBookItems.Text = CountItemsF("LumberBook", _G.PlayerAName)
        wait(.02)
        CandyCane3Items.Text = CountItemsF("CandyCane3", _G.PlayerAName)
        wait(.02)		
        PumpkinFlammaItems.Text = CountItemsF("PumpkinFlamma", _G.PlayerAName)
		wait(.02)
        IceCubeItems.Text = CountItemsF("IceCube", _G.PlayerAName)
		wait(.02)		
        BagOfCandy3Items.Text = CountItemsF("BagOfCandy3", _G.PlayerAName)
		wait(.02)
        HamLegItems.Text = CountItemsF("HamLeg", _G.PlayerAName)
		wait(.02)		
        PumpkinBorealItems.Text = CountItemsF("PumpkinBoreal", _G.PlayerAName)
		wait(.02)		
        BowlingPinItems.Text = CountItemsF("BowlingPin", _G.PlayerAName)
		wait(.02)		
        CGift_Sweet2016Items.Text = CountItemsF("2016CGift_Sweet", _G.PlayerAName)
		wait(.02)
		
		
		
end

end)

local Menus = {
[Axes] = Axesframe;
[Truck] = Truckframe;
[BoxedGifts] = Giftsframe;
[Paintings] = Paintingsframe;
[Furnishings] = Furnishingsframe;
[Glass] = Glassframe;
[conandsaw] = conandsawframe;
[wireobj] = wireobjframe;
[other] = otherframe;

}
for button,frame in pairs(Menus) do
	button.MouseButton1Click:connect(function()
		if frame.Visible then
			frame.Visible = false
			return
		end
		for k,v in pairs(Menus) do
			v.Visible = v == frame
		end
	end)
end



