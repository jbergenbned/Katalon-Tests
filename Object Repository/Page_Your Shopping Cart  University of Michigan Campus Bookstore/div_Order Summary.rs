<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Order Summary</name>
   <tag></tag>
   <elementGuidId>81f936d1-d183-41c9-8a7d-5081b8f850bf</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.bned-cart-header-row.bned-cart-totals-wp</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='text.addToCart'])[1]/following::div[5]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>bned-cart-header-row bned-cart-totals-wp</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

    
        
    
        Order Summary
        
            
                
                    
                        Subtotal
                    
                        $28.95
                
                
                        Shipping
                        
                            $14.00
                    
                
                        
                            Taxes
                        
                            $0.84
                    
                
        
    


        
            Estimated Total
        
            $43.79
    

    &lt;div class=&quot;row&quot;>
        &lt;div class=&quot;col-xs-6 cart-totals-left&quot;>Subtotal&lt;/div>
        &lt;div class=&quot;col-xs-6 cart-totals-right text-right&quot;>
             {{= subTotal.formattedValue}}&lt;/div>


        {{if deliveryCost}}
            &lt;div class=&quot;col-xs-6 cart-totals-left&quot;>Shipping&lt;/div>
            &lt;div class=&quot;col-xs-6 cart-totals-right text-right&quot;>
                {{if deliveryCost.value > 0}}
                    {{= deliveryCost.formattedValue}}
                {{else}}
                    FREE
                {{/if}}
            &lt;/div>
         {{/if}}


        {{if net &amp;&amp; totalTax.value > 0}}
            &lt;div class=&quot;col-xs-6 cart-totals-left&quot;>Taxes&lt;/div>
            &lt;div class=&quot;col-xs-6 cart-totals-right text-right&quot;>{{= totalTax.formattedValue}}&lt;/div>
        {{/if}}

		{{if quoteData }}
			
		{{/if}}

		{{if quoteDiscounts.value > 0}}
			&lt;div class=&quot;col-xs-6 cart-totals-left discount&quot;>
				Quote Discount&lt;/div>
			&lt;div class=&quot;col-xs-6 cart-totals-right text-right discount&quot;>
				TBD&lt;/div>
		{{/if}}

		{{if totalDiscounts.value > 0}}
			&lt;div class=&quot;col-xs-6 cart-totals-left discount&quot;>
				Order Discounts&lt;/div>
			&lt;div class=&quot;col-xs-6 cart-totals-right text-right discount&quot;>
				TBD&lt;/div>
		{{/if}}

        &lt;div class=&quot;col-xs-6 cart-totals-left grand-total&quot;>Order Total&lt;/div>
        &lt;div class=&quot;col-xs-6 cart-totals-right text-right grand-total&quot;>
            
            {{if net}}
                {{= totalPriceWithTax.formattedValue}}
            {{else}}
                {{= totalPrice.formattedValue}}
            {{/if}}
            &lt;/div>


       {{if !net}}
            &lt;div class=&quot;cart-totals-taxes text-right&quot;>
                Your order includes {{= totalTax.formattedValue}} tax.&lt;/div>
        {{/if}}


       {{if net &amp;&amp; totalTax.value &lt;= 0}}
            &lt;div class=&quot;cart-totals-taxes text-right&quot;>
                *No taxes are included in the total&lt;/div>
        {{/if}}
    &lt;/div>






    
        
                        Proceed To Checkout
                

    
        
    
        
            
                    
                        Enter Promo Code
                    
                            Add
                    
                
                        
            



    





    
        
            If questions or need help please call our customer support experts at 1-800-123-4567
        
            Please note: Final shipping fees and tax will be calculated at checkout. You may receive your order in multiple shipments from different locations. We accept credit / debit cards and PayPal.
        
            [FPO checkout message]
    
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;page-cartPage pageType-ContentPage template-pages-CartPageTemplate pageLabel-cart smartedit-page-uid-cartPage smartedit-page-uuid-eyJpdGVtSWQiOiJjYXJ0UGFnZSIsImNhdGFsb2dJZCI6Im1hc3RlckNvbnRlbnRDYXRhbG9nIiwiY2F0YWxvZ1ZlcnNpb24iOiJPbmxpbmUifQ== smartedit-catalog-version-uuid-masterContentCatalog/Online  language-en&quot;]/main[1]/div[@class=&quot;main__inner-wrapper&quot;]/div[@class=&quot;container&quot;]/div[4]/div[@class=&quot;bned-cart-body-container&quot;]/div[@class=&quot;bned-cart-totals-container&quot;]/div[@class=&quot;yCmsComponent yComponentWrapper&quot;]/div[@class=&quot;bned-cart-header-row bned-cart-totals-wp&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='text.addToCart'])[1]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Hours'])[1]/following::div[16]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[4]/div/div[2]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
