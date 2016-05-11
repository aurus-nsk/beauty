
$( document ).ready(function() {
	
	//additional fields
	var priceForKg = 0.016;
	var currencyPurchase = $("c_com_beauty_domain_BeautyOrder_currency");
	var currencyDelivery = 39,38;
	
	//initialize
	var shopName = $("#c_com_beauty_domain_BeautyOrder_shopName");
	var productName = $("#c_com_beauty_domain_BeautyOrder_productName");
	var colour = $("c_com_beauty_domain_BeautyOrder_colour");
	var sizeName = $("c_com_beauty_domain_BeautyOrder_sizeName");
	var quantity = $("c_com_beauty_domain_BeautyOrder_quantity");
	var priceOrigin = $("c_com_beauty_domain_BeautyOrder_priceOrigin");
	var priceSaleOrg = $("c_com_beauty_domain_BeautyOrder_priceSaleOrg");
	var taxDollars = $("c_com_beauty_domain_BeautyOrder_taxDollars");
	var deliveryUSA = $("c_com_beauty_domain_BeautyOrder_deliveryUSA");
	var totalDollars = $("c_com_beauty_domain_BeautyOrder_totalDollars");
	var totalRubles = $("c_com_beauty_domain_BeautyOrder_totalRubles");
	var weight = $("c_com_beauty_domain_BeautyOrder_weight");
	var deliveryRussiaDollars = $("deliveryRussiaDollars");
	var deliveryRussiaRubles = $("c_com_beauty_domain_BeautyOrder_deliveryRussiaRubles");
	var totalSumDollars = $("c_com_beauty_domain_BeautyOrder_totalSumDollars");
	var totalSumRubles = $("c_com_beauty_domain_BeautyOrder_totalSumRubles");
	
	
	//click 
	//TODO: create function
	totalDollars.val( (Number(quantity.val()) * Number(priceSaleOrg.val())) + Number(taxDollars.val()) + Number(deliveryUSA.val()) );
	totalRubles.val( Number(totalDollars.val()) * Number(currencyPurchase.val()) );
	deliveryRussiaDollars.val( Number(weight.val()) * Number(priceForKg) );
	deliveryRussiaRubles.val( Number(deliveryRussiaDollars.val()) * Number(currencyDelivery));
	totalSumDollars.val( Number(totalDollars.val()) + Number(deliveryRussiaDollars.val()) );
	totalSumRubles.val( Number(totalRubles.val()) + Number(deliveryRussiaRubles.val()) );
	
	/* TODO: add listener
	$("#other").click(function() {
		  $( ".target" ).change();
	});
	*/ 
});