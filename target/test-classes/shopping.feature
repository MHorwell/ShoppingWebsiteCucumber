Feature: Registering to the shopping website
As a user who is not yet a member
I want to register with the shopping website
So that I can store my favourites

   Scenario Outline: Creating a new User
	Given that I am on the sign up page
	When put my email "<email>"
	And then I input "<title>" "<firstName>" "<lastName>" "<dob>" "<address>" "<city>" "<state>" "<zipCode>" "<phone>" "<password>"
	Then I will create my profile
   
Examples:
	|	title	|	firstName	|	lastName	|	dob	|	address	|	city	|	state	|	zipCode	|	phone	|	email	|	password	|
	|	Mr.	|	Zickan	|	Lapisscratcher	|	13 August 1955	|	Broken Castle Trail	|	Cragfall	|	Illinois	|	55082	|	07700 900200	|	Lapisscratcher.Zickan@gmail.com	|	ultrakey78	|
	|	Mr.	|	Zulwar	|	Smeltswitcher	|	3 October 1957	|	Roaming Giant Walk	|	Nightwood	|	Pennsylvania	|	07039	|	07700 900681	|	Smeltswitcher.Zulwar@gmail.com	|	greengrain99	|
	|	Mrs.	|	Wathig	|	Flintheart	|	28 April 1958	|	Adamantine Highway	|	Deadward	|	Kentucky	|	27529	|	07700 900750	|	Flintheart.Wathig@gmail.com	|	zanyseal99	|
	|	Mrs.	|	Duttlat	|	Pelletgazer	|	21 December 1961	|	Burning Walk	|	Swiftsummit	|	Colorado	|	33054	|	07700 900792	|	Pelletgazer.Duttlat@gmail.com	|	greatkey71	|
	|	Mrs.	|	Zattlen	|	Jewelteeth	|	20 February 1966	|	Whisper Way	|	Wildehallow	|	Hawaii	|	53402	|	07700 900233	|	Jewelteeth.Zattlen@gmail.com	|	ultrawave64	|
	|	Mrs.	|	Snandrad	|	Rubblemug	|	24 June 1968	|	White Street	|	Millhand	|	Alaska	|	27540	|	07700 900418	|	Rubblemug.Snandrad@gmail.com	|	bestmoon48	|
	|	Mr.	|	Wotrill	|	Coppergetter	|	24 October 1989	|	Plaintane Lane	|	Snakemouth	|	South Carolina	|	33594	|	07700 900079	|	Coppergetter.Wotrill@gmail.com	|	bestbaboon53	|
	|	Mrs.	|	Gadlars	|	Stonypresser	|	16 February 1990	|	Chania Way	|	Saltrun	|	Michigan	|	76039	|	07700 900463	|	Stonypresser.Gadlars@gmail.com	|	muddyyak86	|
	|	Mrs.	|	Ghuttla	|	Dirtfist	|	9 October 1997	|	Sinlams Pathway	|	Boulderbourne	|	Missouri	|	01902	|	07700 900523	|	Dirtfist.Ghuttla@gmail.com	|	megasky19	|
	|	Mr.	|	Zhaaktet	|	Alabasterchest	|	10 February 2001	|	Nokocord Path	|	Oceankeep	|	Virginia	|	11374	|	07700 900365	|	Alabasterchest.Zhaaktet@gmail.com	|	lumpyjewel23	|