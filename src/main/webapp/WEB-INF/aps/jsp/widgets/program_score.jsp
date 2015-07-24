<%@ taglib prefix="wp" uri="/aps-core" %>
	
<link rel="stylesheet" href="<wp:resourceURL/>static/css/test.css">
<link rel="stylesheet" href="<wp:resourceURL/>static/css/dashboard.css">


<div id="leftwrap">
    			<div id="tit_left"  ></div>
                <div id="tripsSummary">
        			<div id="score">
    					<div id="leftProg">
            				<div class="itemLeft" style="padding-left: 10px">
                                <div class="item_text">
                                	<!-- <div class="item_tit">Updated</div> -->
                                	<!-- <div class="item_value"></div> -->
									<span class="item_tit" style=" left: 10px; "> Updated </span>
									<span class="item_value" style="font-size: 20px; left: 10px"> 06/25/15 </span>
                                </div>
                                <img id="" style="left: 25px;" src="<wp:resourceURL/>static/img/disc_icon.png"/>
									
                            </div>
                            <div class="itemLeft">
                                <div class="item_text">
                                	<div class="item_tit">Events</div>
                                	<div class="item_value"></div>
                                </div>
                                <img id="score_events" src="<wp:resourceURL/>static/img/events_cia.png"/>
                            </div>
                            <div class="itemLeft">
                                <div class="item_text">
                                	<div class="item_tit">Trips</div>
                                	<div class="item_value">60</div>
                                </div>
                                <img id="score_trip" src="<wp:resourceURL/>static/img/trip_cia.png"/>
                            </div>
                        </div>
            			<div id="progress" >
							
                        </div>
						<div>
						
						</div>
    					<div id="rightProg">
                            <div class="itemRight">
                                <div class="item_text">
                                	<div class="item_tit">Miles</div>
                                	<div class="item_value"></div>
                                </div>
                                <img id="score_miles" src="<wp:resourceURL/>static/img/miles_cia.png"/>
                            </div>
                            <div class="itemRight">
                                <div class="item_text">
                                	<div class="item_tit">Days</div>
                                	<div class="item_value"></div>
                                </div>
                                <img id="score_days" src="<wp:resourceURL/>static/img/days_icon.png"/>								
                            </div>
                            <div class="itemRight">
                                <div class="item_text">
                                	<div class="item_tit">Hours</div>
                                	<div class="item_value"></div>
                                </div>
                                <img id="score_hours" src="<wp:resourceURL/>static/img/hours_cia.png"/>
                            </div>
                        </div>
        			</div>
                    <div class="clear"></div>
                </div>
            </div>